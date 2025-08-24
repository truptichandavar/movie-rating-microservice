package com.trupti.movie.catalogue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.trupti.movie.catalogue.model.UserResponse;
import com.trupti.movie.catalogue.service.CatalogueService;

@RestController
public class CatalogueController {
	
	@Autowired
	CatalogueService service;
	
	@GetMapping("/movie-catalogue/{userId}")
	@HystrixCommand(fallbackMethod = "fetchCatalogueFallBack")
	public UserResponse fetchCatalogue(@PathVariable("userId") String userId) {
		return service.fetchUserDetails(userId);
	}
	
	public UserResponse fetchCatalogueFallBack(@PathVariable("userId") String userId) {
		UserResponse rs = new UserResponse();
		return rs;
	}

}
