<%--
  Created by IntelliJ IDEA.
  User: Avolon
  Date: 2018/8/8
  Time: 9:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<dl>
    <center>
        <font size="6">Login用户登陆</font>
        <hr width="40%" />
        <form action="/login" method="post">
            <fieldset style="width: 400px;">
                <legend>登陆信息</legend>
                用户名：<input type="text" name="ueserName"/></br></br>
                密码：<input type="password" name="passWord" /></br></br>


                <input type="checkbox" name="autologin" value="1"/>
                <input type="submit" value="登陆"/>
            </fieldset>
        </form>
    </center>
</dl>
</body>
</html>
