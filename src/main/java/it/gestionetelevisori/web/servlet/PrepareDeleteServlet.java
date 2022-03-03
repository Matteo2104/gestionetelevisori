package it.gestionetelevisori.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.gestionetelevisori.service.MyServiceFactory;


@WebServlet("/PrepareDeleteServlet")
public class PrepareDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public PrepareDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("televisoreDaEliminare", MyServiceFactory.getTelevisoreServiceInstance().trovaDaId(Long.parseLong(request.getParameter("idDaInviareComeParametro"))));
		RequestDispatcher rd = request.getRequestDispatcher("delete.jsp");
		rd.forward(request, response);
	}


}
