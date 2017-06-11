function impostaFormLogin() {
	var form = document.createElement("form");
	form.className = "navbar-form";
	form.action = "amministratore";
	form.method = "post";

	var div = document.createElement("div");
	div.className = "form-group form-inline";
	div.appendChild(creaInput("form-control", "text", "username", "username", null));
	div.appendChild(creaInput("form-control", "password", "password", "password", null));
	div.appendChild(creaInput("form-control", "submit", "login", null, "login"));

	form.appendChild(div);

	var container =	document.getElementById("form-container");
	container.innerHTML = "";
	container.appendChild(form);
}