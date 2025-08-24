package com.trupti.moviedata.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trupti.moviedata.dao.MovieEntity;

@Repository
public interface MovieRepo extends JpaRepository<MovieEntity, Integer>{

}
