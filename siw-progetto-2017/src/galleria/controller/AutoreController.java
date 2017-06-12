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
import galleria.validator.AutoreValidator;

@WebServlet("/autore")
public class AutoreController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nextPage;
		AutoreService autoreService = new AutoreService();
		
		if (request.getParameter("id") != null) {
			Long id = Long.valueOf(request.getParameter("id"));
			Autore autore = autoreService.getOneAutore(id);
			request.setAttribute("autore", autore);
			nextPage = "/autore.jsp";
		} else {
			List<Autore> autori = autoreService.getAutori();
			request.setAttribute("autori", autori);
			nextPage = "/autori.jsp";
		}
		
		ServletContext application = this.getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher(nextPage);
		rd.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nextPage;
		AutoreService service = new AutoreService();
		AutoreValidator validator = new AutoreValidator();
		Autore autore = new Autore();
		request.setAttribute("autore", autore);
		
		if (validator.validate(request)) {
			service.insertAutore(autore);
			nextPage = "/autore.jsp";
		}
		else
			nextPage = "/amministrazione.jsp";
		
		ServletContext application = this.getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher(nextPage);
		rd.forward(request, response);
	}

}
