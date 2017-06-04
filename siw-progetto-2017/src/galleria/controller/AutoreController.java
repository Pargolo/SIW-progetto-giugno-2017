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
import galleria.service.AutoreService;

@WebServlet("/autore")
public class AutoreController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nextPage;
//		AutoreService service = new AutoreService();
		
		if (request.getParameter("id") != null) {
			// TODO
			nextPage = "/autore.jsp";
		} else {
//			List<Autore> autori = service.getAutori();
			// temporaneo disaccoppiamento con le classi di persistenza
			List<Autore> autori = new ArrayList<>();
			
			/* TEST lista autori */
				Autore picasso = new Autore();
				picasso.setNome("Pablo");
				picasso.setCognome("Picasso");
				
				Autore munch = new Autore();
				munch.setNome("Edward");
				munch.setCognome("Munch");
				
				autori.add(picasso);
				autori.add(munch);
			
			request.setAttribute("autori", autori);
			nextPage = "/autori.jsp";
		}
		
		ServletContext application = this.getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher(nextPage);
		rd.forward(request, response);
	}

}
