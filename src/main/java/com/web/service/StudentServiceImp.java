package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.Student;
import com.web.repo.StudentRepo;
@Service
public class StudentServiceImp implements StudentService {

	    @Autowired
	    private StudentRepo repo;

	    @Override
	    public Student saveStudent(Student student) {
	        int tot = 0;
	        double p = 0.0;
	        char g = ' ';
	        String r = null;
	        tot = student.getHibernate()+student.getSpring()+student.getSpringBoot();
	        p = (tot/3);
	        if (p>=70) {
				g='A';
			}
	        else if (p>=60) {
				g='B';
			}
	        else {
	        	g='C';
	        }
	        
	        if (student.getHibernate()>=35 && student.getSpring()>=35 && student.getSpringBoot()>=35) {
				r="PASS";
			}
	        else {
				r="FAIL";
			}
	        
	        student.setTotal(tot);
	        student.setPercentage(p);
	        student.setGrade(g);
	        student.setResult(r);
	        return repo.save(student);
	    }

	@Override
	public Student updateStudent(Student student) {
		   int tot = 0;
	        double p = 0.0;
	        char g = ' ';
	        String r = null;
	        tot = student.getHibernate()+student.getSpring()+student.getSpringBoot();
	        p = (tot/3);
	        if (p>=70) {
				g='A';
			}
	        else if (p>=60) {
				g='B';
			}
	        else {
	        	g='C';
	        }
	        
	        if (student.getHibernate()>=35 && student.getSpring()>=35 && student.getSpringBoot()>=35) {
				r="PASS";
			}
	        else {
				r="FAIL";
			}
	        
	        student.setTotal(tot);
	        student.setPercentage(p);
	        student.setGrade(g);
	        student.setResult(r);
	        return repo.save(student);
	}

	@Override
	public void deleteStudent(int sId) {
		repo.deleteById(sId);
	}

	@Override
	public Student getStudent(int sId) {
		Student getOne = repo.findById(sId).get();
		return getOne;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> studentlist = (List<Student>) repo.findAll();
		return studentlist;
	}

}
