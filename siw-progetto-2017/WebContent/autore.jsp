<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset = "utf-8">
		<link rel = "stylesheet" href = "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<link rel = "stylesheet" href = "https://www.w3schools.com/w3css/4/w3.css">
		<link rel = "stylesheet" href = "css/style.css">
		<script src = "js/galleria.js"></script>		
		<title> Informazioni autore </title>
	</head>
	<body>
		<nav class = "navbar navbar-default navbar-fixed-top">
			<div class = "container-fluid">
				<div class = "navbar-header"> <a class = "navbar-brand" href = "#"> Galleria </a> </div>
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
							<button class = "form-control" onclick = "impostaFormLogin()"> <i class = "glyphicon glyphicon-log-in"> </i> Login amministratore </button>
						</div>
					</div>
				</div>
			</div>
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
		<footer>
			<p> Progetto giugno 2017 - Sistemi Informativi su Web - Università Roma Tre </p>
			<p> Powered and designed by <a href = "#"> Matteo Petruzziello</a> &amp; <a href = "#"> Marco Peroni </a> </p>
		</footer>
	</body>
</html>