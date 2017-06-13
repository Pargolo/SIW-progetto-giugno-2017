package galleria.validator;

import javax.servlet.http.HttpServletRequest;

import galleria.model.Opera;

public class OperaValidator {
	
	public boolean validate(HttpServletRequest request) {
		boolean tuttoOk = true;
		String titolo = request.getParameter("titolo");
		String anno = request.getParameter("anno");
		String tecnica = request.getParameter("tecnica");
		String altezza = request.getParameter("altezza");
		String larghezza = request.getParameter("larghezza");
		String autore = request.getParameter("autore");
		Opera opera = (Opera)request.getAttribute("opera");
		
		if (titolo == null || titolo.isEmpty()) {
			request.setAttribute("titoloError", "Campo obbligatorio");
			tuttoOk = false;
		} else
			opera.setTitolo(titolo);
		
		if (anno == null || anno.isEmpty()) {
			request.setAttribute("annoError", "Campo obbligatorio");
			tuttoOk = false;
		} else {
			try {
				opera.setAnno(Integer.valueOf(anno));
			} catch (NumberFormatException e) {
				request.setAttribute("annoError", "Anno non valido");
				tuttoOk = false;
			}
		}
		
		if (tecnica == null || tecnica.isEmpty()) {
			request.setAttribute("tecnicaError", "Campo obbligatorio");
			tuttoOk = false;
		} else
			opera.setTecnica(tecnica);
		
		if (altezza == null || altezza.isEmpty()) {
			request.setAttribute("altezzaError", "Campo obbligatorio");
			tuttoOk = false;
		} else {
			try {
				opera.setAltezza(Integer.parseInt(altezza));
			} catch (NumberFormatException e) {
				request.setAttribute("altezzaError", "Campo espresso in cm");
				tuttoOk = false;
			}
		}
		
		if (larghezza == null || larghezza.isEmpty()) {
			request.setAttribute("larghezzaError", "Campo obbligatorio");
			tuttoOk = false;
		} else {
			try {
				opera.setLarghezza(Integer.parseInt(larghezza));
			} catch (NumberFormatException e) {
				request.setAttribute("larghezzaError", "Campo espresso in cm");
				tuttoOk = false;
			}
		}
		
		if (autore == null || autore.isEmpty()) {
			request.setAttribute("autoreError", "Campo obbligatorio");
			tuttoOk = false;
		}
		
		return tuttoOk;
	}

}
