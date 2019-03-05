<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>表单</h2>
<hr/>
<form action="/user/save" method="post">
    username: <input type="text" name="username"/><br/>
    password: <input type="password" name="password"/><br/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
