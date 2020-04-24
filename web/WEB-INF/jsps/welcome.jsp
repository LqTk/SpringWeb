<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎页面</title>
    <style type="text/css">
        .imageCircle{
            margin-top: 100px;
            width: 100px;
            height: 100px;
            border-radius: 200px;
        }
        .imageRound{
            margin-top: 100px;
            width: 100px;
            height: 100px;
            border-radius: 20px;
        }
    </style>
</head>
<body>
    <h1>欢迎使用</h1>
    <img class="imageCircle" src="http://127.0.0.1:8080/HttpServletTest/ImageById?id=${message.userId}&picUrl=${message.picUrl}" width="100" height="100">
    <img class="imageRound" src="http://127.0.0.1:8080/HttpServletTest/ImageById?id=${message.userId}&picUrl=${message.picUrl}" width="100" height="100">
    用户名=${message.name}，地址=${message.picUrl},电话=${message.phone}
    <form action="/webcontrol/getGoods" method="post">
        <input type="text" name="page">
        <input type="submit" value="获取商品列表">
    </form>
</body>
</html>