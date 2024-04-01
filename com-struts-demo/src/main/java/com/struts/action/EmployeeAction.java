package com.struts.action;

import com.struts.model.Employee;

public class EmployeeAction {
	
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public String execute() {
		if(employee.getEmployeeName().equals("sri"))
			return "success";
		return "error";
}
	
}
