package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/loginForm")
public class login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_authentication","root","123456");
			PreparedStatement ps = con.prepareStatement("SELECT *FROM register WHERE email = ? and password = ?");
			ps.setString(1, email);
			ps.setString(2, password);
		    ResultSet rs =	ps.executeQuery();
		    if(rs.next()) {
		    	HttpSession session = req.getSession();
		    	session.setAttribute("name", rs.getString("name"));
		    	RequestDispatcher rd = req.getRequestDispatcher("dashboard.jsp");
		    	rd.include(req, resp);
		    }
		    else
		    {
		    	out.println("<h3 style='color:red'>User registration failed !</h3>");
		    	RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
		    }
		} catch (Exception e) {
			out.println(e.getMessage());
		}

	}
}
