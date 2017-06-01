<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
	<head>
		<link rel = "stylesheet" href = "https://www.w3schools.com/w3css/4/w3.css">
		<link rel = "stylesheet" href = "css/style.css">
		<title> Informazioni opera </title>
		<script type="text/javascript">
			function copia(elemento) {
				document.getElementById("opera").setAttribute("src", elemento.src);
			}
		</script>
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
		<div class = "container" style = "padding-left: 20%; padding-right: 20%;">
			<div class = "w3-row">
				<div class = "w3-half"> <img id = "opera" src = "img/autore-sconosciuto.jpg" alt = "Opera sconosciuta">
				</div>
				<div id ="info" class = "w3-half">
					<h1> Descrizione opera </h1>
				</div>
			</div>
			<div class = "w3-row">
				<div class = "w3-quarter"> <img src = "img/marco-asciugamano.png" alt = "Opera sconosciuta" onclick = "copia(this)"> </div>
				<div class = "w3-quarter"> <img src = "img/matteo-good.png" alt = "Opera sconosciuta" onclick = "copia(this)"> </div>
				<div class = "w3-quarter"> <img src = "img/pino.png" alt = "Opera sconosciuta" onclick = "copia(this)"> </div>
				<div class = "w3-quarter"> <img src = "img/porco-russo.png" alt = "Opera sconosciuta" onclick = "copia(this)"> </div>
			</div>
		</div>
		<footer class = "w3-bar w3-red" style = "text-align: center;">
			<p> Progetto giugno 2017 - Sistemi Informativi su Web - Università Roma Tre </p>
			<p> Design by <a href = "layout.html"> Matteo Petruzziello</a> &amp; <a href = "layout.html"> Marco Peroni </a> </p>
		</footer>
	</body>
</html>