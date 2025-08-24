package com.trupti.moviedata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.trupti.moviedata.dao.MovieEntity;
import com.trupti.moviedata.model.MovieSummary;
import com.trupti.moviedata.model.RatingData;
import com.trupti.moviedata.repo.MovieRepo;

@Service
public class RatingService {
	
	@Autowired
	private MovieRepo repo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${api.key}")
	private String apiKey;
	
	public RatingData fetchRatings(Integer movieId) {
		System.out.println("***movieId****"+movieId);
		MovieEntity mEntity = repo.findById(movieId).orElse(new MovieEntity());
		MovieSummary ms = fetchMovieDetailsFromMovieDB(movieId);
		RatingData rd = new RatingData();
		rd.setMovieId(mEntity.getmId());
		rd.setName(ms.getTitle());
		rd.setDesc(ms.getOverview());
		rd.setRating(mEntity.getRating());
		System.out.println("*****RatingData****"+rd.toString());
		return rd;
	}
	
	private MovieSummary fetchMovieDetailsFromMovieDB(Integer movieId) {
		MovieSummary movieSum = restTemplate
				.getForObject("https://api.themoviedb.org/3/movie/" + movieId + "?api_key=" + apiKey, MovieSummary.class);
		System.out.println("----movieSum----"+movieSum.toString());
		return movieSum;
	}
}
