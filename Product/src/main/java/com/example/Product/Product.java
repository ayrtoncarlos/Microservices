package com.example.Product;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Product 
{
	@Id
	private int id;
	
	private String name;
	
	private double value;
}
