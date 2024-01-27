<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body class="container">
<form action="/category/update/${category.id}" method="post">
<%--    <div class="mb-3">--%>
<%--        <label class="form-label">Id</label>--%>
<%--        <input type="text" class="form-control" name="id" value="${category.id}">--%>
<%--    </div>--%>
    <div class="mb-3">
        <label class="form-label">Name</label>
        <input type="text" class="form-control" name="name" value="${category.name}">
    </div>
    <button type="submit" class="btn btn-primary">Update</button>
</form>
</body>
</html>