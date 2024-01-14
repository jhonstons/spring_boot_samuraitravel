package com.example.samuraitravel.service;

import java.util.List;

import com.example.samuraitravel.model.Review;

public interface ReviewService {
	List<Review> getReviewsByInnId(Long innId);
	void saveReview(Review review);
	Review getReviewById(Long reviewId);
	void updateReview(Review review);
	void deleteReview(Long reviewId);
	
}

