package com.trupti.moviedata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trupti.moviedata.dao.MovieEntity;
import com.trupti.moviedata.model.RatingData;
import com.trupti.moviedata.repo.MovieRepo;

@Service
public class RatingService {
	
	@Autowired
	private MovieRepo repo;
	
	public RatingData fetchRatings(Integer movieId) {
		System.out.println("***movieId****"+movieId);
		MovieEntity mEntity = repo.findById(movieId).orElse(new MovieEntity());
		
		RatingData rd = new RatingData();
		rd.setMovieId(mEntity.getmId());
		rd.setName(mEntity.getmName());
		rd.setDesc(mEntity.getDesc());
		rd.setRating(mEntity.getRating());
		System.out.println("*****RatingData****"+rd.toString());
		return rd;
	}
}
