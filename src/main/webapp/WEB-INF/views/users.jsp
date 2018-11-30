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
<p class="headTitle">List All Users</p>
<table class="userTable">
    <tr>
        <th>Name</th>
        <th>Age</th>
        <th>Email</th>
        <th colspan=2>Action</th>
    </tr>
    <c:forEach var="user" items="${userList}">
        <tr>
            <td><a href="/user/${user.id}">${user.name}</a></td>
            <td>${user.age}</td>
            <td>${user.email}</td>
            <td><a href="/edit_user/${user.id}">Edit</a></td>
            <td><a href="/delete_user/${user.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
<div class="addButton"><button onclick="location.href='/add_user'">Add new user</button></div>
</body>
</html>
