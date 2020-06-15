<%--
  Created by IntelliJ IDEA.
  User: OLESIA
  Date: 14.06.2020
  Time: 20:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Fruit_SHOP</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/servlet/productAdding" method="post">
    <div class="container" class="form-control" align="center">
        <h1>Add product</h1>
        <hr>

        <label for="product_name"><b>Product</b></label>
        <input type="text " placeholder="Enter Product" id="product_name" name="product_name" required>

        <label for="product_price"><b>Price</b></label>
        <input type="number" placeholder="Enter Price" id="product_price" name="product_price" required>

        <button type="submit" class="registration">Add Product</button>
        <hr>
    </div>
</form>
<form action="${pageContext.request.contextPath}/" class="form-control">
    <button>BACK Main Page</button>
</form>
</body>
</html>
