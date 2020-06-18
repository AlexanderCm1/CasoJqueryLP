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
import practice.com.webpractice.entity.Alumno;

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
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		
		
		
		/*
		alumnoDao.create(new Alumno(0, Integer.parseInt(request.getParameter("escuela_id")),null , request.getParameter("apelnombres")
				, request.getParameter("correo"), request.getParameter("telefono")));
		
		out.println("Alumno creado con exito");*/
		
		
		
		
		int op = Integer.parseInt(request.getParameter("opc"));
		switch (op) {
		case 1:
			out.println(gson.toJson(alumnoDao.readAll()));
			break;
		case 2:
			alumnoDao.create(new Alumno(0, Integer.parseInt(request.getParameter("escuela_id")),null , request.getParameter("apelnombres")
					, request.getParameter("correo"), request.getParameter("telefono")));
			
			out.println("Alumno creado con exito");
			break;

		case 3:
			out.println(gson.toJson(alumnoDao.buscarId(Integer.parseInt(request.getParameter("id")))));
			break;
		
		case 4:
			
			int alumno_id=Integer.parseInt(request.getParameter("alumno_id"));
			int escuela_id= Integer.parseInt(request.getParameter("escuela_id"));
			String apelnombres = request.getParameter("apelnombres");
			String telefono = request.getParameter("telefono");
			String correo = request.getParameter("correo");
			
			out.println(gson.toJson(alumnoDao.modificar(new Alumno(alumno_id, escuela_id, null, apelnombres, correo, telefono)) ));
			
			break;
		case 5:
			int x =alumnoDao.eliminar(Integer.parseInt(request.getParameter("id")));
			out.println(gson.toJson(x));
			break;
		default:
			break;
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
