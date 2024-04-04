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

public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        PrintWriter out = res.getWriter();
        res.setContentType("text/html");
        Connection con = null;
        PreparedStatement pstInsert = null;
        PreparedStatement pstSelect = null;
        ResultSet rs = null;
        
        try {
            String name = req.getParameter("name");
            String email = req.getParameter("email");
            String mobile = req.getParameter("mobile");
            String password = req.getParameter("password");
            int balance = Integer.parseInt(req.getParameter("balance"));
            
            con = Dbutil.getConnection();
            
            // Insert into acc_holder
            pstInsert = con.prepareStatement("INSERT INTO acc_holder (acc_name, acc_password, email, mob) VALUES (?, ?, ?, ?)", PreparedStatement.RETURN_GENERATED_KEYS);
            pstInsert.setString(1, name);
            pstInsert.setString(2, password);
            pstInsert.setString(3, email);
            pstInsert.setString(4, mobile);
            pstInsert.executeUpdate();
            
            // Get the generated acc_id
            rs = pstInsert.getGeneratedKeys();
            int accId = 0;
            if (rs.next()) {
                accId = rs.getInt(1);
            }
            
            // Insert into account_transaction
            pstSelect = con.prepareStatement("INSERT INTO account_transaction (acc_id, balance) VALUES (?, ?)");
            pstSelect.setInt(1, accId);
            pstSelect.setInt(2, balance);
            pstSelect.executeUpdate();
            
            // Success message
            out.println("<h2>User registration done successfully</h2>");
            out.println("<br></br>");
            out.println("<a href='Login.html'>Login here</a>");
            
            // Forward to login page
            RequestDispatcher rd = req.getRequestDispatcher("Login.html");
            rd.include(req, res);
            
        } catch (SQLException | ClassNotFoundException | NumberFormatException e) {
            // Error handling
            e.printStackTrace();
            out.println("<h4>An error occurred. Please try again later.</h4>");
        } finally {
            // Close resources
          try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        }
    }
}
