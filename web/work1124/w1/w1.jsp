<%@ page import="com.day1124.Student" %><%--
  Created by IntelliJ IDEA.
  User: CYX
  Date: 2020/11/24
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <%
        session.setAttribute("student",new Student(1,"0176709008","123456",20,"15122223333"));
    %>
</head>
<body>

<form action="../../w1Servlet" method="get" >
    用户名：<input type="text" name="username"><br/>
    密码：<input type="password" name="password"><br/>
    <input type="submit">
</form>
</body>
</html>
