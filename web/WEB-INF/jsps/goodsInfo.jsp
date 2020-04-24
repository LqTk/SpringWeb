<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>商品列表</title>
    <style type="text/css">
        .imageRound{
            width: 100px;
            height: 100px;
            border-radius: 50px;
        }
    </style>
</head>
<body>
    ${goodsInfoList.get(1).image}
    <table border="1" rules="rows">
        <tbody>
            <c:forEach var="goodsItem" items = "${goodsInfoList}">
                <tr>
                    <td>${goodsItem.name}</td>
                    <td>现价：${goodsItem.mallPrice}</td>
                    <td>原价：${goodsItem.price}</td>
                    <td><img class="imageRound" src="http://127.0.0.1:8080/${goodsItem.image}"></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>