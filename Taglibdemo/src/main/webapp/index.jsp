<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/WEB-INF/mylib.tld" prefix="t" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<% response.getWriter().println("ISO 3166-1 alpha-3 country code: " + iso3Country); %>
</head>
<body>
<t:Hello/>
<t:Date></t:Date>
</body>
</html>