package com.trupti.movie.catalogue.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.trupti.movie.catalogue.model.UserResponse;

@Service
public class CatalogueService {
	
	@Autowired
	RestTemplate restTemplate;
	
	public UserResponse fetchUserDetails(String userId) {
		System.out.println("***userID***"+userId);
		return restTemplate.getForObject("http://user-profile/getUser/"+userId, UserResponse.class);
	}

}
