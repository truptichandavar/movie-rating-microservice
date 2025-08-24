package com.trupti.userprofile.model;

import java.util.List;

public class User {
	
	private String userId;
	private String userName;
	private List<Integer> movieIds;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<Integer> getMovieIds() {
		return movieIds;
	}
	public void setMovieIds(List<Integer> movieIds) {
		this.movieIds = movieIds;
	}
	public User(String userId, String userName, List<Integer> movieIds) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.movieIds = movieIds;
	}
	
	
	

}
