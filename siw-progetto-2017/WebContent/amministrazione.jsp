<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset = "utf-8">
		<meta name = "viewport" content = "width = device-width, initial-scale = 1">
		<link rel = "stylesheet" href = "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<link rel = "stylesheet" href = "http://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
		<link rel = "stylesheet" href = "css/style.css">
		<script src = "https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"> </script>
		<script src = "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"> </script>
		<script src = "js/amministrazione.js" charset = "utf-8"></script>
		<title> Amministrazione Galleria </title>
	</head>
	<body>
		<nav class = "navbar navbar-default navbar-fixed-top">
			<div class = "container-fluid">
				<div class="navbar-header">
					<button type = "button" class = "navbar-toggle" data-toggle = "collapse" data-target = "#galleria-navbar">
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>                        
					</button>
					<a class = "navbar-brand" href = "index.html"> Galleria </a>
				</div>
				<div class = "collapse navbar-collapse" id = "galleria-navbar">
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
		<div class = "container-fluid">
			<div class = "row">
				<div class = "col-xs-4"></div>
				<div class = "col-xs-4">
					<div class = "form-group form-inline" style = "text-align: center">
						<button id = "autore-button" class = "form-control" type = "button" onclick = "impostaFormAutore()"> Inserisci nuovo autore </button>
						<button id = "opera-button" class = "form-control" type = "button" onclick = "impostaFormOpera()"> Inserisci nuova opera </button>
					</div>
					<form id = "inserimento-form" action = "autore" method = "post">
					</form>
				</div>
				<div class = "col-xs-4"></div>
			</div>
		</div>
		<footer>
			<div class = "container-fluid">
				<div class = "row">
					<div class = "col-xs-2"></div>
					<div class = "col-xs-3">
						<p> Progetto giugno 2017 - Sistemi Informativi su Web - Università Roma Tre </p>
					</div>
					<div class = "col-xs-2"></div>
					<div class = "col-xs-3">
						<p> Powered and designed by </p>
					</div>
					<div class = "col-xs-2"></div>
				</div>
				<div class = "row">
					<div class = "col-xs-2"></div>
					<div class = "col-xs-3">
						<p> <a href = "http://informatica.ing.uniroma3.it"> <img src = "img/roma-tre-logo.png" style = "width: auto;"> </a> </p>
					</div>
					<div class = "col-xs-2"></div>
					<div class = "col-xs-3">
						<div class = "row">
							<div class = "col-xs-6">
								<p> <a href = "#"> Matteo Petruzziello</a> </p>
							</div>
							<div class = "col-xs-6">
								<p> <a href = "#"> Marco Peroni </a> </p>
						</div>
						<div class = "row">
							<div class = "col-xs-6">
								<p>
									<a href = "https://www.facebook.com/matteo.petruzziello"> <i class = "ion-social-facebook"></i> </a>
									<a href = "https://github.com/petruz93"> <i class = "ion-social-github"></i> </a>
								</p>
							</div>
							<div class = "col-xs-6">
								<p>
									<a href = "https://www.facebook.com/QuelBelPargolo"> <i class = "ion-social-facebook"></i> </a>
									<a href = "https://github.com/Pargolo"> <i class = "ion-social-github"></i> </a>
								</p>
							</div>
						</div>
					</div>
					<div class = "col-xs-2"></div>
				</div>
			</div>
		</footer>
	</body>
</html>