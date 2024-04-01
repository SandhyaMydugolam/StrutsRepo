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
	hi
	<s:property value="employee.name"/> <br>
	<s:property value="employee.city"/> <br>
	<s:property value="employee.age"/> <br>
	<s:property value="employee.salary"/> <br>
	<s:property value="employee.email"/> <br>
</body>
</html>