package com.lenolnmuniz.certification.modules.students.use_cases;

import org.springframework.stereotype.Service;

import com.lenolnmuniz.certification.modules.students.dto.VerifyHasCertificationDTO;
import com.lenolnmuniz.certification.modules.students.repositories.CertificationStudentRepository;

@Service
public class VerifyIfHasCertificationUseCase {

    private final CertificationStudentRepository certificationStudentRepository;

    public VerifyIfHasCertificationUseCase(CertificationStudentRepository certificationStudentRepository){
        this.certificationStudentRepository = certificationStudentRepository;
    }

    public boolean execute(VerifyHasCertificationDTO dto) {
        var result = this.certificationStudentRepository.findByStudentEmailAndTechnology(dto.getEmail(), dto.getTech());
        return !result.isEmpty();
    }
    
}
