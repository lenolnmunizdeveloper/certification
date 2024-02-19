package com.lenolnmuniz.certification.modules.questions.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.lenolnmuniz.certification.modules.questions.entities.QuestionEntity;
import com.lenolnmuniz.certification.modules.questions.repositories.QuestionRepository;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    private final QuestionRepository questionRepository;
    
    public QuestionController(QuestionRepository questionRepository){
        this.questionRepository = questionRepository;
    }

    @GetMapping("/technology/{technology}")
    public List<QuestionEntity> findByTechnology(@PathVariable String technology){
        
        var result = this.questionRepository.findByTechnology(technology);
        
        return result.stream().toList();
        
    }
    
}
