package com.example.samuraitravel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.samuraitravel.model.Review;
import com.example.samuraitravel.service.ReviewService;

 @Controller
 @RequestMapping("/innDetail")
public class ReviewController {

	@Autowired
	private ReviewService reviewService;
	
	@GetMapping("/{innId}")
	public String showInnDetail(@PathVariable Long innId, Model model) {
		List<Review> reviews = reviewService.getReviewsByInnId(innId);
		model.addAttribute("reviews", reviews);
		return "innDetail";
	}
	 
	@PostMapping("/submitReview")
	public String submitReview(@ModelAttribute Review review) {
		reviewService.saveReview(review);
		return "redirect:/innDetail/" + review.getInnId();
	}
	
	@GetMapping("/editReview/{reviewId}")
	public String editReview(@PathVariable Long reviewId, Model model) {
		Review review = reviewService.getReviewById(reviewId);
		model.addAttribute("review", review);
		return "editReview";
	}
	
	@PostMapping("/updateReview")
	public String updateReview(@ModelAttribute Review review) {
		reviewService.updateReview(review);		
		return "redirect:/innDetail/" + review.getInnId();
	}
	
	@PostMapping("/deleteReview/{reviewId}")
	public String deleteReview(@PathVariable Long reviewId) {
		Review review = reviewService.getReviewById(reviewId);
		reviewService.deleteReview(reviewId);
		return "redirect:/innDetail/" + review.getInnId();
	}
}
