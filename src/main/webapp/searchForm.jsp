<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		Inserire dati da ricercare<br><br>
	<form action="SearchServlet" method="post">
	
		<label for="marcaInputId">MARCA:</label><br>
		<input type="text" name="marcaInput" id="marcaInputId">
		<br>
		
		<label for="modelloInputId">MODELLO:</label><br>
		<input type="text" name="modelloInput" id="modelloInputId">
		<br>
		
		<label for="prezzoInputId">PREZZO:</label><br>
		<input type="text" name="prezzoInput" id="prezzoInputId">
		<br>
		
		<label for="numeroCodiciInputId">NUMERO CODICI:</label><br>
		<input type="text" name="numeroCodiciInput" id="numeroCodiciInputId">
		<br>
		
		<label for="codiceInputId">CODICE:</label><br>
		<input type="text" name="codiceInput" id="codiceInputId">
		<br><br>
		
		<input type="submit" value="CERCA">
		
	</form>
</body>
</html>