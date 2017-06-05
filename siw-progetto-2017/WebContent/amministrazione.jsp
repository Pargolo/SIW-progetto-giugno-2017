<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset = "utf-8">
		<link rel = "stylesheet" href = "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<link rel = "stylesheet" href = "https://www.w3schools.com/w3css/4/w3.css">
		<link rel = "stylesheet" href = "css/style.css">
		<script src = "js/amministrazione.js"></script>
		<title> Amministrazione Galleria </title>
	</head>
	<body>
		<nav class = "navbar navbar-default navbar-fixed-top">
			<div class = "container-fluid">
				<div class = "navbar-header"> <a class = "navbar-brand" href = "index.html"> Galleria </a> </div>
				<div class = "collapse navbar-collapse">
					<ul class = "nav navbar-nav">
						<li> <a href = "index.html"> Home </a> </li>
						<li> <a href = "stanza"> Stanze </a> </li>
						<li> <a href = "opera"> Opere </a> </li>
						<li> <a href = "autore"> Autori </a> </li>
						<li> <a href = "contatti.html"> Contatti </a> </li>
					</ul>
					<div class = "nav navbar-nav navbar-right" id = "form-container">
						<div class = "navbar-form">
							<button class = "form-control"> <i class = "glyphicon glyphicon-log-out"> </i> Logout amministratore </button>
						</div>
					</div>
				</div>
			</div>
		</nav>
		<div class = "container">
			<form id = "inserimento-form" action = "autore" method = "post">		
				<div class = "form-group form-inline" style = "text-align: center">
					<button id = "autore-button" class = "form-control" type = "button" onclick = "impostaFormAutore()" disabled> Inserisci nuovo autore </button>
					<button id = "opera-button" class = "form-control" type = "button" onclick = "impostaFormOpera()"> Inserisci nuova opera </button>
				</div>
				<div class = "form-group">
					<label> Nome </label>
					<input class = "form-control" type = "text" name = "nome" placeholder = "Nome">
				</div>
				<div class = "form-group">
					<label> Cognome </label>
					<input class = "form-control" type = "text" name = "cognome" placeholder = "Cognome">
				</div>
				<div class = "form-group">
					<label> Nazionalità </label>
					<input class = "form-control" type = "text" name = "nazionalita" placeholder = "Nazionalità">
				</div>
				<div class = "form-group">
					<label> Data di nascita </label>
					<input class = "form-control" type = "date" name = "dataNascita">
				</div>
				<div class = "form-group">
					<label> Data di morte </label>
					<input class = "form-control" type = "date" name = "dataMorte">
				</div>
				<div class = "form-group form-inline" style = "text-align: center">
					<input class = "form-control" type = "submit" name = "invia" value = "invia">
					<input class = "form-control" type = "reset" value = "ripristina">
				</div>
			</form>
		</div>
		<footer>
			<p> Progetto giugno 2017 - Sistemi Informativi su Web - Università Roma Tre </p>
			<p> Powered and designed by <a href = "#"> Matteo Petruzziello</a> &amp; <a href = "#"> Marco Peroni </a> </p>
			<p> <a href = "http://informatica.ing.uniroma3.it"> <img src = "img/roma-tre-logo.png" style = "width: auto;"> </a> </p>
		</footer>
	</body>
</html>