<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset = "utf-8">
		<title> Elenco opere </title>
	</head>
	<body>
		<nav>
			<form action = "controller" method = "get">
				<input type = "submit" name = "comando" value = "home"/>
				<input type = "submit" name = "comando" value = "artisti"/>
				<input type = "submit" name = "comando" value = "opere"/>
			</form>
		</nav>
		<div>
			<ul>
				<c:forEach var = "opera" items = "opere">
					<li> <a href = "controller?id=${opera.id}"> ${opera.titolo} (${opera.artista.cognome}) </a> </li>
				</c:forEach>
			</ul>
		</div>
		<footer>
			<p> Progetto giugno 2017 - Sistemi Informativi su Web - Università Roma Tre </p>
			<p> Design by &diams; Matteo&diams; &amp; &clubs; Marco&clubs; </p>
		</footer>
	</body>
</html>