package com.lenolnmuniz.certification.modules.students.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.lenolnmuniz.certification.modules.students.dto.StudentCertificationAnswerDTO;
import com.lenolnmuniz.certification.modules.students.dto.VerifyHasCertificationDTO;
import com.lenolnmuniz.certification.modules.students.use_cases.StudentCertificationAnswersUseCase;
import com.lenolnmuniz.certification.modules.students.use_cases.VerifyIfHasCertificationUseCase;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/students")
public class StudentController {
    
    private final VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase;
    private final StudentCertificationAnswersUseCase studentCertificationAnswersUseCase;
    
    public StudentController(VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase, StudentCertificationAnswersUseCase studentCertificationAnswersUseCase) {
        this.verifyIfHasCertificationUseCase = verifyIfHasCertificationUseCase;
        this.studentCertificationAnswersUseCase = studentCertificationAnswersUseCase;
    }
    
    @PostMapping("/verifyIfHasCertification")
    public String verifyIfHasCertification(@RequestBody VerifyHasCertificationDTO verifyHasCertificationDTO) {
        var result = this.verifyIfHasCertificationUseCase.execute(verifyHasCertificationDTO);
        if(result) {
            return "Usuário já fez a prova";
        }
        return "Usuário pode fazer a prova.";
    }

    @PostMapping("/certification/answer")
    public ResponseEntity<Object> certificationAnswer(@RequestBody StudentCertificationAnswerDTO studentCertificationAnswerDTO) {
        try {
            var result = studentCertificationAnswersUseCase.execute(studentCertificationAnswerDTO);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
