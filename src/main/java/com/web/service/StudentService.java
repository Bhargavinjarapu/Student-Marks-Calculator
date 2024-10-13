package com.web.service;

import java.util.List;

import com.web.model.Student;

	public interface StudentService{
		
	public Student saveStudent(Student student);
	public Student updateStudent(Student student);
	public void deleteStudent(int sId);
	public Student getStudent(int sId);
	public List<Student> getAllStudent();
}
