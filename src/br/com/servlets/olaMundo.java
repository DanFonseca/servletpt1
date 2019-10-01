package br.com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;

@WebServlet (urlPatterns = "/oi")
public class olaMundo extends HttpServlet {
	
	@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		PrintWriter out =  resp.getWriter();
		out.println("<html>"
				+ "<h1> Olá, esse é o site feito por servlet a</h1>"
				+ "</html");
	}
	


}
