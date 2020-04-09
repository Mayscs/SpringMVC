<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: mayank.gupta
  Date: 4/10/20
  Time: 2:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Basic Informartion Form</title>
</head>
<body>
<form action="/processForm" method="get">
	<input type="text" name="candidateName"
	placeholder="What is your name ?" />
	<input type="submit" value="Submit Form"/>
	</form>

</body>
</html>
