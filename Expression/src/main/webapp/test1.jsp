<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Test 1 file is opened </h2>

<c:set var="a" value="100"></c:set>

a=<c:out value="${a}"></c:out>
<br>

<hr/>
 <!-- <c:url var="myurl1" value="https://www.bing.com/search">
<c:param name="q" value="geeks for geeks"></c:param>

</c:url>
<h1> <c:out value="${myurl }"></c:out></h1>
<c:redirect url="${myurl }"></c:redirect> -->
</body>
</html>