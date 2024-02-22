package com.lenolnmuniz.certification.modules.students.use_cases;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.lenolnmuniz.certification.modules.students.entities.AnswersCertificationsEntity;
import com.lenolnmuniz.certification.modules.students.entities.CertificationStudentEntity;
import com.lenolnmuniz.certification.modules.students.entities.StudentEntity;
import com.lenolnmuniz.certification.modules.students.repositories.CertificationStudentRepository;
import com.lenolnmuniz.certification.modules.students.repositories.StudentRepository;
import com.lenolnmuniz.certification.modules.questions.entities.AlternativesEntity;
import com.lenolnmuniz.certification.modules.questions.entities.QuestionEntity;
import com.lenolnmuniz.certification.modules.questions.repositories.QuestionRepository;
import com.lenolnmuniz.certification.modules.students.dto.StudentCertificationAnswerDTO;
import com.lenolnmuniz.certification.modules.students.dto.VerifyHasCertificationDTO;

@Service
public class StudentCertificationAnswersUseCase {

    private final QuestionRepository questionRepository;
    private final StudentRepository studentRepository;
    private final CertificationStudentRepository certificationStudentRepository;
    private final VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase;

    public StudentCertificationAnswersUseCase(
        QuestionRepository questionRepository, 
        StudentRepository studentRepository,
        CertificationStudentRepository certificationStudentRepository,
        VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase){
        this.questionRepository = questionRepository;
        this.studentRepository = studentRepository;
        this.certificationStudentRepository = certificationStudentRepository;
        this.verifyIfHasCertificationUseCase = verifyIfHasCertificationUseCase;
    }

   
        
    public CertificationStudentEntity execute(StudentCertificationAnswerDTO dto) throws Exception {
        List<QuestionEntity> questionsEntity = questionRepository.findByTechnology(dto.getTechnology());
        List<AnswersCertificationsEntity> answersCertifications = new ArrayList<>();
        
        AtomicInteger correctAnswers = new AtomicInteger(0);
        
        var hasCertification = this.verifyIfHasCertificationUseCase.execute(new VerifyHasCertificationDTO(dto.getEmail(), dto.getTechnology()));
        
        if(hasCertification) throw new Exception("Você já tirou sua certificação.");
        
        dto.getQuestionsAnswers().stream().forEach(questionAnswer -> {
            var question = questionsEntity.stream().filter(qst -> qst.getId().equals(questionAnswer.getQuestionID())).findFirst().get();
            var findCorrectAlternative = question.getAlternatives().stream().filter(AlternativesEntity::isCorrect).findFirst().get();
            if(findCorrectAlternative.getId().equals(questionAnswer.getAlternativeID())) {
                questionAnswer.setCorrect(true);
                correctAnswers.incrementAndGet();
            }
        
            // Add answers certification
            var answersCertificationsEntity = AnswersCertificationsEntity.builder()
            .answerID(questionAnswer.getAlternativeID())
            .questionID(questionAnswer.getQuestionID())
            .isCorrect(questionAnswer.isCorrect())
            .build();

            answersCertifications.add(answersCertificationsEntity);
        });
        
        //Verify if exists student by email
        var student = studentRepository.findByEmail(dto.getEmail());
        UUID studentID; 
        if(student.isEmpty()){
            var studentCreated = StudentEntity.builder().email(dto.getEmail()).build();
            studentRepository.save(studentCreated);
            studentID = studentCreated.getId();
        } else {
            studentID = student.get().getId();
        }

        //Save info's certification
        CertificationStudentEntity certificationStudentEntity =
        CertificationStudentEntity.builder()
        .technology(dto.getTechnology())
        .studentId(studentID)
        .grade(correctAnswers.get())
        .build();

        var certificationStudentCreated = certificationStudentRepository.save(certificationStudentEntity);
         
        answersCertifications.stream().forEach(answerCertification -> {
            answerCertification.setCertificationID(certificationStudentEntity.getId());
            answerCertification.setCertificationStudentEntity(certificationStudentEntity);
        });

        certificationStudentEntity.setAnswersCertificationsEntities(answersCertifications);

        certificationStudentRepository.save(certificationStudentEntity);

        return certificationStudentCreated;
    }

}