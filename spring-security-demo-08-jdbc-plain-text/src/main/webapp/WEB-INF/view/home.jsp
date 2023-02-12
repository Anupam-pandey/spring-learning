<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
welcome!!
<p>
	user : <security:authentication property="principal.username"/>
	<br><br>
	roles: <security:authentication property="principal.authorities"/>

</p>


<security:authorize access="hasRole('MANAGER')"> 
<hr>
<p>
	<a href="${pageContext.request.contextPath}/leaders">Leadership meeting</a>
	(only for manager people)
</p>


<hr>

</security:authorize>

<security:authorize access="hasRole('ADMIN')"> 
<hr>
<p>
	<a href="${pageContext.request.contextPath}/systems">system admin meetings</a>
	(only for admins)
</p>


<hr>

</security:authorize>

<form:form action="${pageContext.request.contextPath}/logout" method="POST">
<input type="submit" value="logout">
</form:form>
</body>
</html>