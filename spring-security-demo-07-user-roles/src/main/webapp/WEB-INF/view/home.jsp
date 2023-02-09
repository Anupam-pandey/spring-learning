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

<form:form action="${pageContext.request.contextPath}/logout" method="POST">
<input type="submit" value="logout">
</form:form>
</body>
</html>