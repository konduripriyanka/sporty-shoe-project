<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.example.demo.*"%>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><i>List of shoes</i></h1>
<%List<Shoes> s=(List<Shoes>)request.getAttribute("list");%>
<table border='1'>
<tr><th>shoe_id</th><th>shoe_name</th><th>shoe_price</th></tr>

<%for(Shoes ss:s){ %>
<tr><td><%=ss.getShid()%></td><td><%=ss.getShname()%></td><td><%=ss.getShprice()%></td><td><a href="update.jsp">update</a></td>
<td><a href="delete.jsp">delete</a></td>
</tr>

<%}%>
</table>
</body>
</html>