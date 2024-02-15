package com.lenolnmuniz.certification.modules.students.useCases;

import org.springframework.stereotype.Service;

import com.lenolnmuniz.certification.modules.students.dto.VerifyHasCertificationDTO;

@Service
public class VerifyIfHasCertificationUseCase {

    public boolean execute(VerifyHasCertificationDTO dto){
        if(dto.getEmail().equals("lenoln@lenoln.com") && dto.getTech().equals("JAVA")){
            return true;
        }
        return false;
    }
    
}
