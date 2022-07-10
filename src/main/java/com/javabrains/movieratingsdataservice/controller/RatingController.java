package com.javabrains.movieratingsdataservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javabrains.movieratingsdataservice.models.Ratings;
import com.javabrains.movieratingsdataservice.models.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingController {
	
	@RequestMapping("/{movieId}")
	public Ratings getRating(@PathVariable String movieId) {
		return new Ratings(movieId, 3);
	}
	
	@RequestMapping("/users/{userId}")
	public UserRating getUserRatings(@PathVariable String userId){
		List<Ratings> ratings = Arrays.asList(
				new Ratings("550", 4), 
				new Ratings("711", 3), 
				new Ratings("100", 5));
        UserRating userRating = new UserRating();
        userRating.setUserId(userId);
        userRating.setUserRating(ratings);
		return userRating;
		
	}

}
