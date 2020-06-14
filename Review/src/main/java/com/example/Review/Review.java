package com.example.Review;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Review 
{
	@Id
	private int id;
	
	private String comment;
}
