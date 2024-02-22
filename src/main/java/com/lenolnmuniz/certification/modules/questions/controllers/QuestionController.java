package com.lenolnmuniz.certification.modules.questions.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.lenolnmuniz.certification.modules.questions.dto.AlternativesResultDTO;
import com.lenolnmuniz.certification.modules.questions.dto.QuestionResultDTO;
import com.lenolnmuniz.certification.modules.questions.entities.AlternativesEntity;
import com.lenolnmuniz.certification.modules.questions.entities.QuestionEntity;
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
    
    public QuestionController(QuestionRepository questionRepository){
        this.questionRepository = questionRepository;
    }

    @GetMapping("/technology/{technology}")
    public List<QuestionResultDTO> findByTechnology(@PathVariable String technology){
        
        var result = this.questionRepository.findByTechnology(technology);
        
        return result.stream().map(QuestionController::mapQuestionResultToDTO)
        .collect(Collectors.toList());
    }

    static QuestionResultDTO mapQuestionResultToDTO(QuestionEntity question) {
        var questionResultDTO = QuestionResultDTO.builder()
        .id(question.getId())
        .technology(question.getTechnology())
        .description(question.getDescription())
        .build();

        List<AlternativesResultDTO> alternativesResultDTOs = question.getAlternatives()
        .stream()
        .map(QuestionController::mapAlternativesDTO)
        .collect(Collectors.toList());

        questionResultDTO.setAlternatives(alternativesResultDTOs);

        return questionResultDTO;

    }

    static AlternativesResultDTO mapAlternativesDTO(AlternativesEntity alternativesResultDTO) {
        return AlternativesResultDTO.builder()
        .id(alternativesResultDTO.getId())
        .description(alternativesResultDTO.getDescription())
        .build();
    }
    
}
