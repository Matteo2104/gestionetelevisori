<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% if(request.getAttribute("messaggioDiErrore") != null){ %>
		<p style="color: red;"><%=request.getAttribute("messaggioDiErrore") %></p>
	<%  }else{ %>
		Inserire dati<br>
	<%}    %>
	<form action="ExecuteInsertServlet" method="post">
		Marca
		<input type="text" name="marca">
		Modello
		<input type="text" name="modello">
		Prezzo 
		<input type="text" name="prezzo">
		Numero Codici
		<input type="text" name="numerocodici">
		Codice
		<input type="text" name="codice">
		
		<input type="submit" value="Inserisci Nuovo Televisore" >
	</form>
</body>
</html>