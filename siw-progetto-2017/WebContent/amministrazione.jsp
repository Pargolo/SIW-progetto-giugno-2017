<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset = "utf-8">
		<link rel = "stylesheet" href = "https://www.w3schools.com/w3css/4/w3.css">
		<link rel = "stylesheet" href = "css/style.css">
		<script src = "js/amministrazione.js"></script>
		<title> Amministrazione Galleria </title>
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
		<div class = "container">
			<form>
				<div style = "text-align: center;">
					<button type="button" onclick = "impostaFormAutore();"> Inserisci nuovo autore </button>
					<button type="button" onclick = "impostaFormOpera();"> Inserisci nuova opera </button>
				</div>
				<div> <label> Parametro </label> </div>
				<div> <input type = "text" name = "parametro" placeholder = "parametro"> </div>
				<div> <label> Parametro </label> </div>
				<div> <input type = "text" name = "parametro" placeholder = "parametro"> </div>
				<div> <label> Parametro </label> </div>
				<div> <input type = "text" name = "parametro" placeholder = "parametro"> </div>
				<div> <label> Parametro </label> </div>
				<div> <input type = "text" name = "parametro" placeholder = "parametro"> </div>
				<div> <label> Parametro </label> </div>
				<div> <input type = "text" name = "parametro" placeholder = "parametro"> </div>
				<div style = "text-align: center;">
					<input type = "submit" name = "invia" value = "invia">
					<input type = "reset" value = "ripristina">
				</div>
			</form>
		</div>
		<footer class = "w3-bar" style = "text-align: center;">
			<p> Progetto giugno 2017 - Sistemi Informativi su Web - Università Roma Tre </p>
			<p> Design by <a href = "#"> Matteo Petruzziello</a> &amp; <a href = "#"> Marco Peroni </a> </p>
		</footer>
	</body>
</html>