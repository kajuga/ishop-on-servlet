<%@ page import="sashokTestServlet.Cart" %><%--
  Created by IntelliJ IDEA.
  User: kajuga
  Date: 25.07.19
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show cart</title>
</head>
<body>
<%@ page import="sashokTestServlet.Cart" %>

<% Cart cart = (Cart)session.getAttribute("cart"); %>

<p style="background-color:DodgerBlue;">Наименование: <%= cart.getName()%></p>
<p>Количество: <%= cart.getQuantity()%></p>

</body>
</html>
