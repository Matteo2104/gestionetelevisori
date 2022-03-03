<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="it.gestionetelevisori.model.Televisore"%>
<%@page import="it.gestionetelevisori.service.MyServiceFactory"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pagina di aggiornamento televisore</title>
</head>
<body>
	<%Long idTelevisoreDaModificare = Long.parseLong(request.getParameter("idDaInviareComeParametro")); %>
	
	Modifica televisore: <%=MyServiceFactory.getTelevisoreServiceInstance().trovaDaId(idTelevisoreDaModificare).getMarca() %> <%=MyServiceFactory.getTelevisoreServiceInstance().trovaDaId(idTelevisoreDaModificare).getModello() %>
	<form action="ExecuteUpdateServlet" method="post">
		Marca:
		<input type="text" name="marcaUpdate">
		Modello:
		<input type="text" name="modelloUpdate">
		Prezzo:
		<input type="text" name="prezzoUpdate">
		Numero Codici:
		<input type="text" name="numerocodiciUpdate">
		Codice:
		<input type="text" name="codiceUpdate">
		
		<input type="hidden" value="<%=idTelevisoreDaModificare%>" name="idTelevisoreDaModificare">
		<input type="submit" value="Modifica Televisore" >
	</form>
</body>
</html>