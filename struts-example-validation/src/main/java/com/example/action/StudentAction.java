package com.example.action;

import java.util.Arrays;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.example.model.Student;
import com.opensymphony.xwork2.ActionSupport;

@ResultPath(value = "/WEB-INF/content/")
@Action(value = "/studregister", results = { @Result(name = "success", location = "studsuccess.jsp") })
public class StudentAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Student student;
	private List<String> hobbies;

	public StudentAction() {
		hobbies = Arrays.asList("movies", "music");
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

	@Action(value = "/studregister", 
			results = { 
			@Result(name = "success", location = "studsuccess.jsp"), 
			@Result(name = "input" , location ="studform.jsp"),
		    @Result(name = "error" , location = "studform.jsp")})
		
	
	@Override
	public String execute() throws Exception {

		return "success";
	}

	@Action(value = "studform", results = {
			@Result(name = "none", location = "/WEB-INF/content/studform.jsp") })
	public String studForm() {
		return NONE;
	}
	
	@Override
	public void validate() {
		
		if (student!=null)
			if(student.getName().length()<=0)
				addFieldError("student.name","Name is Required");
				
				if(student.getAge()<20 || student.getAge()>70)
					addFieldError("student.age","Age is Required");
				
				if(student.getCity().length()<=0)
					addFieldError("student.City","City is Required");
				
				if(student.getCourse().length()<=0)
					addFieldError("student.course","Course is Required");
				
				if(student.getGender().length()<=0)
					addFieldError("student.gender","Gender is Required");
				
				if(student.getEmail().length()<=0)
					addFieldError("student.email","Email is Required");
				
				if(student.getAllowance()<=0)
					addFieldError("student.allowance","Allowance is Required");
				
		
		
	}
	
	
	

}
