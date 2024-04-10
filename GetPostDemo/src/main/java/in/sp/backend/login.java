package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class login extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.service(arg0, arg1);
		String user = request.getParameter("user");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		PrintWriter out = response.getWriter();
		if(email.equals("deepak@gmail.com") && password.equals("123456")) {
//			request.setAttribute("user",user);
			HttpSession session = request.getSession();
			session.setAttribute("user",user);
			RequestDispatcher rd = request.getRequestDispatcher("/dashboard.jsp");
			rd.forward(request, response);
//			out.println("Seccess !");
		}
		else {
			response.setContentType("text/html");
			out.println("<h4 style='color:red'>Please try again !!</h4>");
			
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			rd.include(request, response);
		}
	}
}
