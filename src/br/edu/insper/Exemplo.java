package br.edu.insper;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Exemplo
 */
@WebServlet("/Exemplo")
public class Exemplo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Exemplo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String curso = request.getParameter("curso");
		PrintWriter out = response.getWriter();
		
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Confirme os dados informados</h1>");
        out.println(" <hr/>");
        out.println("Nome: " + nome + "<br/>");
        out.println("Email: " + email + "<br/>");
        out.println("Curso: " + curso + "<br/>");
        out.println("<button>Confirmar</button>");
        out.println("</body>");
        out.println("</html>");
	}
	
//	protected void service (HttpServletRequest request,
//            HttpServletResponse response)
//            throws ServletException, IOException {
//        PrintWriter out = response.getWriter();
//        out.println("<html>");
//        out.println("<body>");
//        out.println("Servlet funcionando");
//        out.println("</body>");
//        out.println("</html>");
//	}

}
