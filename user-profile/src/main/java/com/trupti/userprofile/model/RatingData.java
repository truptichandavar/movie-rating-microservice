package com.trupti.userprofile.model;

public class RatingData {
	
	private Integer movieId;
	private String name;
	private String desc;
	private double rating;
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public RatingData(Integer movieId, String name, String desc, double rating) {
		super();
		this.movieId = movieId;
		this.name = name;
		this.desc = desc;
		this.rating = rating;
	}
	public RatingData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
