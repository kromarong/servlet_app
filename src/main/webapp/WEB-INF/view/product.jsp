<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Products</title>
</head>
<body>
<form method="post">
    <input type="text" name="id" placeholder="id товара"/>
    <input type="text" name="name" placeholder="Наименование">
    <input type="text" name="cost" placeholder="Цена">
    <button type="submit">Добавить</button>
</form>
<c:forEach items="${productList}" var="product">
    <h1>${product}</h1>
</c:forEach>
</body>
</html>