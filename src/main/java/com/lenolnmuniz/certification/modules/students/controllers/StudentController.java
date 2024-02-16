package com.lenolnmuniz.certification.modules.students.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.lenolnmuniz.certification.modules.students.dto.VerifyHasCertificationDTO;
import com.lenolnmuniz.certification.modules.students.use_cases.VerifyIfHasCertificationUseCase;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/students")
public class StudentController {
    
    private final VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase;

    public StudentController(VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase) {
        this.verifyIfHasCertificationUseCase = verifyIfHasCertificationUseCase;
    }
    
    @PostMapping("/verifyIfHasCertification")
    public String verifyIfHasCertification(@RequestBody VerifyHasCertificationDTO verifyHasCertificationDTO) {
        var result = this.verifyIfHasCertificationUseCase.execute(verifyHasCertificationDTO);
        if(result) {
            return "Usuário já fez a prova";
        }
        return "Usuário pode fazer a prova.";
    }

}
