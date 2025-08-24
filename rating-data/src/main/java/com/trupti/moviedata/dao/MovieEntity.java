package com.trupti.moviedata.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie", schema = "m-catalogue")
public class MovieEntity {
	@Id
	private Integer mId;
	private String mName;
	private String desc;
	private double rating;
	public Integer getmId() {
		return mId;
	}
	public void setmId(Integer mId) {
		this.mId = mId;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
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
	public MovieEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MovieEntity(Integer mId, String mName, String desc, double rating) {
		super();
		this.mId = mId;
		this.mName = mName;
		this.desc = desc;
		this.rating = rating;
	}
}
