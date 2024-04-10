<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.emp.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Next Page</title>
</head>
<body>
<jsp:useBean id="obj1" class="com.emp.Employee"/>
<%obj1.setId(101) ;
   obj1.setName("sanchita");
   obj1.setSalary(8000);


%>
<strong>


Employee number : <%=obj1.getId() %><br>
Employee Name : <%=obj1.getName() %><br>
Employee Salary : <%=obj1.getSalary() %>
</strong>
</body>
</html>
