<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
  <head>
    <link
      href="webjars/bootstrap/5.2.3/css/bootstrap.min.css"
      rel="stylesheet"
    />
    <title>List of TODOs</title>
  </head>
  <body>
    <div>Welcome ${name}</div>
    <hr>
    <h1>Your Todos are</h1>

    <table>
      <thead>
        <tr>
          <th>id</th>
          <th>Description</th>
          <th>Target Date</th>
          <th>Is Done</th>
        </tr>
      </thead>

      <tbody>
        <c:forEach items="${todos}" var="todo">
          <tr>
            <td>${todo.id}</td>
            <td>${todo.description}</td>
            <td>${todo.targetDate}</td>
            <td>${todo}</td>
          </tr>
        </c:forEach>
      </tbody>
    </table>

    <scrip src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"/>
    <scrip src = "webjars/jquery/3.6.3/jquery.min.js"/>
  </body>
</html>



