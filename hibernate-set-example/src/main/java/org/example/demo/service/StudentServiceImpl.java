package org.example.demo.service;

import java.util.List;

import org.example.demo.dao.StudentDao;
import org.example.demo.dao.StudentDaoImpl;
import org.example.demo.model.Student;

public class StudentServiceImpl implements StudentService {

	StudentDao studentDao=null;
	{
		studentDao=new StudentDaoImpl();
	}

	
	
	@Override
	public Student createStudent(Student student) {
		
	return studentDao.createStudent(student);
	}
	@Override
	public List<Student> displayAllStudents() {
		return studentDao.displayAllStudents();
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		return studentDao.findById(id);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		studentDao.deleteById(id);	
	}

	@Override
	public Student updateById(int id) {
		// TODO Auto-generated method stub
		return studentDao.updateById(id);
	}

}
