package galleria.validator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import galleria.model.Autore;

public class AutoreValidator {
	
	public boolean validate(HttpServletRequest request) {
		boolean tuttoOk = true;
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String nazionalita = request.getParameter("nazionalita");
		String dataNascita = request.getParameter("dataNascita");
		String dataMorte = request.getParameter("dataMorte");
		Autore autore = (Autore)request.getAttribute("autore");
		
		if (nome == null || nome.isEmpty()) {
			request.setAttribute("nomeError", "Campo obbligatorio");
			tuttoOk = false;
		} else
			autore.setNome(nome);
		
		if (cognome == null || cognome.isEmpty()) {
			request.setAttribute("cognomeError", "Campo obbligatorio");
			tuttoOk = false;
		} else
			autore.setCognome(cognome);
		
		if (nazionalita == null || nazionalita.isEmpty()) {
			request.setAttribute("nazionalitaError", "Campo obbligatorio");
			tuttoOk = false;
		} else
			autore.setNazionalita(nazionalita);
		
		if (dataNascita == null || dataNascita.isEmpty()) {
			request.setAttribute("dataNascitaError", "Campo obbligatorio");
			tuttoOk = false;
		} else {
			try {
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				sdf.setLenient(false);
				Date nascita = sdf.parse(dataNascita);
				autore.setDataNascita(nascita);
			} catch (ParseException e) {
				request.setAttribute("dataNascitaError", "Data non valida");
				tuttoOk = false;
			}
		}
		
		if (dataMorte != null && !dataMorte.isEmpty()) {
			try {
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				sdf.setLenient(false);
				Date morte = sdf.parse(dataMorte);
				autore.setDataMorte(morte);
			} catch (ParseException e) {
				request.setAttribute("dataMorteError", "Data non valida");
				tuttoOk = false;
			}
		}
		
		return tuttoOk;
	}

}
