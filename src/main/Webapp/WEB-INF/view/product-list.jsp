<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import ="java.util.ArrayList"%>
<%@ page import ="java.util.List"%>
<%@ page import ="ru.gb.model.Product"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<h1>Product List:</h1>
<ul>
    <% for (Product value: (List<Product>)request.getAttribute("products")) { %>
    <li>Id: <%=value.getId()%>; Title: <%=value.getTitle()%>; Price: <%=value.getPrice()%>;
    <c:url var="editUrl" value="/product/edit"/>

<a href="${editUrl}">EDIT</a>
    </li>
    <% } %>
</ul>
<br>
<c:url var="createUrl" value="/product/create"/>

<a href="${createUrl}">ADD</a>
<br>
<c:url var="deleteUrl" value="/product/delete"/>

<a href="${deleteUrl}">DELETE</a>

</body>
</html>