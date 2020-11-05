<%--
  Created by IntelliJ IDEA.
  User: 14734
  Date: 2020/11/5
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<h3 style="text-align: center">SpringMVC配置成功</h3>--%>
<div style="text-align: center">
    <h3>查询所有账户</h3>
    <c:forEach items="${list}" var="account">
        ${account.name}
    </c:forEach>
</div>
</body>
</html>
