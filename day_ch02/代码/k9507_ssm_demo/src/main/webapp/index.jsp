<%@ page language="java"  contentType="text/html; utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Hello World!</h2>
<table border="2">
    <tr>
        <td>学号</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>性别</td>
        <td>生日</td>
        <td>地址</td>
    </tr>
    <c:forEach items="${list}" var="s">
        <tr>
            <td>${s.xh}</td>
            <td>${s.name}</td>
            <td>${s.age}</td>
            <td>${s.sex}</td>
            <td>${s.birthday}</td>
            <td>${s.address}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
