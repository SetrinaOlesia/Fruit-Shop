<%--
  Created by IntelliJ IDEA.
  User: OLESIA
  Date: 14.06.2020
  Time: 20:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Fruit_Shop</title>
</head>
<body>
<h1>All Products</h1>
<div align="center">
    <table border="1" bgcolor="#20b2aa">
        <tr>
            <th>ID</th>
            <th>Product</th>
            <th>Price</th>
            <th>Delete</th>
        </tr>
        <c:forEach var="product" products="${products}">
            <tr>
                <td>
                    <c:out value="${product.id}"/>
                </td>
                <td>
                    <c:out value="${product.name}"/>
                </td>
                <td>
                    <c:out value="${product.price}"/>
                </td>
                <td>
                    <a href="/deleteProduct?product_id=${product.id}">DELETE</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <form action="${pageContext.request.contextPath}/productAdding" class="form-control">
        <button>Add new product</button>
    </form>
    <form action="${pageContext.request.contextPath}/" class="form-control">
        <button>Back</button>
    </form>
</div>
</body>
</html>
