package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/registerForm")
public class Register extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String gender = req.getParameter("gender");
		String city = req.getParameter("city");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_authentication", "root","");
			PreparedStatement ps = con.prepareStatement("INSERT INTO register (name,email,password,gender,city) VALUES(?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, password);
			ps.setString(4, gender);
			ps.setString(5, city);
			int count = ps.executeUpdate();
			if(count>0) {
				resp.setContentType("text/html");
				out.println("<h3 style='color:green'>User registered successfully</h3>");
				HttpSession session = req.getSession();
				session.setAttribute("name", name);
				RequestDispatcher rd = req.getRequestDispatcher("/dashboard.jsp");
				rd.include(req, resp);
			}
			else
			{
				resp.setContentType("text/html");
				out.println("<h3 style='color:green'>User registration failed !</h3>");
				RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
				rd.include(req, resp);
			}
		} catch (Exception e) {
			// TODO: handle exception
			out.println(e);		}

	}
}
