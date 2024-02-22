package com.lenolnmuniz.certification.modules.students.use_cases;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lenolnmuniz.certification.modules.questions.entities.AlternativesEntity;
import com.lenolnmuniz.certification.modules.questions.entities.QuestionEntity;
import com.lenolnmuniz.certification.modules.questions.repositories.QuestionRepository;
import com.lenolnmuniz.certification.modules.students.dto.StudentCertificationAnswerDTO;

@Service
public class StudentCertificationAnswersUseCase {

    private final QuestionRepository questionRepository;
    
    public StudentCertificationAnswersUseCase(
        QuestionRepository questionRepository){
        this.questionRepository = questionRepository;
        
    }
        
    public StudentCertificationAnswerDTO execute(StudentCertificationAnswerDTO dto) {
        List<QuestionEntity> questionsEntity = questionRepository.findByTechnology(dto.getTechnology());
    
        dto.getQuestionsAnswers().stream().forEach(questionAnswer -> {
            var question = questionsEntity.stream().filter(qst -> qst.getId().equals(questionAnswer.getQuestionID())).findFirst().get();
            var findCorrectAlternative = question.getAlternatives().stream().filter(AlternativesEntity::isCorrect).findFirst().get();
            if(findCorrectAlternative.getId().equals(questionAnswer.getAlternativeID())) questionAnswer.setCorrect(true);
        
        
        });

        
        return dto;
    }

}