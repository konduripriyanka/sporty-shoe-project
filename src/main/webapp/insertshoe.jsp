<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="insertshoe">

shname<input type="text" name="shname"><br>
shprice<input type="text" name="shprice"><br>
<input type="submit" value="insert">
</form>
<h1><i>shoe details</i></h1>
<form action="getallshoes">
<input type="submit" value="shoelist">

</form>
</body>

</html>