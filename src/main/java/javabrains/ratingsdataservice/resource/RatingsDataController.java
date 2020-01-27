package javabrains.ratingsdataservice.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javabrains.ratingsdataservice.model.Rating;
import javabrains.ratingsdataservice.model.UserRatings;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsDataController {
	
	@GetMapping("/{movieId}")
	public Rating getMovie(@PathVariable("movieId") String movieId) {
		return new Rating(movieId, 4);
	}
	
	@GetMapping("/users/{userId}")
	public UserRatings getRatings(@PathVariable("userId") String userId) {
		
		List<Rating> ratings = Arrays.asList(
				new Rating("123", 4),
				new Rating("567", 3)
			);
		
		UserRatings userRatings = new UserRatings();
		userRatings.setUserRatings(ratings);
		return userRatings;
	}

}
