<%--
  Created by IntelliJ IDEA.
  User: 14734
  Date: 2020/11/5
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="text-align: center">
    <form action="account/saveAccount" method="post">
        用户名：<input type="text" name="name"><br><br><br>
        金  额：<input type="text" name="money"><br><br><br>
        <input type="submit" value="保存账户">
    </form>

    <a href="account/testSpringMVC">测试 SpringMVC</a>
</div>

</body>
</html>
