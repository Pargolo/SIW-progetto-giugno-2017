function impostaFormAutore() {
	document.getElementById("autore-button").disabled = true;
	document.getElementById("opera-button").disabled = false;

	var form = document.getElementById("inserimento-form");
	var inputs = form.getElementsByTagName("input");

	riempiFormAutore(inputs);

	var labels = document.getElementsByTagName("label");
	for(i = 0; i < inputs.length; i++) {
		labels[i].innerHTML = inputs[i].placeholder;
	}

	form.action = "autore";
}

function riempiFormAutore(inputs) {
	inputs[0].name = "nome";
	inputs[0].placeholder = "Nome";

	inputs[1].name = "cognome";
	inputs[1].placeholder = "Cognome";

	inputs[2].name = "nazionalita";
	inputs[2].placeholder = "Nazionalità";

	inputs[3].name = "dataNascita";
	inputs[3].placeholder = "Data di nascita";
	inputs[3].type = "date";

	inputs[4].name = "dataMorte";
	inputs[4].placeholder = "Data di morte";
	inputs[4].type = "date";
}

function impostaFormOpera() {
	document.getElementById("autore-button").disabled = false;
	document.getElementById("opera-button").disabled = true;

	var form = document.getElementById("inserimento-form");
	var inputs = form.getElementsByTagName("input");

	riempiFormOpera(inputs);

	var labels = document.getElementsByTagName("label");
	for(i = 0; i < inputs.length; i++) {
		labels[i].innerHTML = inputs[i].placeholder;
	}

	document.getElementsById("inserimento-form").action = "opera";
}

function riempiFormOpera(inputs) {
	inputs[0].name = "titolo";
	inputs[0].placeholder = "Titolo";

	inputs[1].name = "anno";
	inputs[1].placeholder = "Anno di realizzazione";
	inputs[1].type = "number";

	inputs[2].name = "tecnica";
	inputs[2].placeholder = "Tecnica usata";

	inputs[3].name = "dimensioni";
	inputs[3].placeholder = "Dimensioni";
	inputs[3].type = "number";

	inputs[4].name = "autore";
	inputs[4].placeholder = "Nome dell'autore";
	inputs[4].type = "text";
}