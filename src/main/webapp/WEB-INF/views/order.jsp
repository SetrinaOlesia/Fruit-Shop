<%--
  Created by IntelliJ IDEA.
  User: OLESIA
  Date: 24.06.2020
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="products" scope="request" type="java.util.List<fruit_shop.model.Product>"/>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Fruit_Shop</title>
</head>
<body>
<h1>ORDER!</h1>

<div align="center">
    <table border="2">
        <tr>
            <th>ID</th>
            <th>Product</th>
            <th>Price</th>
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

            </tr>
        </c:forEach>
    </table>
    <br>

    <form action="${pageContext.request.contextPath}/" class="form-control">
        <button>BACK HOME</button>
    </form>
</div>
</body>
</html>
