<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset = "utf-8">
		<meta name = "viewport" content = "width = device-width, initial-scale = 1">
		<link rel = "stylesheet" href = "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<link rel = "stylesheet" href = "https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
		<link rel = "stylesheet" href = "css/style.css">
		<script src = "https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"> </script>
		<script src = "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"> </script>
		<script src = "js/galleria.js" charset = "utf-8"></script>	
		<title> Informazioni autore </title>
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
					<c:forEach var = "opera" items = "${autore.opere}">
						<li> <a href = "opera?id=${opera.id}"> ${opera.titolo} </a> </li>
					</c:forEach>
				</ul>
			</div>
		</div>
		<footer>
			<div class = "container-fluid">
				<div class = "row">
					<div class = "col-md-2"></div>
					<div class = "col-md-4">
						<ul style = "font-size: x-large; list-style: none;">
							<li> <p> Progetto giugno 2017 </p> </li>
							<li> <p> Sistemi Informativi su Web </p> </li>
							<li> <p> <a href = "http://informatica.ing.uniroma3.it"> <img src = "img/roma-tre-logo.png" style = "width: auto;"> </a> </p> </li>
						</ul>
					</div>
					<div class = "col-md-4">
						<ul style = "font-size: x-large; list-style: none;">
							<li>
								<p> Powered and designed by </p>
							</li>
							<li>
								<p>
									<a class = "undecorated-link" href = "#"> Matteo Petruzziello</a>
									<a class = "undecorated-link" href = "https://www.facebook.com/matteo.petruzziello"> <i class = "fa fa-facebook-square"></i> </a>
									<a class = "undecorated-link" href = "https://github.com/petruz93"> <i class = "fa fa-github-square"></i> </a>
								</p>
							</li>
							<li>
								<p>
									<a class = "undecorated-link" href = "#"> Marco Peroni </a>
									<a class = "undecorated-link" href = "https://www.facebook.com/QuelBelPargolo"> <i class = "fa fa-facebook-square"></i> </a>
									<a class = "undecorated-link" href = "https://github.com/Pargolo"> <i class = "fa fa-github-square"></i> </a>
								</p>									
							</li>
						</ul>
					</div>
					<div class = "col-md-2"></div>
				</div>
			</div>
		</footer>
	</body>
</html>