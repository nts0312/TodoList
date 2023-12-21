<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ include file="common/header.jspf" %>
<link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css" rel="stylesheet" >
<title>Welcome</title>
</head>
<body>

<%@ include file="common/navigation.jspf" %>

<div class="container">
<h1>WELCOME HERE</h1>
<hr>
<h2>Your name is ${name} </h2>
<a href = "list-todos">Manage</a> your Todos
</div>

<%@ include file ="common/footer.jspf" %>

</body>
</html>