<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022/7/20
  Time: 18:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/test/quick16">
    <input type="text" name="userList[0].name">
    <input type="text" name="userList[0].age">
    <input type="text" name="userList[1].name">
    <input type="text" name="userList[1].age">
    <button type="submit">提交</button>
</form>
</body>
</html>
