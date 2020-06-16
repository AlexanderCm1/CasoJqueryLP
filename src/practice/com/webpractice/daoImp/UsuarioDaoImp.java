package practice.com.webpractice.daoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import practice.com.webpractice.dao.UsuarioDao;
import practice.com.webpractice.entity.Usuario;
import pratice.com.webpractice.con.Conexion;

public class UsuarioDaoImp implements UsuarioDao{
	private PreparedStatement ps;
	private ResultSet rs;
	private Connection conn;
	
	@Override
	public int validarUsuario(String user,String pass) {
		
		return 0;
	}
	@Override
	public List<Usuario> readAll(){
		List<Usuario> lista = new ArrayList<>();
		try {
			conn = Conexion.getConex();
			ps = conn.prepareStatement("escuela_id");
			rs = ps.executeQuery();
			while(rs.next()) {
				Usuario user = new Usuario();
				user.setUduario_id(rs.getInt(""));
				user.setUser(rs.getString("user"));
				user.setPass(rs.getString("pass"));
				lista.add(user);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return lista;
	}
	
}
