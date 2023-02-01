<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

the student name is ${student.firstName} ${student.lastName} ${student.country } ${student.favouriteLanguage} 

<ul>
	<c:forEach var="i" items="${student.operatingSystems}">
	 <li>${i}</li>	
	</c:forEach>
</ul>

</body>
</html>