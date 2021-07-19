package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Gadget;

@Repository
public interface GadgetDao extends JpaRepository<Gadget, Integer>{

}
