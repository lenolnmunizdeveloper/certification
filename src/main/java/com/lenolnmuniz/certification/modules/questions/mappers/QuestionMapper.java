package com.lenolnmuniz.certification.modules.questions.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.lenolnmuniz.certification.modules.questions.dto.AlternativesResultDTO;
import com.lenolnmuniz.certification.modules.questions.dto.QuestionResultDTO;
import com.lenolnmuniz.certification.modules.questions.entities.AlternativesEntity;
import com.lenolnmuniz.certification.modules.questions.entities.QuestionEntity;

@Component
public class QuestionMapper {
    public QuestionResultDTO convertQuestionEntityToDTO(QuestionEntity question) {
        var questionResultDTO = QuestionResultDTO.builder()
                                                 .id(question.getId())
                                                 .technology(question.getTechnology())
                                                 .description(question.getDescription())
                                                 .build();

        List<AlternativesResultDTO> alternativesResultDTOs = 
        question.getAlternatives()
        .stream()
        .map(this::convertAlternativeEntityToDTO)
        .collect(Collectors.toList());

        questionResultDTO.setAlternatives(alternativesResultDTOs);
        return questionResultDTO;
    }

    public AlternativesResultDTO convertAlternativeEntityToDTO(AlternativesEntity alternativeResultDTO) {
        return AlternativesResultDTO.builder()
                                    .id(alternativeResultDTO.getId())
                                    .description(alternativeResultDTO.getDescription())
                                    .build();
    }
}
