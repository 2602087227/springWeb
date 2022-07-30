<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022/7/20
  Time: 17:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
    <script>
        var userList = new Array();
        userList.push({name:"lisi",age:17});
        userList.push({name:"zhangsan",age:18});

        $.ajax({
            type:"POST",
            url:"${pageContext.request.contextPath}/test/quick17",
            data:JSON.stringify(userList),
            contentType:"application/json;charset:utf-8"
        })
    </script>
</head>
<body>

</body>
</html>
