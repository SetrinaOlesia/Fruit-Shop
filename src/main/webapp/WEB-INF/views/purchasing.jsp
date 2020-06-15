<%--
  Created by IntelliJ IDEA.
  User: OLESIA
  Date: 15.06.2020
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Fruit_Shop</title>
</head>
<body>
<h1> Product List </h1>
<div align="center">
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Item</th>
            <th>Price</th>
            <th>Add to bucket</th>
        </tr>
        <c:forEach var="product" products="${products}">
            <tr>
                <td>
                    <c:out value="${product.id}" />
                </td>
                <td>
                    <c:out value="${product.name}" />
                </td>
                <td>
                    <c:out value="${product.price}" />
                </td>
                <td>
                    <a href="/shoppingCart?product_id=${product.id}">Add</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <br>
    </form>
    <form action="${pageContext.request.contextPath}/" class="form-control">
        <button>BACK HOME</button>
    </form>
</div>
</body>
</html>
