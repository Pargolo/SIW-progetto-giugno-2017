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

import galleria.model.Opera;
//import galleria.service.AutoreService;
import galleria.service.OperaService;
import galleria.validator.OperaValidator;

@WebServlet("/opera")
public class OperaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nextPage;
		OperaService operaService = new OperaService();
		
		if (request.getParameter("id") != null) {
			Long id = Long.valueOf(request.getParameter("id"));
			Opera opera = operaService.getOneOpera(id);
			request.setAttribute("opera", opera);
			nextPage = "/opera.jsp";
		} else {
			List<Opera> opere = operaService.getOpere();
			request.setAttribute("opere", opere);
			nextPage = "/opere.jsp";
		}
		
		ServletContext application = this.getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher(nextPage);
		rd.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nextPage;
		OperaService service = new OperaService();
		OperaValidator validator = new OperaValidator();
		Opera opera = new Opera();
		request.setAttribute("opera", opera);
		
		if (validator.validate(request)) {
//			AutoreService autoreService = new AutoreService();
//			opera.setAutore(autoreService.);
			service.insertOpera(opera);
			nextPage = "/opera.jsp";
		} else
			nextPage = "/amministrazione.jsp";
		
		ServletContext application = this.getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher(nextPage);
		rd.forward(request, response);
	}

}
