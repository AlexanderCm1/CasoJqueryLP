package practice.com.webpractice.entity;

public class Escuela {
	private int escuela_id;
	private String nombrecat;
	public Escuela() {

	}
	public Escuela(int escuela_id, String nombrecat) {
		super();
		this.escuela_id = escuela_id;
		this.nombrecat = nombrecat;
	}
	public int getEscuela_id() {
		return escuela_id;
	}
	public void setEscuela_id(int escuela_id) {
		this.escuela_id = escuela_id;
	}
	public String getNombrecat() {
		return nombrecat;
	}
	public void setNombrecat(String nombrecat) {
		this.nombrecat = nombrecat;
	}
	@Override
	public String toString() {
		return "Escuela [escuela_id=" + escuela_id + ", nombrecat=" + nombrecat + "]";
	}
	

}
