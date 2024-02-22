package com.lenolnmuniz.certification.modules.questions.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lenolnmuniz.certification.modules.questions.entities.QuestionEntity;

@Repository
public interface QuestionRepository extends JpaRepository<QuestionEntity, UUID> {
    
    List<QuestionEntity> findByTechnology(String technology);
}
