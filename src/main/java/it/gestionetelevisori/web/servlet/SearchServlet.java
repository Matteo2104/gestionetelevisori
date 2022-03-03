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

@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public SearchServlet() {
        super();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer prezzo = MyUtility.myParseInt(request.getParameter("prezzoInput"));
		if (prezzo == null) {
			prezzo = 0;
		} 
		Integer numeroCodici = MyUtility.myParseInt(request.getParameter("numeroCodiciInput"));
		if (numeroCodici == null) {
			numeroCodici = 0;
		} 
		
		Televisore televisoreCercato = new Televisore(request.getParameter("marcaInput"), request.getParameter("modelloInput"), prezzo, numeroCodici, request.getParameter("codiceInput"));
		List<Televisore> resultList = MyServiceFactory.getTelevisoreServiceInstance().trovaDaEsempio(televisoreCercato);
		
		request.setAttribute("listaTelevisoriCercati", resultList);
		RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
		rd.forward(request, response);
	}

}
