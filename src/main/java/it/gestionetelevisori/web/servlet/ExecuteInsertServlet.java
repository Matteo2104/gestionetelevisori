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
import it.gestionetelevisori.utility.MyUtility;


@WebServlet("/ExecuteInsertServlet")
public class ExecuteInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ExecuteInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String marca = request.getParameter("marca");
		String modello = request.getParameter("modello");
		Integer prezzo = MyUtility.myParseInt(request.getParameter("prezzo"));
		if (prezzo == null) {
			prezzo = 0;
		} 
		Integer numeroCodici = MyUtility.myParseInt(request.getParameter("numerocodici"));
		if (numeroCodici == null) {
			numeroCodici = 0;
		} 
		String codice = request.getParameter("codice");
		
		if (marca == null || modello == null || prezzo == 0 || numeroCodici == 0 || codice == null) {
			request.setAttribute("messaggioDiErrore", "Errore di validazione campi");
			RequestDispatcher rd = request.getRequestDispatcher("insert.jsp");
			rd.forward(request, response);
			return;
		}
		
		Televisore televisoreDaAggiungere = new Televisore(marca, modello, prezzo, numeroCodici, codice);
		MyServiceFactory.getTelevisoreServiceInstance().inserisciNuovo(televisoreDaAggiungere);	
		
		List<Televisore> listaTelevisoriTrovati = MyServiceFactory.getTelevisoreServiceInstance().listAll();
		request.setAttribute("listaTelevisoriCercati", listaTelevisoriTrovati);
		RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
		rd.forward(request, response);
	
		
	}

}
