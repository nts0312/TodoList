<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!--Form tag library used for 2-way validation-->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>
<html>
<head>
<%@ include file="common/header.jspf" %>
<link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css" rel="stylesheet" >
<title>Add Todo Page</title>
</head>
<body>

<%@ include file="common/navigation.jspf" %>

<div class="container">
    <h1>Enter Todo Details</h1>
    <form:form method="post" modelAttribute = "todo">

        <fieldset class="mb-3">
          <form:label path = "description" >Description</form:label>
          <form:input type = "text" path = "description" required="required"/>
          <form:errors path = "description" cssClass = "text-warning"/>
        </fieldset>

        <fieldset class="mb-3">
            <form:label path = "targetDate" >Target Date</form:label>
            <form:input type = "text" path = "targetDate" required="required"/>
            <form:errors path = "targetDate" cssClass = "text-warning"/>
        </fieldset>

<form:input type = "hidden" path = "id" />
<form:input type = "hidden" path = "done" />

<input type = "submit" class="btn btn-success"/>
    </form:form>
</div>

<%@ include file ="common/footer.jspf" %>

<script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
<script type="text/javascript">
	$('#targetDate').datepicker({
	    format: 'yyyy-mm-dd'
	});
</script>

</body>
</html>