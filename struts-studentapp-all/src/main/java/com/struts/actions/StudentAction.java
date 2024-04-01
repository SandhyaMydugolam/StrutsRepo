package com.struts.actions;

import java.util.Arrays;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.model.Student;

public class StudentAction extends ActionSupport {
	
	private Student student;
	
	private List<String> hobbies;
	
	
	public StudentAction() {
		hobbies = Arrays.asList("memes","movies");
	}

	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	public List<String> getHobbies() {
		return hobbies;
	}


	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public String showStudForm () {
	return "none";
		

}
}
