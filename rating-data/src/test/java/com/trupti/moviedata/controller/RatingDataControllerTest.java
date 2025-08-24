package com.trupti.moviedata.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.trupti.moviedata.service.RatingService;

@WebMvcTest(RatingDataController.class)
@ExtendWith(MockitoExtension.class)
class RatingDataControllerTest {

	@Autowired
	private MockMvc mvc;
	
	@Mock
	private RatingService service;
	
	@Test
	void testGetRating() throws Exception {
		mvc.perform(MockMvcRequestBuilders
				.get("/getRating")
				.accept(MediaType.ALL))
		.andExpect(status().is2xxSuccessful());
	}

}
