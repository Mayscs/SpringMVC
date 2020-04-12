<%--
  Created by IntelliJ IDEA.
  User: mayank.gupta
  Date: 4/11/20
  Time: 1:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Processed Form</title>
</head>
<body>

<br> <br>

Hurray!! Mr/Ms <b>${upperCaseName}</b> you are selected for the lucky draw Bumper Prize.
<br><br>
Hello Mr/Ms <b>${upperCaseName}</b> !!
<br>
Bumper prize for you is AirCool air conditioner.
<br><br><br><br>
Winner Details: <br>
-------------------------------------<br>
<b>|	Name           |	Age	|	Prize	|</b><br>
|	${param.candidateName} |	${param.age}	|	AC	  |<br>
-------------------------------------<br>

</body>
</html>
