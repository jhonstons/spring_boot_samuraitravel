package com.example.samuraitravel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.samuraitravel.model.Review;
import com.example.samuraitravel.repository.ReviewRepository;

 @Service
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	private ReviewRepository reviewRepository;
	
	@Override
	public List<Review> getReviewsByInnId(Long innId) {
		// データベースクエリを呼び出す
		return reviewRepository.findByInnId(innId);
	}

	@Override
	public void saveReview(Review review) {
		// データベースの保存処理を行う
		reviewRepository.save(review);
	}

	@Override
	public Review getReviewById(Long reviewId) {
		// データベースクエリを呼び出す
		return reviewRepository.findById(reviewId).orElse(null) ;
	}

	@Override
	public void updateReview(Review review) {
		// データベース更新処理
		reviewRepository.save(review);
	}

	@Override
	public void deleteReview(Long reviewId) {
		// データベースからの削除処理
		reviewRepository.deleteById(reviewId);
	}
}
