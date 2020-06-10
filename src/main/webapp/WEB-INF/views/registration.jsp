<%--
  Created by IntelliJ IDEA.
  User: OLESIA
  Date: 10.06.2020
  Time: 09:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<h1><span style=" color: purple; font-family: 'Arial Black'; "> Hi! Provided your user details </span></h1>
<h3 style="font-size: large; color: crimson; ">${message}</h3>
<form method="post" action="${pageContext.request.contextPath}/registration">
    Add login: <input type="text" name="login"  autocomplete="on">
    Add password: <input type="password" name="pwd" maxlength="10" size="10">
    Repeat password: <input type="password" name="pwd-repeat" maxlength="10" size="10">
    <button type="submit">Register</button>
</form>
</body>
</html>
