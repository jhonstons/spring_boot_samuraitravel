package com.example.samuraitravel.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "reviews")
public class Review {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id")
	 private Integer id;
	 
	 @Column(name = "house_id")
	 private Integer houseId;
	 	 	 
	 @Column(name = "user_id")
	 private Integer userId;

	 @Column(name = "review_rating")
	 private Integer rating;

	 @Column(name = "review_date")
	 private LocalDate reviewDate;

	 @Column(name = "review_comment")
	 private String comment;
}
