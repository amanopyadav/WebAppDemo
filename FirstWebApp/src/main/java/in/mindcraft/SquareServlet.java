package in.mindcraft;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet{


	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException{
	int c = (int)request.getAttribute("c");
	
	int square = c*c;
	
	response.getWriter().println("Square of addition - "+square);
}
}
	
 Cookie cookie = new cookie("c",c+"");
 response.addCookie(cookie);
 response.sendRedirect("result.jsp");
  