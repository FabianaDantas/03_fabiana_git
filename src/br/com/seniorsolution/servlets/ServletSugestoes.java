package br.com.seniorsolution.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.seniorsolution.entidades.Sugestao;

@WebServlet("/sugestoes")
public class ServletSugestoes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String lista = "<h1>Lista de Sugestões</h1><hr/>";

    public ServletSugestoes() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("index.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String sugestao = request.getParameter("sugestao");
		
		Sugestao s = new Sugestao(nome, email, sugestao);
		
		lista += "<p>Nome: " + s.getNome()
				+ "<br/>Email: " + s.getEmail() + "<br/>" + 
				"Sugestão: " + sugestao + "</p><hr/>";
		
		request.setAttribute("listaSugestoes", lista);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
