package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.GadgetDao;
import com.example.demo.model.Gadget;

@Service
public class GadgetServiceImpl implements GadgetService{

	private GadgetDao gadgetDao;
	
	@Autowired
	public GadgetServiceImpl(GadgetDao gadgetDao) {
		
		this.gadgetDao = gadgetDao;
	}

	@Override
	public Gadget createGadget(Gadget gadget) {
		// TODO Auto-generated method stub
		return gadgetDao.save(gadget);
	}

	@Override
	public List<Gadget> displayGadget() {
		// TODO Auto-generated method stub
		return gadgetDao.findAll();
	}

}
