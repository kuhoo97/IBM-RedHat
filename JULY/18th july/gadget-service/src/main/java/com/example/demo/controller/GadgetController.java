package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Gadget;
import com.example.demo.service.GadgetService;

@RestController
public class GadgetController {

	private GadgetService gadgetService;
	private Environment environment;
	
	@Autowired
	public GadgetController(GadgetService gadgetService, Environment environment) {
		
		this.gadgetService = gadgetService;
		this.environment = environment;
	}
	
	@GetMapping
	public ResponseEntity<StringBuilder> getStatus()
	{
		StringBuilder stringBuilder=new StringBuilder();
		stringBuilder.append("application gadget-service is up");
		stringBuilder.append("on port: "+environment.getProperty("local.server.port"));
		return ResponseEntity.ok(stringBuilder);
	}
	
	@PostMapping("/gadgets")
	public ResponseEntity<Gadget> createEmployee(@Valid @RequestBody Gadget gadget)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(gadgetService.createGadget(gadget));
	}
	

	@GetMapping("/gadgets")
	public ResponseEntity<List<Gadget>> displayGadget()
	{
		return ResponseEntity.ok(gadgetService.displayGadget());
		
	}
	
}
