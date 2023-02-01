<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form:form action="processForm" modelAttribute="student">


firstName : <form:input path="firstName"/>
<br>
lastName : <form:input path="lastName"/>
<br>

country : <form:select path="country">
	<%-- <form:option value="a"></form:option>
	<form:option value="b"></form:option>
	<form:option value="c"></form:option>
	<form:option value="d"></form:option> --%>
	
	<form:options items="${student.countryOptions}"/>
</form:select>
<br>

java <form:radiobutton path="favouriteLanguage" value="java"/>
c++ <form:radiobutton path="favouriteLanguage" value="c++"/>
python <form:radiobutton path="favouriteLanguage" value="python"/>

<br>
OSs

Linux <form:checkbox path="operatingSystems" value="linux"/>
win <form:checkbox path="operatingSystems" value="win"/>
mac <form:checkbox path="operatingSystems" value="mac"/>

<br>

<input type="submit" value="submit">

</form:form>
</body>
</html>