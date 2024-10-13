package com.web.model;

import com.web.repo.StudentRepo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	
	@Id
	@Column(name="ID")
	private int sId;
	@Column(name="Name")
	private String sName;
	private int hibernate;
	private int spring;
	private int springBoot;
	private int total;
	private double percentage;
	private char grade;
	private String result;
	
	public Student() {
		super();
	}
	
	public Student(int sId, String sName, int hibernate, int spring, int springBoot, int total, double percentage,
			char grade, String result) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.hibernate = hibernate;
		this.spring = spring;
		this.springBoot = springBoot;
		this.total = total;
		this.percentage = percentage;
		this.grade = grade;
		this.result = result;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getHibernate() {
		return hibernate;
	}

	public void setHibernate(int hibernate) {
		this.hibernate = hibernate;
	}

	public int getSpring() {
		return spring;
	}

	public void setSpring(int spring) {
		this.spring = spring;
	}

	public int getSpringBoot() {
		return springBoot;
	}

	public void setSpringBoot(int springBoot) {
		this.springBoot = springBoot;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", hibernate=" + hibernate + ", spring=" + spring
				+ ", springBoot=" + springBoot + ", total=" + total + ", percentage=" + percentage + ", grade=" + grade
				+ ", result=" + result + "]";
	}
}
