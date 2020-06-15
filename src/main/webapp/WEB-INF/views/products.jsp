<%--
  Created by IntelliJ IDEA.
  User: OLESIA
  Date: 14.06.2020
  Time: 09:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Products</title>
</head>
<body>
<h1> All products page</h1>
<table border="1">
<tr>
    <th>IdProduct</th>
    <th>Products</th>
    <th>Add</th>

</tr>
<c:forEach var="user" items="${products}">
    <tr>
        <td>
            <c:out value="${product.productId}"/>
        </td>
        <td>
            <c:out value="${product.name}"/>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/products/add?id=${product.productId}"> Add</a>
        </td>
    </tr>
</c:forEach>
</table>
</body>
</html>
