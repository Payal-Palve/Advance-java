package servlet.code;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.code.Dbutil;

public class UserServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String acc_id = (String) req.getAttribute("account_id");
         String name=(String) req.getAttribute("name");
		PrintWriter pw = res.getWriter();
          pw.println("<h3>hello welcome "+name +"</h3>");
        
		try {
			Connection con = Dbutil.getConnection();
			PreparedStatement pst = con.prepareStatement("Select * from account_transaction where acc_id = ?");
            
			pst.setString(1, acc_id);
           
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				pw.println("<h3> your account balance is : " + rs.getInt("balance") + "</h1><br>");
				pw.println("<h1> your account id : "+rs.getInt("acc_id")+"</h1>");

				req.getRequestDispatcher("User.html").include(req, res);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
