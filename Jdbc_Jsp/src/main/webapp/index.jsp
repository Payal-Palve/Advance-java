<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.DriverManager" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<% 
String username = request.getParameter("txtname");
String password = request.getParameter("txtpwd");

// Database connection parameters
String dbUrl = "jdbc:mysql://localhost:3306/data";
String dbUser = "root";
String dbPassword = "Root";

Connection con = null;
PreparedStatement pst = null;
ResultSet rs = null;

try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

    String query = "SELECT * FROM users WHERE uname =? AND upwd=?";
    pst = con.prepareStatement(query);
    pst.setString(1, username);
    pst.setString(2, password);

    rs = pst.executeQuery();

    if (rs.next()) {
        out.println("<h1>Logged in successfully<br>Welcome " + username + "</h1>");
    } else {
        out.println("<h1>Invalid user</h1>");
    }
} catch (Exception e) {
    out.println("<h1>Error: " + e.getMessage() + "</h1>");
} finally {
    // Closing resources
    try {
        if (rs != null) rs.close();
        if (pst != null) pst.close();
        if (con != null) con.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}


%>

 <img src="images/pic.jfif" alt="Example Image">
</body>

</html>