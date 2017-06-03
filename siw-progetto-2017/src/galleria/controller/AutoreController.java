package galleria.controller;

import java.io.IOException;
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
		AutoreService service = new AutoreService();
		
		if (request.getParameter("id") != null) {
			// TODO
			nextPage = "/autore.jsp";
		} else {
			List<Autore> autori = service.getAutori();
			
			Autore a1 = new Autore();
			a1.setNome("Pino");
			a1.setCognome("Cammino");
			Autore a2 = new Autore();
			a2.setNome("Gino");
			a2.setCognome("Passeggino");
			autori.add(a1);
			autori.add(a2);
			
			request.setAttribute("autori", autori);
			nextPage = "/autori.jsp";
		}
		
		ServletContext application = this.getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher(nextPage);
		rd.forward(request, response);
	}

}
