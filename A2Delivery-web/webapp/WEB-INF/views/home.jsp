<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=windows-1251"
         pageEncoding="windows-1251" %>
<html
        xmlns:jsp="http://java.sun.com/JSP/Page"
        >
<head>
    <title>sqi-news-images</title>
    <link href="${pageContext.request.contextPath}/resource/style/style.css" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resource/style/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/resource/js/jquery-1.11.1.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/resource/js/bootstrap.min.js" type="text/javascript"></script>
</head>
<body>
<ul class="nav nav-tabs" role="tablist">
    <li class="active"><a href="${pageContext.request.contextPath}/registration">Delivery system</a></li>
</ul>
<div class="tab-content">
    <div class="tab-pane active">

        <form:form method="get" action="${pageContext.request.contextPath}/showProducts">
            <button class="btn btn-info" type="submit">Show all products</button>
        </form:form>


        <c:if test="${products != null}">
            <table class="table table-bordered" id="productTable" border="1">
                <tr>
                    <th>name</th>
                    <th>description</th>
                    <th>salePrice</th>
                    <th>weigth</th>
                    <th>countryMade</th>
                </tr>
                <tbody>
                <c:forEach items="${product}" var="product">
                    <tr class="classTr">
                        <td>${product.name}</td>
                        <td>${product.description}</td>
                        <td>${product.salePrice}</td>
                        <td>${product.weigth}</td>
                        <td>${product.countryMade}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </c:if>

    </div>
</div>
</body>
</html>
