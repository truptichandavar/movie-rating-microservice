package com.trupti.userprofile.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.trupti.userprofile.model.RatingData;

@Service
public class MovieService {
	
	@Autowired
	RestTemplate restTemplate;

	//@HystrixCommand(fallbackMethod = "fetchMoviesFallBack")
	public List<RatingData> fetchMovies(String movieListStr) {
		System.out.println("****movieListStr****"+movieListStr);
		List<Integer> movieIdList = Stream.of(movieListStr.split(","))
				.map(Integer::valueOf).collect(Collectors.toList());
		
		List<RatingData> ratingList = movieIdList.stream()
				.map(id -> restTemplate.getForObject("http://rating-data/getRating/"+id, RatingData.class))
				.collect(Collectors.toList());
		System.out.println("******ratingList*****"+ratingList);
		return ratingList;
	}
	
	/*
	 * public List<RatingData> fetchMoviesFallBack(String movieListStr) { return new
	 * ArrayList<RatingData>(); }
	 */
}
