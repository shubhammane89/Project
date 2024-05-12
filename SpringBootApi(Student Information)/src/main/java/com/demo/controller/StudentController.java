 package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Student;
import com.demo.service.StudentService;

@RestController
public class StudentController {
 
	@Autowired
	private StudentService ss;
	@PostMapping(value = "/add")
	public Student m1( @RequestBody Student s)
	{
		return ss.save(s);
	}
	@GetMapping(value = "/allStudent")
	public List<Student> m2()
	{
		return ss.findAll();
	}
	@DeleteMapping(value ="/deleteById/{id}")
	public String m3(@PathVariable ("id") int id)
	{
		ss.deleteById(id);
		return   "Student with ID " + id + " has been deleted successfully";
	}
	@PutMapping(value = "/update")
	public Student m4( @RequestBody Student s)
	{
		return ss.save(s);
	}
}
