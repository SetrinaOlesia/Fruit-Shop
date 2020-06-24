<%--
  Created by IntelliJ IDEA.
  User: OLESIA
  Date: 05.06.2020
  Time: 18:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Fruit_Shop</title>

</head>
<body>

<h1> Fruit_Shop </h1>

<div class="container col-lg-8"></div>
<form action="${pageContext.request.contextPath}/registration">
    <button>REGISTRATION NEW USER</button>
</form>
<form action="${pageContext.request.contextPath}/login">
    <button>LOGIN</button>
</form>
<form action="${pageContext.request.contextPath}/logout">
    <button>LOGOUT</button>
</form>
<form action="${pageContext.request.contextPath}/purchase">
    <button>START PURCHASING</button>
</form>
<form action="${pageContext.request.contextPath}/showShoppingCart">
    <button>SHOW SHOPPING CART</button>
</form>
<form action="${pageContext.request.contextPath}/showOrder">
    <button>SHOW ORDER</button>
</form>
<hr>
<h2>ADMIN ONLY</h2>
<hr>
<form action="${pageContext.request.contextPath}/users/all">
    <button>SHOW ALL USERS</button>
</form>
<form action="${pageContext.request.contextPath}/productAdding">
    <button>ADD NEW PRODUCT</button>
</form>
<form action="${pageContext.request.contextPath}/getAllProducts">
    <button>SHOW ALL PRODUCTS</button>
</form>
<form action="${pageContext.request.contextPath}/test">
    <button>ADD TEST USER AND ADMIN + TEST PRODUCTS</button>
</form>
<%--<h1 > <span style="font-size: x-large; color: teal; font-family: Arial; "> Hello Amigo!--%>
<%--</span></h1>--%>
<%--<a href="${pageContext.request.contextPath}/injectData">Inject test data into the Db</a>--%>

</body>
</html>
