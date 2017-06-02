<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset = "utf-8">
		<link rel = "stylesheet" href = "https://www.w3schools.com/w3css/4/w3.css">
		<link rel = "stylesheet" href = "css/style.css">
		<title> Informazioni autore </title>
	</head>
	<body>
		<nav class = "w3-bar">
			<ul class = "nav-list">
				<li class = "nav-item"> <a class = "w3-bar-item w3-button" href = "index.html"> Home </a> </li>
				<li class = "nav-item"> <a class = "w3-bar-item w3-button" href = "stanza"> Stanze </a> </li>
				<li class = "nav-item"> <a class = "w3-bar-item w3-button" href = "opera"> Opere </a> </li>
				<li class = "nav-item"> <a class = "w3-bar-item w3-button" href = "autore"> Autori </a> </li>
				<li class = "nav-item"> <a class = "w3-bar-item w3-button" href = "contatti.html"> Contatti </a> </li>
			</ul>
		</nav>
		<div class = "container" style = "padding-left: 20%; padding-right: 20%;">
			<div class = "w3-row">
				<div class = "w3-half"> <img src = "img/autore-sconosciuto.jpg" alt = "Autore sconosciuto">
					Immagine (opzionale) dell'autore
				</div>
				<div class = "w3-half">
					Informazioni autore
				</div>

			</div>
			<div>
				<ul>
					<c:forEach var = "opera" items = "opere">
						<li> <a href = "controller?id=${opera.id}"> ${opera.titolo} (${opera.artista.cognome}) </a> </li>
					</c:forEach>
				</ul>
			</div>
		</div>
		<footer class = "w3-bar" style = "text-align: center;">
			<p> Progetto giugno 2017 - Sistemi Informativi su Web - UniversitÓ Roma Tre </p>
			<p> Design by <a href = "#"> Matteo Petruzziello</a> &amp; <a href = "#"> Marco Peroni </a> </p>
		</footer>
	</body>
</html>