package com.trupti.userprofile.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user", schema = "m-catalogue")
public class UserEntity {
	@Id
	private String uId;
	private String uName;
	private String movieList;
	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getMovieList() {
		return movieList;
	}
	public void setMovieList(String movieList) {
		this.movieList = movieList;
	}
	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserEntity(String uId, String uName, String movieList) {
		super();
		this.uId = uId;
		this.uName = uName;
		this.movieList = movieList;
	}
}
