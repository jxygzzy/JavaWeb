<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>我的订单</title>
    <%@include file="/pages/common/head.jsp" %>
    <style type="text/css">
        h1 {
            text-align: center;
            margin-top: 200px;
        }
    </style>
</head>
<body>

<div id="header">
    <img class="logo_img" alt="" src="static/img/logo.gif">
    <%@include file="/pages/common/login_success_menu.jsp" %>
</div>

<div id="main">

    <table>
        <tr>
            <td>日期</td>
            <td>金额</td>
            <td>状态</td>
            <td>详情</td>
        </tr>
        <c:forEach items="${sessionScope.orders}" var="order">
            <tr>
                <td>${order.create_time}</td>
                <td>${order.price}</td>
                <td>
                    <c:if test="${order.status==0}">
                        ${"未发货"}
                    </c:if>
                    <c:if test="${order.status==1}">
                        ${"已发货"}
                    </c:if>
                    <c:if test="${order.status==2}">
                        ${"已收货"}
                    </c:if>
                </td>
                <td><a href="orderServlet?action=orderDetails">查看详情</a></td>
            </tr>
        </c:forEach>


    </table>


</div>

<%@include file="/pages/common/footer.jsp" %>
</body>
</html>