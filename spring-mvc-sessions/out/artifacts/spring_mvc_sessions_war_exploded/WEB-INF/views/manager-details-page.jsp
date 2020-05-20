<%--
  Created by IntelliJ IDEA.
  User: mayank.gupta
  Date: 5/17/20
  Time: 3:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
	<title>Enter Manager Details</title>
	<style>
		.error {color: orangered}
	</style>
</head>
<body>

	<form:form action="processForm" modelAttribute="manager">
		First Name(*): <form:input path="firstName"/>
		<form:errors path="firstName" cssClass="error"/>
		<br><br>
		Last Name(*): <form:input path="lastName"/>
		<form:errors path="lastName" cssClass="error"/>
		<br><br>
		<input type="submit" value="Submit Details"/>
		<input type="reset" value=" Reset ">
	</form:form>

</body>
</html>
