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
<form: action="processForm" modelAttribute="sportsPerson">
	First Name: <form:input path="firstName" />
	<br><br>
	Last Name: <form:input path="lastName" />
	<br><br>
	Age: <form:input path="age" />
	<br><br>
	Category <form:select path="sportsCategory">
						<form:option value="SWIMMING" label="Swimming" />
						<form:option value="CRICKET" label="Cricket" />
						<form:option value="TENNIS" label="Tennis" />
						<form:option value="FOOTBALL" label="Football" />
					</form:select>
	<br><br>
	Country <form:select path="country">
						<form:options items="${sportsPerson.countryList}"/>
					</form:select>
	<t> </t> &emsp; &emsp;
	Birth Country <form:select path="birthCountry">
						<form:options items="${myCountryOptions}" />
					</form:select>
	<br><br>
	Gender <br>
	<form:radiobutton path="gender" value="Male" /> Male
	&emsp; <form:radiobutton path="gender" value="Female" /> Female
	&emsp; <form:radiobutton path="gender" value="Trans" /> Trans
	<br><br>
	Strengths <br>
	<form:checkbox path="strengths" value="Fast Runner"/> Pace
	&emsp;<form:checkbox path="strengths" value="Powerful"/> Power
	&emsp;<form:checkbox path="strengths" value="Technically Sound"/> Technique
	&emsp;<form:checkbox path="strengths" value="Flexible"/> Flexible
	<br><br>
	<input type="submit" value="Submit Details" />
</form:form>
</body>
</html>
