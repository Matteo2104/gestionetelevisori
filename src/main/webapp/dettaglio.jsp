<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="it.gestionetelevisori.model.Televisore"%>
<%@page import="it.gestionetelevisori.service.MyServiceFactory"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table class="center">
			<thead>
				<tr>
					<th>Id</th>
					<th>Marca</th>
					<th>Modello</th>
					<th>Prezzo</th>
					<th>Numero Codici</th>
					<th>Codice</th>
				</tr>
			</thead>
			<% Televisore televisore = (Televisore)request.getAttribute("dettagliTelevisore"); %>
				<tr>
					<td><%=televisore.getId()%></td>
					<td><%=televisore.getMarca()%></td>
					<td><%=televisore.getModello()%></td>
					<td><%=televisore.getPrezzo()%></td>
					<td><%=televisore.getNumeroCodici()%></td>
					<td><%=televisore.getCodice()%></td>
				</tr>
		</table>
</body>
</html>