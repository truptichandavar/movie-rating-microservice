package com.trupti.moviedata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.trupti.moviedata.model.RatingData;
import com.trupti.moviedata.service.RatingService;

@RestController
public class RatingDataController {
	
	@Autowired
	private RatingService service;

	@GetMapping("/getRating/{movieId}")
	public RatingData getRating(@PathVariable("movieId") Integer movieId) {
		RatingData rd = service.fetchRatings(movieId);		
		return rd;
	}
}
