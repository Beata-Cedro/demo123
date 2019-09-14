<%@ page import="java.util.Optional" %><%--
  Created by IntelliJ IDEA.
  User: 48728
  Date: 28.07.2019
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tabliczka mnożenia</title>
    <style>
     table, td, th{
         border: 1px solid black;
     }
    </style>
</head>
<body>
<h1>Tabliczka mnożenia</h1>
<%
    int from =Integer.parseInt(request.getParameter("from"));
    int to =Integer.parseInt(request.getParameter("to"));

%>
<h1>Tabliczka mnożenia od<%=from%>do<%=to%>to%></h1>
<table>
    <tr>
    <%for(int i=from; i<=to; i++){%>
        <th><%=i%></th>
    <% }%>
    </tr>
    <%for(int i=from; i<=to; i++){%>
    <tr>
        <th><%=i%></th>

    <%for(int j=from; j<=to; j++){%>
    <td><%=i*j%></td>
        <% }%>
    </tr>
    <% }%>
</table>

</body>
</html>
