<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="wrapper">
		<div id="head">
			<h2>CRM Application </h2>
		
		</div>
	
	</div>
	
	<div id = "container">
	
	<div id = "content">
			<input type="button" value="add customer" onclick="window.location.href='showFormForAdd'; return false;"
			class="add-button"
			/>
			<table>
				<tr>
					<th> FirstName </th>
					<th> LastName </th>
					<th> Email </th>
					<th> Action </th>
				</tr>
				
				<c:forEach var="t" items="${customers}">
					<c:url var="updateLink" value="/customer/showFormForUpdate">
					<c:param name="customerId" value="${t.id}"></c:param> 
					</c:url>
					
					<c:url var="deleteLink" value="/customer/delete">
					<c:param name="customerId" value="${t.id}"></c:param> 
					</c:url>
					
					
					<tr>
						<td> ${t.firstName}</td>
						<td> ${t.lastName}</td>
						<td> ${t.email}</td>
						<td> <a href="${updateLink}">update</a> | <a href="${deleteLink}" 
						onclick="if(!(confirm('are you surely want to delete ?'))) return false">delete</a></td>
					</tr>
				</c:forEach>
			</table>
		
	</div>
	
	
	</div>
	
	
	
</body>
</html>