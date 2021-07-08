package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dao.InstructorDao;
import com.example.demo.dao.InstructorDetailDao;
import com.example.demo.entity.Instructor;
import com.example.demo.entity.InstructorDetail;

@Service
public class InstructorDetailServiceImpl implements  InstructorDetailService{

	private InstructorDetailDao instructorDetailDao;
	private InstructorDao instructorDao;
	
	public InstructorDetailServiceImpl(InstructorDetailDao instructorDetailDao, InstructorDao instructorDao) {
	
		this.instructorDetailDao = instructorDetailDao;
		this.instructorDao = instructorDao;
	}

	@Override
	public InstructorDetail createInstructorDetails(InstructorDetail instructorDetail) {
		// TODO Auto-generated method stub
		Instructor i= instructorDao.save(instructorDetail.getInstructor());
		instructorDetail.setInstructor(i);

		return instructorDetailDao.save(instructorDetail);
	}
	
	//if we use use Post (in postman) using instructor details, the id will always come null
	//because instructor id is our primary key, so we need to do Post method from that.
	
	
	
}
