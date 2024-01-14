package com.example.samuraitravel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

 @Entity
public class Review {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 private Long userId;
	 private Long innId;
	 private int rating;
	 private String Comment;
	 
	 public Long getInnId() {
		 return innId;
	 }
	 
	 public void setInnId(Long innId) {
		 this.innId = innId;
	 }
}
