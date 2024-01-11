<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body class="container">
<form action="#" method="post">
    <div class="mb-3">
        <label class="form-label">Ma sinh vien</label>
        <input type="text" class="form-control" name="maSinhVien" value="${sinhVien.maSinhVien}">
    </div>
    <div class="mb-3">
        <label class="form-label">Ho ten</label>
        <input type="text" class="form-control" name="hoTen" value="${sinhVien.hoTen}">
    </div>
    <div class="mb-3">
        <label class="form-label">Dia chi</label>
        <input type="text" class="form-control" name="diaChi" value="${sinhVien.diaChi}">
    </div>
    <div class="mb-3">
        <label class="form-label">Dia chi</label>
        <div class="form-check">
            <input class="form-check-input" type="radio"
            <c:if test="${sinhVien.gioiTinh == 'Nam'}"> checked="checked"
            </c:if>
                   name="gioiTinh" value="Nam">
            <label class="form-check-label">
                Nam
            </label>
        </div>
        <div class="form-check">
            <input class="form-check-input" type="radio" name="gioiTinh" value="Nu"
            <c:if test="${sinhVien.gioiTinh == 'Nu'}"> checked="checked"
            </c:if>
            >
            <label class="form-check-label">
                Nu
            </label>
        </div>
    </div>

    <button type="submit" class="btn btn-primary">Update</button>
</form>
</body>
</html>