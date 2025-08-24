package com.trupti.moviedata.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.trupti.moviedata.model.RatingData;
import com.trupti.moviedata.repo.MovieRepo;

//@ExtendWith(MockitoExtension.class)
@ExtendWith(MockitoExtension.class)
class RatingServiceTest {
	
	@Mock
	private MovieRepo repo;
	
	@InjectMocks
	private RatingService service;

	@Test
	void testFetchRatings() {

		RatingData rd=  service.fetchRatings(1);
		
		assertThat(rd).isNotNull();
	}

}
