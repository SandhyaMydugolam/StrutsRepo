package com.struts.action;

import com.opensymphony.xwork2.ActionSupport;

public class EmployeeAction extends ActionSupport{
	
	private String employeeName;
	private int employeeId;
	public String getEmployeeName() {
		return employeeName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String execute() {
		return "success";
	}
}
