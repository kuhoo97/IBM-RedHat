package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Item {
	
	
	private Integer id;
	private String itemNumber;
	private String itemName;
	private Double itemPrice;
	private Boolean isAvailable;


	
}
