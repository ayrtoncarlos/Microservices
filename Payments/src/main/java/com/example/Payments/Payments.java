package com.example.Payments;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Payments 
{
	@Id
	private int id;
	
	private double value;
}
