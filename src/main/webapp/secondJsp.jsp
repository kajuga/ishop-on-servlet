<%--
  Created by IntelliJ IDEA.
  User: kajuga
  Date: 24.07.19
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Second JSP</title>
</head>
<body>
<h1>Second test JSP</h1>
<%--<% %>--%>
<p>
<%
String name = request.getParameter("name");
%>
    <%= "Hello " + name %>
</p>
</body>
</html>

