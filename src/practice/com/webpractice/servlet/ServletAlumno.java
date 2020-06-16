package practice.com.webpractice.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import practice.com.webpractice.dao.AlumnoDao;
import practice.com.webpractice.daoImp.AlumnoDaoImp;

/**
 * Servlet implementation class ServletAlumno
 */
@WebServlet(description = "Servlet para controlar  las peticiones", urlPatterns = { "/SA" })
public class ServletAlumno extends HttpServlet {
	private AlumnoDao alumnoDao = new AlumnoDaoImp();
	private Gson gson = new Gson();
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAlumno() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		
		out.println(gson.toJson(alumnoDao.readAll()));
		
		
		
		/*
		int op = Integer.parseInt(request.getParameter("opc"));
		switch (op) {
		case 1:
			
			break;

		default:
			break;
		}*/
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
