package in.sp.backend;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/aaa")
public class login extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.service(arg0, arg1);
		System.out.println("this servlet is without web.xml");
	}
}
