package practice.com.webpractice.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.util.buf.UDecoder;

import com.google.gson.Gson;

import practice.com.webpractice.dao.AlumnoDao;
import practice.com.webpractice.dao.EscuelaDao;
import practice.com.webpractice.dao.UsuarioDao;
import practice.com.webpractice.daoImp.AlumnoDaoImp;
import practice.com.webpractice.daoImp.EscuelaDaoImp;
import practice.com.webpractice.daoImp.UsuarioDaoImp;
import practice.com.webpractice.entity.Alumno;
import practice.com.webpractice.entity.Usuario;
import pratice.com.webpractice.con.Conexion;

public class Test {
	static List<Usuario> lista = new ArrayList<>();
	public static void main(String[] args) {
		//conex();
		//listar();
		//listarE();
		crear();
	}
	
	static void conex() {
		if(Conexion.getConex() != null) {
			System.out.println("Conexion con exito..");
		}else {
			System.out.println("Error");
		}
	}
	static void listar() {
		Gson g = new Gson();
		AlumnoDao aldao = new AlumnoDaoImp();
		System.out.println(g.toJson(aldao.readAll()));
	}
	static void listarE() {
		Gson g = new Gson();
		EscuelaDao edao = new EscuelaDaoImp();
		System.out.println(g.toJson(edao.escuelAll()));
	}
	static void crear() {
		AlumnoDao aldao = new AlumnoDaoImp();
		if(aldao.create(new Alumno(0, 1, "Alimentos", "pablito roja", "pablito@gmail.com", "34343")) >= 1) {
			System.out.println("Alumno creado");
		}else {
			System.out.println("nel");
		}
	}
	
	
	
	/*
	static void listar() {
		Gson g = new Gson();
		UsuarioDao udao = new UsuarioDaoImp();
		//con list
		lista = udao.readAll();
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getUduario_id()+"\t"+lista.get(i).getUser()+"\t"+lista.get(i).getPass());
		}
		//con json
		System.out.println(g.toJson(udao.readAll()));
		
	}*/
	
}
