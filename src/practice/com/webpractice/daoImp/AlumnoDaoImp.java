package practice.com.webpractice.daoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import practice.com.webpractice.dao.AlumnoDao;
import practice.com.webpractice.entity.Alumno;
import pratice.com.webpractice.con.Conexion;

public class AlumnoDaoImp implements AlumnoDao{
	private PreparedStatement ps;
	private ResultSet rs;
	private Connection conn;
	
	
	@Override
	public List<Alumno> readAll(){
		List<Alumno> lista = new ArrayList<>();
		try {
			conn = Conexion.getConex();
			ps = conn.prepareStatement("SELECT a.alumno_id,e.nombrecat,a.apelnombres,a.correo,a.telefono from  alumno as a join escuela as e on a.alumno_id = e.escuela_id");
			rs = ps.executeQuery();
			while(rs.next()) {
				Alumno alumno = new Alumno();
				alumno.setAlumno_id(rs.getInt("alumno_id"));
				alumno.setNombrecat(rs.getString("nombrecat"));
				alumno.setApelnombres(rs.getString("apelnombres"));
				alumno.setCorreo(rs.getString("correo"));
				alumno.setTelefono(rs.getString("telefono"));
				lista.add(alumno);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return lista;
	}
	public int create(Alumno a) {
		int x = 0;
		String sql = "INSERT INTO alumno(escuela_id,apelnombres,telefono,correo) VALUES(?,?,?,?)";
		try {
			conn = Conexion.getConex();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, a.getEscuela_id());
			ps.setString(2, a.getApelnombres());
			ps.setString(3, a.getTelefono());
			ps.setString(4, a.getCorreo());
			x = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return x;
	}
}

