<%--
  Created by IntelliJ IDEA.
  User: CYX
  Date: 2020/11/26
  Time: 18:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%  //
    StringBuilder bastPath=new StringBuilder();
    bastPath.append(request.getScheme());//协议名称
    bastPath.append("://");
    bastPath.append(request.getServerName());//主机名称
    bastPath.append(":");
    bastPath.append(request.getServerPort());//端口号
    bastPath.append(request.getContextPath());//工程名称
    bastPath.append("/");
%>
<html>

</html>
