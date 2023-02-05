<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>save customer</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/add-customer-style.css"/>
</head>
<body>
		<div id="wrapper">
				<div id="header">
				<h2> Customer Relationship Manager 
				</h2>
				</div>
		</div>
		
		<div id="container">
				<h2> save customer 
				</h2>
				<form:form action="saveCustomer" modelAttribute="customer" method="POST">
				<form:hidden path="id"/>
				<table>
					<tbody>
						<tr>
							<td>First Name</td>
							<td><form:input path="firstName"/></td>
						</tr>
						
						<tr>
							<td>Last Name</td>
							<td><form:input path="lastName"/></td>
						</tr>
						
						<tr>
							<td>Email</td>
							<td><form:input path="email"/></td>
						</tr>
						
						<tr>
							<td></td>
							<td><input type="submit" value="save" class="save"/></td>
						</tr>
						
					
					</tbody>
				</table>
				 </form:form>
				 <div style="clear;both;"></div>
				 
				 <p>
				 <a href="${pageContext.request.contextPath}/customer/list">back to list</a>
				 </p>
				</div>
</body>
</html>