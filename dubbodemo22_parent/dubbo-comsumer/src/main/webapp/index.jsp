<%@ page contentType="text/html; utf-8" pageEncoding="utf-8"  language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
 </head>
<body>
<table border="2">
    <tr>
        <td>编号</td><td>区域</td><td>操作</td>
    </tr>
    <c:forEach items="${list}" var="d">
        <tr>
            <td>${d.id}</td><td>${d.name}</td><td>删除 修改  查看</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>