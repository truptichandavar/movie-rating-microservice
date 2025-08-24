package com.trupti.moviedata.model;

public class MovieSummary {
	private String title;
	private String overview;
	private String voteAverage;
	public String getVoteAverage() {
		return voteAverage;
	}
	public void setVoteAverage(String voteAverage) {
		this.voteAverage = voteAverage;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "MovieSummary [title=" + title + ", overview=" + overview + ", voteAverage=" + voteAverage + "]";
	}
	public MovieSummary(String title, String overview, String voteAverage) {
		super();
		this.title = title;
		this.overview = overview;
		this.voteAverage = voteAverage;
	}
	public MovieSummary() {
		super();
		// TODO Auto-generated constructor stub
	}

}
