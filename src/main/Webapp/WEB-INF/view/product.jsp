<%@ page import ="java.util.ArrayList"%>
<%@ page import ="java.util.List"%>
<%@ page import ="ru.gb.model.Product"%>
<%@ page import ="ru.gb.controller.ProductController"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>
</head>
<body>
<h1>Product:</h1>
<hr>
<ul>
    <% for (Product value: (List<Product>)request.getAttribute("msg")) { %>
    <li>Id: <%=value.getId()%>; Title: <%=value.getTitle()%>; Price: <%=value.getPrice()%>
    </li>
    <% } %>
</ul>
<h2> Id: ${product.Id}</h2>
<h2> Title: ${product.Title}</h2>
<h2> Price: ${product.Price}</h2>

<c:url var="deleteUrl" value="/product/delete">
    <c:param name="id" value="${product.id}"/>
</c:url>

<a href="${deleteUrl}">DELETE</a>

<br>

<c:url var="editUrl" value="/product/edit">
    <c:param name="id" value="${product.id}"/>
</c:url>

<a href="${editUrl}">EDIT</a>
</body>
</html>
