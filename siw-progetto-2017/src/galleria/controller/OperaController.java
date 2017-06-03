package galleria.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import galleria.model.Autore;
import galleria.model.Opera;
import galleria.service.OperaService;

@WebServlet("/opera")
public class OperaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nextPage;
		OperaService service = new OperaService();
		
		if (request.getParameter("id") != null) {
			// TODO
			nextPage = "/opera.jsp";
		} else {
//			List<Opera> opere = service.getOpere();
			// temporaneo disaccoppiamento dalla persistenza
			List<Opera> opere = new ArrayList<>();
			
			/* TEST lista opere */
				Autore picasso = new Autore();
				picasso.setCognome("Picasso");
				Opera guernica = new Opera();
				guernica.setTitolo("Guernica");
				guernica.setAutore(picasso);
				
				Autore munch = new Autore();
				munch.setCognome("Munch");
				Opera urlo = new Opera();
				urlo.setTitolo("L'urlo");
				urlo.setAutore(munch);
				
				opere.add(guernica);
				opere.add(urlo);
			
			request.setAttribute("opere", opere);
			nextPage = "/opere.jsp";
		}
		
		ServletContext application = this.getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher(nextPage);
		rd.forward(request, response);
	}

}
