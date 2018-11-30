<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new user</title>
    <style type="text/css">
        <%@include file="../css/styles.css" %>
    </style>
</head>
<body>
    <div>
        <p class="headTitle">Add new User:</p>
    </div>
    <div class="form">
        <form action="/add_user" method="post">
            <div class="field">
                <label for="name">Name</label>
                <input type="text" id="name" name="name"/>
            </div>
            <div class="field">
                <label for="age">Age</label>
                <input type="text" id="age" name="age"/>
            </div>
            <div class="field">
                <label for="email">Email</label>
                <input type="email" id="email" name="email"/>
            </div>
            <div class="submitButton"><button type="submit">Submit</button></div>
        </form>
    </div>
</body>
</html>
