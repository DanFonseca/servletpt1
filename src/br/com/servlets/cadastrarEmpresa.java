package br.com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet ( urlPatterns =  "/cadastrar")
public class cadastrarEmpresa extends HttpServlet {

		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String nomeEmpresa = req.getParameter("nome");
			
			//criar objeto empresa.
			Empresa empresa = new Empresa (nomeEmpresa);
			
			//Salvar no BD
			Banco<Empresa> bd = new Banco <Empresa> ();
			bd.adicionar(empresa);
			
			//chamar o JSP 
			RequestDispatcher rd = req.getRequestDispatcher("/respStatus.jsp");
			req.setAttribute("msgStatus", nomeEmpresa);
		 	rd.forward(req, resp); 
			

		}
		
}
