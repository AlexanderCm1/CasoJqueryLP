package practice.com.webpractice.dao;

import java.util.List;

import practice.com.webpractice.entity.Usuario;

public interface UsuarioDao {
	public int validarUsuario(String user,String pass);
	public List<Usuario> readAll();
}
