package com.trupti.movie.catalogue.model;

import java.util.List;

public class UserResponse {
	
	private String userId;
	private String userName;
	private List<RatingData> movies;
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
	public List<RatingData> getMovies() {
		return movies;
	}
	public void setMovies(List<RatingData> movies) {
		this.movies = movies;
	}
	

}
