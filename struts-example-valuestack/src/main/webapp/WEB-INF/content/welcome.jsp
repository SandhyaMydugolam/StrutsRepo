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
<s:property value="name"/>
<s:property value="message"/>
<s:property value="fruits"/>
<s:property value="#session.message"/>
<s:property value="#session.course"/>


</body>
</html>