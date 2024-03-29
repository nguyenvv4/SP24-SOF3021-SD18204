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

<%--<form action="/addNew" method="post" >--%>
<%--    <div class="mb-3">--%>
<%--        <label  class="form-label">Ma sinh vien</label>--%>
<%--        <input type="text" class="form-control" name="maSinhVien">--%>
<%--    </div>--%>
<%--    <div class="mb-3">--%>
<%--        <label  class="form-label">Ho ten</label>--%>
<%--        <input type="text" class="form-control" name="hoTen">--%>
<%--    </div>--%>
<%--    <div class="mb-3">--%>
<%--        <label  class="form-label">Dia chi</label>--%>
<%--        <input type="text" class="form-control" name="diaChi">--%>
<%--    </div>--%>
<%--    <div class="mb-3">--%>
<%--        <label  class="form-label">Dia chi</label>--%>
<%--        <div class="form-check">--%>
<%--            <input class="form-check-input" type="radio" name="gioiTinh" value="Nam" >--%>
<%--            <label class="form-check-label" >--%>
<%--                Nam--%>
<%--            </label>--%>
<%--        </div>--%>
<%--        <div class="form-check">--%>
<%--            <input class="form-check-input" type="radio" name="gioiTinh" value="Nu"  >--%>
<%--            <label class="form-check-label" >--%>
<%--                Nu--%>
<%--            </label>--%>
<%--        </div>--%>
<%--    </div>--%>

<%--    <button type="submit" class="btn btn-primary">Submit</button>--%>
<%--</form>--%>

<form:form action="/addNew" method="post" modelAttribute="sinhVienViewModel">
    <label  class="form-label">Ho Ten</label>
    <form:input path="hoTen" cssClass="form-control"/>
    <form:errors path="hoTen"/><br/>
    <label  class="form-label">Dia Chi</label>
    <form:input path="diaChi" cssClass="form-control"/>
    <form:errors path="diaChi"/><br/>
    <button>Submit</button>
</form:form>
<h2>Thong tin sinh vien</h2>
<table class="table">
    <thead>
        <tr>
            <td>Ma</td>
            <td>Ho Ten</td>
            <td>Dia Chi</td>
            <td>Gioi Tinh</td>
            <td>Action</td>
        </tr>
    </thead>
    <tbody>
    <c:forEach items="${listSinhVien}" var="sinhVien">
        <tr>
            <td>${sinhVien.maSinhVien}</td>
            <td>${sinhVien.hoTen}</td>
            <td>${sinhVien.diaChi}</td>
            <td>${sinhVien.gioiTinh}</td>
            <td><a href="/detail/${sinhVien.maSinhVien}" class="btn btn-primary">Chi tiet</a>
                <a href="/delete?id=${sinhVien.maSinhVien}" class="btn btn-primary">Xoa</a></td>
        </tr>
    </c:forEach>
    </tbody>

</table>
</body>
</html>