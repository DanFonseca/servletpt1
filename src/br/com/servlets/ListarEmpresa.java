package br.com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.crypto.provider.DESParameters;

@WebServlet (urlPatterns = "/listar")
public class ListarEmpresa extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		Banco <Empresa> bd = new Banco <Empresa> ();
		List <Empresa> list = bd.getDados();
		
		PrintWriter out = resp.getWriter();
		
		//chamar JSP
		req.setAttribute("listaEmpresas", list);
		RequestDispatcher rd = req.getRequestDispatcher("/listarEmpresa.jsp");
		rd.forward(req, resp);
	}
}
