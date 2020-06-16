package practice.com.webpractice.daoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import practice.com.webpractice.dao.EscuelaDao;
import practice.com.webpractice.entity.Escuela;
import pratice.com.webpractice.con.Conexion;

public class EscuelaDaoImp implements EscuelaDao{
	private PreparedStatement ps;
	private ResultSet rs;
	private Connection conn;
	
	
	@Override
	public List<Escuela> escuelAll(){
		List<Escuela> lista = new ArrayList<>();
			try {
				conn = Conexion.getConex();
				ps = conn.prepareStatement("SELECT * FROM escuela");
				rs = ps.executeQuery();
				while (rs.next()) {
					Escuela escuela = new Escuela();
					escuela.setEscuela_id(rs.getInt("escuela_id"));
					escuela.setNombrecat(rs.getString("nombrecat"));
					lista.add(escuela);
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		
		return lista;
	}
}
