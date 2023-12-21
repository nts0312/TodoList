<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    
    
<!DOCTYPE html>
<html>
<head>
<%@ include file="common/header.jspf" %>
<title>Todo List</title>
</head>
<body>

<%@ include file="common/navigation.jspf" %>

<div class = "container">
 <div><h1>Your Todos are </h1></div>


<table class="table">
<thead>
<tr>

<th>Description</th>
<th>Target Date</th>
<th>Is Done</th>
</tr>
</thead>

</tbody>


<c:forEach items = "${todos}" var = "todo">

<tr>
<td>${todo.description}</td>
<td>${todo.targetDate}</td>
<td>${todo.done}</td>
<td><a href="delete-todo?id=${todo.id}" class="btn btn-warning">Delete</a></td>
<td><a href="update-todo?id=${todo.id}" class="btn btn-success">Update</a></td>

</tr>

</c:forEach>

</tbody>
</table>

<a href ="add-todo" class="btn btn-success"> Add Todo </a>

<%@ include file ="common/footer.jspf" %>
</div>
</body>
</html>