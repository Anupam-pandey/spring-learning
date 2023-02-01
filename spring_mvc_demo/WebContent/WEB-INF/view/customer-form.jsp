<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.error {color:red}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="customer">
		fname <form:input path="firstName" />
		<br>
		lname <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error"/>
		<br>
		freepasses <form:input path="freePasses"/>
		<form:errors path="freePasses" cssClass="error"/>
		<br>
		postal code <form:input path="postalCode"/>
		<form:errors path="postalCode" cssClass="error"/>
		<br>
		<br>
		course code <form:input path="courseCode"/>
		<form:errors path="courseCode" cssClass="error"/>
		<br>
		
		<input type="submit">
	</form:form>
</body>
</html>