<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset = "utf-8">
		<link rel = "stylesheet" href = "https://www.w3schools.com/w3css/4/w3.css">
		<link rel = "stylesheet" href = "css/style.css">
		<title> Elenco autori </title>
	</head>
	<body>
		<nav class = "w3-bar w3-red">
			<ul class = "nav-list">
				<li class = "nav-item"> <a class = "w3-bar-item w3-button" href = "index.html"> Home </a> </li>
				<li class = "nav-item"> <a class = "w3-bar-item w3-button" href = "stanza"> Stanze </a> </li>
				<li class = "nav-item"> <a class = "w3-bar-item w3-button" href = "opera"> Opere </a> </li>
				<li class = "nav-item"> <a class = "w3-bar-item w3-button" href = "autore"> Autori </a> </li>
				<li class = "nav-item"> <a class = "w3-bar-item w3-button" href = "contatti.html"> Contatti </a> </li>
			</ul>
		</nav>
		<div>
			<ul>
				<c:forEach var = "autore" items = "autori">
					<li> <a href = "controller?id=${artista.id}"> ${artista.nome} ${artista.cognome} </a> </li>
				</c:forEach>
			</ul>
		</div>
		<footer class = "w3-bar w3-red" style = "text-align: center;">
			<p> Progetto giugno 2017 - Sistemi Informativi su Web - Università Roma Tre </p>
			<p> Design by <a href = "layout.html"> Matteo Petruzziello</a> &amp; <a href = "layout.html"> Marco Peroni </a> </p>
		</footer>
	</body>
</html>