package practice.com.webpractice.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import practice.com.webpractice.dao.EscuelaDao;
import practice.com.webpractice.daoImp.EscuelaDaoImp;

/**
 * Servlet implementation class ServletEscuela
 */
@WebServlet(description = "Servlet para controlar las peticiones a escuela", urlPatterns = { "/SE" })
public class ServletEscuela extends HttpServlet {
	private Gson gson = new Gson();
	private EscuelaDao escuelaDao = new EscuelaDaoImp();
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletEscuela() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter escritor = response.getWriter();
		
		escritor.println(gson.toJson(escuelaDao.escuelAll()));
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
