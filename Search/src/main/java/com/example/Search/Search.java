package com.example.Search;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Search 
{
	@Id
	private int id;
	
	private String query;
}
