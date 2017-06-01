<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
	<head>
		<link rel = "stylesheet" href = "https://www.w3schools.com/w3css/4/w3.css">
		<link rel = "stylesheet" href = "css/style.css">
		<title> Informazioni autore </title>
	</head>
	<body>
		<header> <h1> Galleria </h1> </header>
		<nav class = "w3-bar w3-red">
			<ul class = "nav-list">
				<li class = "nav-item"> <a class = "w3-bar-item w3-button" href = "layout.html"> Home </a> </li>
				<li class = "nav-item"> <a class = "w3-bar-item w3-button" href = "layout.html"> Contatti </a> </li>
				<li class = "nav-item"> <a class = "w3-bar-item w3-button" href = "layout.html"> Quadri </a> </li>
				<li class = "nav-item"> <a class = "w3-bar-item w3-button" href = "layout.html"> Autori </a> </li>
				<li class = "nav-item"> <a class = "w3-bar-item w3-button" href = "layout.html"> Contatti </a> </li>
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
		<footer class = "w3-bar w3-red" style = "text-align: center;">
			<p> Progetto giugno 2017 - Sistemi Informativi su Web - Università Roma Tre </p>
			<p> Design by <a href = "layout.html"> Matteo Petruzziello</a> &amp; <a href = "layout.html"> Marco Peroni </a> </p>
		</footer>
	</body>
</html>