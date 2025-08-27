package com.trupti.userprofile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.trupti.userprofile.dao.UserEntity;
import com.trupti.userprofile.model.UserResponse;
import com.trupti.userprofile.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	private UserRepo repo;
	
	@Autowired
	private MovieService mService;

	public UserResponse fetchUser(String uId) {
		UserEntity uEntity = repo.findById(uId).orElse(new UserEntity());
		
		UserResponse res = new UserResponse();
		res.setUserId(uEntity.getuId());
		res.setUserName(uEntity.getuName());
		res.setMovies(mService.fetchMovies(uEntity.getMovieList()));
		System.out.println("---res.getUserName()----"+res.getUserName());
		return res;
	}

		
}
