<%--
  Created by IntelliJ IDEA.
  User: mayank.gupta
  Date: 4/15/20
  Time: 11:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
	<title>Player Registration Form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="sportsPerson">
	First Name: <form:input path="firstName" />
	<br><br>
	Last Name: <form:input path="lastName" />
	<br><br>
	<input type="submit" value="Submit Details">

</form:form>
</body>
</html>
