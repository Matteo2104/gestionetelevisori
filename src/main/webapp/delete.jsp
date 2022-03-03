<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="it.gestionetelevisori.model.Televisore"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pagina di eliminazione televisore</title>
</head>
<body>
	<%Televisore televisoreDaEliminare = (Televisore)request.getAttribute("televisoreDaEliminare"); %>
	
	SEI SICURO DI VOLER ELIMINARE IL SEGUENTE TELEVISORE?
	<table class="center">
		<thead>
			<tr>
				<th>Id</th>
				<th>Nome</th>
				<th>Cognome</th>
				<th>Eta</th>
				<th>Codice Fiscale</th>
				<th>Motto di vita</th>
			</tr>
		</thead>
			<tr>
				<td><%=televisoreDaEliminare.getId() %></td>
				<td><%=televisoreDaEliminare.getMarca() %></td>
				<td><%=televisoreDaEliminare.getModello() %></td>
				<td><%=televisoreDaEliminare.getPrezzo() %></td>
				<td><%=televisoreDaEliminare.getNumeroCodici() %></td>
				<td><%=televisoreDaEliminare.getCodice() %></td>
			</tr>
	</table>
	
	<form action="ExecuteDeleteServlet" method="post">
		<input type="hidden" value="<%=televisoreDaEliminare.getId()%>" name="idTelevisoreDaRimuovere">
		<input type="submit" value="ELIMINA">
	</form>
</body>
</html>