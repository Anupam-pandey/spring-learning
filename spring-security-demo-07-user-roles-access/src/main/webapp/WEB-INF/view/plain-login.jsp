<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login page</title>
<style type="text/css">
	.failed{
	color:red;
	}
</style>
</head>
<body>
	<h3>my custom login page</h3>
	<form:form action="${pageContext.request.contextPath}/authenticateTheUser" method="POST">
	
		<c:if test="${param.error != null}">
		<i class="failed"> invalid username / password</i>
		</c:if>
		<p>
			Username : <input type="text" name="username">
		</p>
		
		<p>
			password : <input type="password" name="password">
		</p>
		
		<input type="submit" value="login">
	</form:form>
</body>
</html>