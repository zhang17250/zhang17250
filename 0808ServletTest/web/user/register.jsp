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
        <font size="6">Login用户注册</font>
        <hr width="40%" />
        <form action="/registerServlet" method="post">
            <fieldset style="width: 400px;">
                <legend>注册信息</legend>
                用户名：<input type="text" name="uesername"/></br></br>
                密码：<input type="password" name="password" /></br></br>
                身份证：<input type="text" name="ueserId"/></br></br>
                性别：<input type="radio" name="sex" value="0" checked/>男
                <input type="radio" name="sex" value="1"/>女



                <input type="submit" value="注册"/>

            </fieldset>
        </form>
    </center>
</dl>
</body>
</html>