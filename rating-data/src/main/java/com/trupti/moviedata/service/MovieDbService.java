package com.trupti.moviedata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.trupti.moviedata.model.MovieSummary;

@Service
public class MovieDbService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${api.key}")
	private String apiKey;
	
	@HystrixCommand(fallbackMethod = "fetchFallbackMovieDetailsFromMovieDB",
			commandProperties = {
					@HystrixProperty( name ="execution.isolation.thread.timeoutInMilliseconds", value = "2000"),
					@HystrixProperty( name ="circuitBreaker.requestVolumeThreshold", value = "5"),
					@HystrixProperty( name ="circuitBreaker.errorThresholdPercentage", value = "50"),
					@HystrixProperty( name ="circuitBreaker.sleepWindowInMilliseconds", value = "5000")})
	public MovieSummary fetchMovieDetailsFromMovieDB(Integer movieId) {
		System.out.println("---Calling moviedb external API----");
		MovieSummary movieSum = restTemplate
				.getForObject("https://api.themoviedb.org/3/movie/" + movieId + "?api_key=" + apiKey, MovieSummary.class);
		System.out.println("----movieSum----"+movieSum.toString());
		return movieSum;
	}
	
	
	public MovieSummary fetchFallbackMovieDetailsFromMovieDB(Integer movieId) {
		MovieSummary ms = new MovieSummary();
		ms.setTitle("Unknown");
		ms.setOverview("Some movie");
		return ms;
	}

}
