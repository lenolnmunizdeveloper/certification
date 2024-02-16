package com.lenolnmuniz.certification.modules.questions.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.lenolnmuniz.certification.modules.questions.dto.QuestionResultDTO;
import com.lenolnmuniz.certification.modules.questions.mappers.QuestionMapper;
import com.lenolnmuniz.certification.modules.questions.repositories.QuestionRepository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    private final QuestionRepository questionRepository;
    private final QuestionMapper questionMapper;

    public QuestionController(QuestionRepository questionRepository,QuestionMapper questionMapper){
        this.questionRepository = questionRepository;
        this.questionMapper = questionMapper;
    }

    @GetMapping("/technology/{technology}")
    public List<QuestionResultDTO> findByTechnology(@PathVariable String technology){
        
        var result = this.questionRepository.findByTechnology(technology);
        
        return result.stream().map(questionMapper::convertQuestionEntityToDTO).collect(Collectors.toList());
        
    }
    
}
