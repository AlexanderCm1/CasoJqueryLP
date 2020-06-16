package practice.com.webpractice.entity;

public class Usuario {
	private int uduario_id;
	private String user;
	private String pass;
	public Usuario() {

	}
	public Usuario(int uduario_id, String user, String pass) {
		super();
		this.uduario_id = uduario_id;
		this.user = user;
		this.pass = pass;
	}
	public int getUduario_id() {
		return uduario_id;
	}
	public void setUduario_id(int uduario_id) {
		this.uduario_id = uduario_id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "Usuario [uduario_id=" + uduario_id + ", user=" + user + ", pass=" + pass + "]";
	}
	
	
}
