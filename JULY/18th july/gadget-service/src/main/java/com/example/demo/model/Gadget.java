package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "gadget")
public class Gadget {

	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "gadget_name", nullable = false)
	private String gadgetName;
	@Column(name="gadget_price",nullable = false)
	private double gadgetPrice;
}
