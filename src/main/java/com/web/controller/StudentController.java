package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.model.Student;
import com.web.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService service;
	
	@RequestMapping("/")
	public String homePage() {
		return "home";
	}
	@RequestMapping("/addStudent")
	public String registerPage() {
		return "register";
	}
	@RequestMapping("/register")
	@ResponseBody
	public String save(Student student,ModelMap model) {
		Student s1=service.saveStudent(student);
		return "<center><h1>Registered Successfully...</h1></center>";
	}
	@RequestMapping("/viewStudent")
	public String getAll(ModelMap model) {
		model.put("students", service.getAllStudent());
		return "viewStudents";
	}
	@RequestMapping("/delete/{sId}")
	public String delete(@PathVariable int sId) {
		service.deleteStudent(sId);
		return "redirect:/viewStudent";
	}
	@RequestMapping("/update/{sId}")
	public String delete(@PathVariable int sId,ModelMap model) {
		model.put("command",service.getStudent(sId));
		return "editStudent";
	}
	@RequestMapping("/edit_stu")
	public String updateSave(Student student,ModelMap model) {
		Student edit = service.updateStudent(student);
		return "redirect:/viewStudent";
	}
	
}
