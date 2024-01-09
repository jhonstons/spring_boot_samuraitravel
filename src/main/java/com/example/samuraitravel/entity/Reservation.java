package com.example.samuraitravel.entity;

import java.sql.Timestamp;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "reservations")
@Data
public class Reservation {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id")
	 private Integer id;
	 
	 @ManyToOne
	 @JoinColumn(name = "house_id")
	 private House house;

	 @ManyToOne
	 @JoinColumn(name = "user_id")
	 private User user;

	 @Column
	 @JoinColumn(name = "checkin_date")
	 private LocalDate checkinDate;

	 @Column
	 @JoinColumn(name = "checkout_date")
	 private LocalDate checkoutDate;

	 @Column
	 @JoinColumn(name = "number_of_people")
	 private LocalDate numberOfPeople;

	 @Column
	 @JoinColumn(name = "amount")
	 private LocalDate amount;

	 @Column
	 @JoinColumn(name = "created_at", insertable = false, updatable = false)
	 private Timestamp createdAt;

	 @Column
	 @JoinColumn(name = "created_at", insertable = false, updatable = false)
	 private Timestamp updatedAt;
	 
}
