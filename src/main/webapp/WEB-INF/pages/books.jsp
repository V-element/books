<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Main page</title>
    <link href="<c:url value="/res/style.css"/>" rel="stylesheet" type="text/css"/>
</head>
<body>
<h2>Books</h2>
<table>
    <tr>
        <th>id</th>
        <th>author</th>
        <th>name</th>
        <th>description</th>
        <th>action</th>
    </tr>
    <c:forEach var="book" items="${booksList}">
        <tr>
            <td>${book.id}</td>
            <td>${book.author}</td>
            <td>${book.name}</td>
            <td>${book.description}</td>
            <td>
                <a href="/edit/${book.id}">edit</a>
                <a href="/delete/${book.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>

<h2>Add</h2>
<c:url value="/add" var="add"/>
<a href="${add}">Add new book</a>
</body>
</html>
