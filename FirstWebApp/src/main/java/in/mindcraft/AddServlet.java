package in.mindcraft;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet

{
	
public void service(HttpServletRequest request, HttpServletResponse response) throws IOException
{
	int a = Integer.parseInt (request.getParameter("num1"));
	int b = Integer.parseInt (request.getParameter("num2"));
	int c=a+b;
	
	request.setAttribute("c", c);
	
	RequestDispatcher rd = request.getRequestDispatcher("sq");
	try {
		rd.forward(request, response);
	}catch (ServletException e) {
	}
}
}
	
