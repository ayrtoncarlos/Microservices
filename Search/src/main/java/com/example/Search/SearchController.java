package com.example.Search;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController 
{
	@GetMapping("/seachs/{id}/")
	public Search getSearch(@PathVariable int id) 
	{
		Search search = new Search();
		
		search.setId(id);
		search.setQuery("CDs");;
		
		return search;
	}
}
