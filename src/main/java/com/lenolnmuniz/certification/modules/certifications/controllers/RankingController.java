package com.lenolnmuniz.certification.modules.certifications.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;

import com.lenolnmuniz.certification.modules.certifications.use_cases.Top10RankingUseCase;
import com.lenolnmuniz.certification.modules.students.entities.CertificationStudentEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/ranking")
public class RankingController {

    private Top10RankingUseCase top10RankingUseCase;

    public RankingController(Top10RankingUseCase top10RankingUseCase){
        this.top10RankingUseCase = top10RankingUseCase;
    }
    
    @GetMapping("/top10")
    public List<CertificationStudentEntity> top10() {
        return this.top10RankingUseCase.execute();
    }
}
