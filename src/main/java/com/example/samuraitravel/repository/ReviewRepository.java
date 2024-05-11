package com.example.samuraitravel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.samuraitravel.model.ReviewModel;

public interface ReviewRepository extends JpaRepository<ReviewModel, Long> {
	List<ReviewModel> findByInnId(long innId);
}
