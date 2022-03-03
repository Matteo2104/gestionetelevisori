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


@WebServlet("/ExecuteUpdateServlet")
public class ExecuteUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ExecuteUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer prezzo = MyUtility.myParseInt(request.getParameter("prezzoUpdate"));
		if (prezzo == null) {
			prezzo = 0;
		} 
		Integer numeroCodici = MyUtility.myParseInt(request.getParameter("numerocodiciUpdate"));
		if (numeroCodici == null) {
			numeroCodici = 0;
		} 
		
		Televisore televisoreDaModificare = new Televisore(Long.parseLong(request.getParameter("idTelevisoreDaModificare")), request.getParameter("marcaUpdate"), request.getParameter("modelloUpdate"), prezzo, numeroCodici, request.getParameter("codiceUpdate"));
	
		MyServiceFactory.getTelevisoreServiceInstance().aggiorna(televisoreDaModificare);
		
		List<Televisore> listaTelevisoriTrovati = MyServiceFactory.getTelevisoreServiceInstance().listAll();
		request.setAttribute("listaTelevisoriCercati", listaTelevisoriTrovati);
		RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
		rd.forward(request, response);
	}

}
