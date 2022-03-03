<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="it.gestionetelevisori.model.Televisore"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pagina dei risultati</title>
<style type="text/css">
	table, th, td {
	  border: 1px solid black;
	}
	
	th, td {
	  padding: 10px;
	}
	.center {
		margin-left: auto;
		margin-right: auto;
	}
</style>
</head>
<body>
	<table class="center">
		<thead>
			<tr>
				<th>Marca</th>
				<th>Modello</th>
				<th>Prezzo</th>
				<th>Azione</th>
			</tr>
		</thead>
		
		<% List<Televisore> listaDaServlet = (List<Televisore>)request.getAttribute("listaTelevisoriCercati");
							for(Televisore televisore : listaDaServlet){
				%>
				<tr>
					<td><%=televisore.getMarca() %></td>
					<td><%=televisore.getModello() %></td>
					<td><%=televisore.getPrezzo() %></td>
					<td>
						<a href="VisualizzaDettaglioServlet?idDaInviareComeParametro=<%=televisore.getId() %>">Dettagli</a>
					
						<a href="PrepareUpdateServlet?idDaInviareComeParametro=<%=televisore.getId() %>">Modifica</a>
					
						<a href="PrepareDeleteServlet?idDaInviareComeParametro=<%=televisore.getId() %>">Rimuovi</a>
					</td>
				</tr>
		<%	}%>
	
	</table>
	
	<a href="PrepareInsertServlet">Aggiungi</a>
	
	
	
</body>
</html>