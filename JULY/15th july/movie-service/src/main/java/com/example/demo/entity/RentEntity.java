package com.example.demo.entity;





import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class RentEntity {

	
	private Integer rentId;
	private String movieName;
	private double rentAmount;
	
}
