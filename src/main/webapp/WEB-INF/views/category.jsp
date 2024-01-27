<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body class="container">
<form action="/category/save" method="post">

    <div class="mb-3">
        <label class="form-label">Name</label>
        <input type="text" class="form-control" name="name" value="${category.name}">
    </div>
    <button type="submit" class="btn btn-primary">Add</button>
</form>
<table class="table">
    <thead>
    <tr>
        <td>Id</td>
        <td>Tên</td>
        <td>Action</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="category">
        <tr>
            <td>${category.id}</td>
            <td>${category.name}</td>
            <td><a href="/category/detail/${category.id}" class="btn btn-primary">Chi tiet</a>
                <a href="/category/delete/${category.id}" class="btn btn-primary">Xoa</a></td>
        </tr>
    </c:forEach>
    </tbody>

</table>
</body>
</html>