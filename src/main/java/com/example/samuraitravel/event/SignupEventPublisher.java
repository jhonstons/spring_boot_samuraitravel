package com.example.samuraitravel.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.example.samuraitravel.entity.User;

 @Component
public class SignupEventPublisher {
	 private final ApplicationEventPublisher applicationEventPublisher;
	 
	 public SignupEventPublisher(ApplicationEventPublisher applicationEvenrPublisher) {
		 this.applicationEventPublisher = applicationEvenrPublisher; 
	 }
	 
	 public void publishSignupEvent(User user, String requestUrl) {
		 applicationEventPublisher.publishEvent(new SignupEvent(this, user, requestUrl));
	 }
}
