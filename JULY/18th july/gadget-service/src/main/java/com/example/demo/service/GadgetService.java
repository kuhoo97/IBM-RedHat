package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Gadget;

public interface GadgetService {

	public Gadget createGadget(Gadget gadget);
	public List<Gadget> displayGadget();
}
