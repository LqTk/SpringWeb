<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
</head>
<body>
<form action="/webcontrol/welcome" method="post">
    用户名:<input type="text" name="name">
    <br/>
    密码：<input type="text" name="password">
    <input type="submit" value="登录">
</form>
</body>
</html>