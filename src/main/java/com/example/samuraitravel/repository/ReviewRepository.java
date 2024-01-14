package com.example.samuraitravel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.samuraitravel.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {
	List<Review> findByInnId(long innId);
}
