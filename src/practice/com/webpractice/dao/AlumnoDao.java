package practice.com.webpractice.dao;

import java.util.List;

import practice.com.webpractice.entity.Alumno;

public interface AlumnoDao {
	public List<Alumno> readAll();
	public int create(Alumno a);
	public int modificar(Alumno a);
	public List<Alumno> buscarId(int id);
	public int eliminar(int id);
}
