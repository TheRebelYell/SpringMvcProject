<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>List of users</title>
    <style type="text/css">
        <%@include file="../css/styles.css" %>
    </style>
</head>
<body>
<p class="headTitle">User Info</p>
<table class="userTable">
    <tr>
        <td>Name</td>
        <td>${user.name}</td>
    </tr>
    <tr>
        <td>Age</td>
        <td>${user.age}</td>
    </tr>
    <tr>
        <td>Email</td>
        <td>${user.email}</td>
    </tr>
</table>

<div class="backButton"><button onclick="location.href='/users'">Back</button></div>
</body>
</html>
