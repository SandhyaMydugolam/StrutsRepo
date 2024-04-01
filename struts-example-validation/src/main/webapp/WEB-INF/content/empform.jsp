<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:form action="empregister">
	<s:textfield name="employee.name" label="Name"></s:textfield>
	<s:textfield name="employee.city" label="City"></s:textfield>
	<s:textfield name="employee.age" label="Age"></s:textfield>
	<s:textfield name="employee.salary" label="Salary"></s:textfield>
	<s:textfield name="employee.email" label="Email"></s:textfield>
	<s:submit  value="Register"></s:submit>	
	</s:form>
</body>
</html>