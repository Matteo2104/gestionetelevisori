package it.gestionetelevisori.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.gestionetelevisori.model.Televisore;
import it.gestionetelevisori.service.MyServiceFactory;


@WebServlet("/ExecuteDeleteServlet")
public class ExecuteDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ExecuteDeleteServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Televisore televisoreDaEliminare =  MyServiceFactory.getTelevisoreServiceInstance().trovaDaId(Long.parseLong(request.getParameter("idTelevisoreDaRimuovere")));
	
		MyServiceFactory.getTelevisoreServiceInstance().rimuovi(televisoreDaEliminare);
		
		List<Televisore> listaTelevisoriTrovati = MyServiceFactory.getTelevisoreServiceInstance().listAll();
		request.setAttribute("listaTelevisoriCercati", listaTelevisoriTrovati);
		RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
		rd.forward(request, response);
	}

}
