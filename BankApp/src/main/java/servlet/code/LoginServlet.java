package servlet.code;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.code.Dbutil;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        PrintWriter out = res.getWriter();
        res.setContentType("text/html");
        String account_id = req.getParameter("account_id");
        String password = req.getParameter("password");

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            con = Dbutil.getConnection();
            pst = con.prepareStatement("SELECT * FROM acc_holder WHERE acc_id = ? AND acc_password = ?");
            pst.setString(1, account_id);
            pst.setString(2, password);

            rs = pst.executeQuery();

            if (rs.next()) {
                out.println("<h2>User logged in</h2>");
                req.setAttribute("account_id", rs.getString("acc_id"));
                req.setAttribute("name", rs.getString("acc_name"));
                RequestDispatcher rd = req.getRequestDispatcher("user");
                rd.forward(req, res);
                
            } else {
                out.println("<h4>Invalid user. Please register</h4>");
                out.println("<br></br>");
                out.println("<a href='Register.html'>Register here</a>");
                RequestDispatcher rd = req.getRequestDispatcher("Login.html");
                rd.include(req, res);
            }
        } catch (SQLException e) {
            // Proper error handling/logging
            e.printStackTrace();
            // Forward to an error page or display a friendly error message to the user
            out.println("<h4>An error occurred. Please try again later.</h4>");
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
            // Close resources in reverse order of creation
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}