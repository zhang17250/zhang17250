<%--
  Created by IntelliJ IDEA.
  User: Avolon
  Date: 2018/8/14
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改密码</title>
</head>
<body>
<
<form method="post">
        用户名：<input type="test">
    <br>
        老密码：<input type="password">
    <br>
         新密码：<input type="password">
    <br>
         确认新密码：<input type="password" name="sureNewPass">
    <br>
         验证码:<<input type="text">
         <img src="/codeservlet" onclick="javascript:this.scr='/codeservlet'+new Date().getTime()">
    <br>
       <input type="submit">

</form>
</body>
</html>
