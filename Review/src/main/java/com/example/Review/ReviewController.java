package com.example.Review;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController 
{
	@GetMapping("/reviews/{id}/")
	public Review getReview(@PathVariable int id) 
	{
		Review review = new Review();
		
		review.setId(id);
		review.setComment("Teste");
		
		return review;
	}
}
