package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.StudentDao;
import com.demo.model.Student;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
   
	@Autowired
	private StudentDao sd;
	@Override
	public Student save(Student s) {
		
		return sd.save(s);
	}
	@Override
	public List<Student> findAll() {
		
		return sd.findAll();
	}
	@Override
	public String deleteById(int sid) {
		return sd.deleteById(sid);
	}
	

	}
	


