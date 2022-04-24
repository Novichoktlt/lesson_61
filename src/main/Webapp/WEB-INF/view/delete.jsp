<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>
</head>
<body>
<form:form action="delete" modelAttribute="product">

    Id: <form:input path="id" />
<br>
    <input type="submit" value="Submit">
</form:form>
</body>
</html>