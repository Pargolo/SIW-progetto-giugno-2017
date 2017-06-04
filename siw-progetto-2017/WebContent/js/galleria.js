function impostaFormLogin() {
	var form = document.createElement("form");
	form.className = "navbar-form";
	form.action = "amministratore";
	form.method = "post";
	form.appendChild(creaInputUsername());
	form.appendChild(creaInputPassword());
	form.appendChild(creaInputLogin());

	var container =	document.getElementById("form-container");
	container.innerHTML = "";
	container.appendChild(form);
}

function creaInputUsername() {
	var input = document.createElement("input");
	input.className = "form-control";
	input.type = "text";
	input.name = "username";
	input.placeholder = "username";

	div = document.createElement("div");
	div.className = "form-group";
	div.appendChild(input);

	return div;
}

function creaInputPassword() {
	input = document.createElement("input");
	input.className = "form-control";
	input.type = "password";
	input.name = "password";
	input.placeholder = "password";


	div = document.createElement("div");
	div.className = "form-group";
	div.appendChild(input);

	return div;
}

function creaInputLogin() {
	input = document.createElement("input");
	input.className = "form-control";
	input.type = "submit";
	input.name = "login";
	input.value = "login";


	div = document.createElement("div");
	div.className = "form-group";
	div.appendChild(input);

	return div;
}