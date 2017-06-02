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

@WebServlet("/autore")
public class AutoreController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nextPage;
		List<Autore> autori = new ArrayList<>();
		
		Autore a1 = new Autore();
		a1.setNome("Niholas");
		a1.setCognome("Tucci");
		Autore a2 = new Autore();
		a2.setNome("Jhonattan");
		a2.setCognome("Loza");
		autori.add(a1);
		autori.add(a2);
		
		request.setAttribute("autori", autori);
		nextPage = "/autori.jsp";
		
		ServletContext application = this.getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher(nextPage);
		rd.forward(request, response);
	}

}
