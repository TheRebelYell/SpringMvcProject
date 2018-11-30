<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Add new user</title>
    <style type="text/css">
        <%@include file="../css/styles.css" %>
    </style>
</head>
<body>
    <div>
        <p class="headTitle">Edit User:</p>
    </div>
    <div class="form">
        <form method="post">
            <div class="field">
                <label for="name">First Name</label>
                <input type="text" id="name" name="name"
                       value=${user.name} />
            </div>
            <div class="field">
                <label for="age">Birthday</label>
                <input type="text" id="age" name="age"
                       value=${user.age} />
            </div>
            <div class="field">
                <label for="email">Email</label>
                <input type="email" id="email" name="email"
                       value=${user.email} />
            </div>
            <div class="submitButton">
                <button type="submit">Submit</button>
            </div>
        </form>
    </div>
</body>
</html>
