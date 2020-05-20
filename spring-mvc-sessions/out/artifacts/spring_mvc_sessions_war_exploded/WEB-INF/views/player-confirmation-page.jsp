<%--
  Created by IntelliJ IDEA.
  User: mayank.gupta
  Date: 4/16/20
  Time: 12:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Player Confirmation Page</title>
</head>
<body>
Hurray!! Player Registration Completed.
<br><br>
<b> Player Details </b>:
<br>
<b> Name </b> : &ensp;${sportsPerson.firstName} ${sportsPerson.lastName}
<br>
<b> Age </b> : &ensp;${sportsPerson.age}
<br>
<b> Category </b> : &ensp;${sportsPerson.sportsCategory}
<br>
<b> Playing Nation </b> : &ensp;${sportsPerson.country}
<br>
<b> Birth Country </b> : &ensp;${sportsPerson.birthCountry}
<br>
<b> Gender </b> : &nbsp; ${sportsPerson.gender}
<br>
<b> Player Strengths</b> :
<ul>
	<c:forEach var="strength" items="${sportsPerson.strengths}">
		<li>
				${strength}
		</li>
	</c:forEach>
</ul>
</body>
</html>
