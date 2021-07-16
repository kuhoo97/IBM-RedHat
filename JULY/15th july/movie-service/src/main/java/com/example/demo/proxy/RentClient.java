package com.example.demo.proxy;

import java.util.List;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.RentEntity;



@FeignClient(name="rental-service")
public interface RentClient {

	/*@GetMapping("/rents")
	public ResponseEntity<List<RentEntity>> displayAllRent();
	*/
	
	@GetMapping("/rents")
	public List<RentEntity> displayAllRent();
	
}
