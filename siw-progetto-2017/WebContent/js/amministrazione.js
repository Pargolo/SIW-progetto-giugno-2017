function impostaFormAutore() {
	document.getElementById("autore-button").disabled = true;
	document.getElementById("opera-button").disabled = false;

	var form = document.getElementById("inserimento-form");
	form.action = "autore";
	form.innerHTML = "";

	riempiFormAutore(form);
	aggiungiSubmitReset(form);
	
}

//function riempiFormAutore(form) {
//
//	var inputs = [
//		creaInput("form-control", "text", "nome", "Nome", null),
//		creaInput("form-control", "text", "cognome", "Cognome", null),
//		creaInput("form-control", "text", "nazionalita", "Nazionalità", null),
//		creaInput("form-control", "date", "dataNascita", "Data di nascita", null),
//		creaInput("form-control", "date", "dataMorte", "Data di morte", null)
//	];
//
//	for(i = 0; i < inputs.length; i++) {
//		var label = document.createElement("label");
//		label.innerHTML = inputs[i].placeholder;
//
//		var div = document.createElement("div");
//		div.className = "form-group";
//		div.appendChild(label);
//		div.appendChild(inputs[i]);
//
//		form.appendChild(div);
//	}
//
//}

function riempiFormAutore(form) {

	var div = creaDiv("form-group");
	var label = creaLabel("Nome* " + nomeError);
	var input = creaInput("form-control", "text", "nome", "Nome", null);

	div.appendChild(label);
	div.appendChild(input);
	form.appendChild(div);

	div = creaDiv("form-group");
	label = creaLabel("Cognome* " + cognomeError);
	input = creaInput("form-control", "text", "cognome", "Cognome", null);

	div.appendChild(label);
	div.appendChild(input);
	form.appendChild(div);

	div = creaDiv("form-group");
	label = creaLabel("Nazionalita* " + nazionalitaError);
	input = creaInput("form-control", "text", "nazionalita", "Nazionalità", null);

	div.appendChild(label);
	div.appendChild(input);
	form.appendChild(div);

	div = creaDiv("form-group");
	label = creaLabel("Data di nascita* " + dataNascitaError);
	input =	creaInput("form-control", "date", "dataNascita", "Data di nascita", null);

	div.appendChild(label);
	div.appendChild(input);
	form.appendChild(div);

	div = creaDiv("form-group");
	label = creaLabel("Data di morte " + dataMorteError);
	input =	creaInput("form-control", "date", "dataMorte", "Data di morte", null);

	div.appendChild(label);
	div.appendChild(input);
	form.appendChild(div);

}

function impostaFormOpera() {
	document.getElementById("autore-button").disabled = false;
	document.getElementById("opera-button").disabled = true;

	var form = document.getElementById("inserimento-form");
	form.action = "opera";
	form.innerHTML = "";

	riempiFormOpera(form);
	aggiungiSubmitReset(form);
}

function riempiFormOpera(form) {

	var inputs = [
		creaInput("form-control", "text", "titolo", "Titolo", null),
		creaInput("form-control", "number", "anno", "Anno di realizzazione", null),
		creaInput("form-control", "text", "tecnica", "Tecnica", null),
	];

	for(i = 0; i < inputs.length; i++) {
		var label = document.createElement("label");
		label.innerHTML = inputs[i].placeholder;

		var div = document.createElement("div");
		div.className = "form-group";
		div.appendChild(label);
		div.appendChild(inputs[i]);

		form.appendChild(div);
	}

	var divEsterno = document.createElement("div");
	divEsterno.className = "form-group";

	label = document.createElement("label");
	label.innerHTML = "Dimensioni";

	divEsterno.appendChild(label);

	div = document.createElement("div");
	div.className = "form-group form-inline";

	div.appendChild(creaInput("form-control", "number", "altezza", "Altezza", null));
	div.appendChild(creaInput("form-control", "number", "larghezza", "Larghezza", null));

	divEsterno.appendChild(div);
	form.appendChild(divEsterno);

	div = document.createElement("div");
	div.className = "form-group";

	label = document.createElement("label");
	label.innerHTML = "Autore";

	div.appendChild(label);
	div.appendChild(creaInput("form-control", "text", "autore", "Autore", null));
	form.appendChild(div);
}

function aggiungiSubmitReset(form) {
	var div = creaDiv("form-group form-inline");
	div.style.textAlign = "center";
	div.appendChild(creaInput("form-control", "submit", "invia", null, "invia"));
	div.appendChild(creaInput("form-control", "reset", "ripristina", null, "ripristina"));

	form.appendChild(div);
}