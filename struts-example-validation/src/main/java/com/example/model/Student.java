package com.example.model;

import java.util.Arrays;

public class Student {
	private String name;
	private String city;
	private int age;
	private double allowance;
	private String course;
	private String gender;
	private String email;
	private String[] hobby;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getAllowance() {
		return allowance;
	}
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", age=" + age + ", allowance=" + allowance + ", course="
				+ course + ", gender=" + gender + ", email=" + email + ", hobby=" + Arrays.toString(hobby) + "]";
	}
	
	
	

}
