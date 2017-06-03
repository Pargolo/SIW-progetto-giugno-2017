function impostaFormAutore() {
	var inputs = document.getElementsByTagName("input");
	inputs[0].name = "nome"; inputs[0].placeholder = "Nome";
	inputs[1].name = "cognome"; inputs[1].placeholder = "Cognome";
	inputs[2].name = "nazionalita"; inputs[2].placeholder = "Nazionalità";
	inputs[3].name = "dataNascita"; inputs[3].placeholder = "Data di nascita";
	inputs[4].name = "dataMorte"; inputs[4].placeholder = "Data di morte";	

	var labels = document.getElementsByTagName("label");
	for(i = 0; i < inputs.length; i++) {
		labels[i].innerHTML = inputs[i].placeholder;
	}

	var form = document.getElementsByTagName("form")[0];
	form.action = "autore";
}

function impostaFormOpera() {
	var inputs = document.getElementsByTagName("input");	
	inputs[0].name = "titolo"; inputs[0].placeholder = "Titolo";
	inputs[1].name = "anno"; inputs[1].placeholder = "Anno di realizzazione";
	inputs[2].name = "tecnica"; inputs[2].placeholder = "Tecnica usata";
	inputs[3].name = "dimensioni"; inputs[3].placeholder = "Dimensioni";
	inputs[4].name = "autore"; inputs[4].placeholder = "Nome dell'autore";

	var labels = document.getElementsByTagName("label");
	for(i = 0; i < inputs.length; i++) {
		labels[i].innerHTML = inputs[i].placeholder;
	}

	var form = document.getElementsByTagName("form")[0];
	form.action = "opera";
}