package com.lenolnmuniz.certification.modules.certifications.use_cases;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lenolnmuniz.certification.modules.students.entities.CertificationStudentEntity;
import com.lenolnmuniz.certification.modules.students.repositories.CertificationStudentRepository;

@Service
public class Top10RankingUseCase {
    
    private final CertificationStudentRepository certificationStudentRepository;

    public Top10RankingUseCase(CertificationStudentRepository certificationStudentRepository){
        this.certificationStudentRepository = certificationStudentRepository;
    }

    public List<CertificationStudentEntity> execute(){
        return this.certificationStudentRepository.findTop10ByOrderByGradeDesc();
    }
}
