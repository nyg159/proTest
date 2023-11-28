<%--
  Created by IntelliJ IDEA.
  User: WJ
  Date: 2023-11-24
  Time: 오후 1:04
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="cpath" value="${pageContext.request.contextPath}"/>


<!DOCTYPE html>
<html>
<head>
    <title>accountTable</title>
    <link rel="stylesheet" href="${cpath}/resources/css/style.css">
</head>
<body>
    <h1>account Table</h1>
    <hr>

<section class="table">
    <table>
        <tr>
            <th>No</th>
            <th>아이디</th>
            <th>패스워드</th>
            <th>닉네임</th>
            <th>이메일</th>
            <th>가입일</th>
        </tr>
        <c:forEach var="row" items="${list }">
            <tr>
                <td>${row.idx }</td>
                <td>${row.userid }</td>
                <td>${row.userpw}</td>
                <td>${row.nick }</td>
                <td>${row.email }</td>
                <td>${row.join_date }</td>
            </tr>
        </c:forEach>
    </table>


</section>

</body>
</html>
