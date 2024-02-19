package com.lenolnmuniz.certification.modules.students.use_cases;

import java.util.List;

import com.lenolnmuniz.certification.modules.questions.entities.QuestionEntity;
import com.lenolnmuniz.certification.modules.questions.repositories.QuestionRepository;
import com.lenolnmuniz.certification.modules.students.dto.StudentCertificationAnswerDTO;
import com.lenolnmuniz.certification.modules.students.repositories.StudentRepository;

public class StudentCertificationAnswersUseCase {
    
    private final StudentRepository studentRepository;
    private final QuestionRepository questionRepository;

    public StudentCertificationAnswersUseCase(StudentRepository studentRepository, QuestionRepository questionRepository){
        this.studentRepository = studentRepository;
        this.questionRepository = questionRepository;
    }
        
    public void execute(StudentCertificationAnswerDTO dto) throws Exception {
        var student = studentRepository.findByEmail(dto.getEmail());
         
        if(student.isEmpty()) {
            throw new Exception("E-mail do estudante incorreto.");
        }
    }


}
