package practice.com.webpractice.entity;

public class Alumno {
	private int alumno_id;
	private int escuela_id;
	private String nombrecat;
	private String apelnombres;
	private String correo;
	private String telefono;
	public Alumno() {

	}
	public Alumno(int alumno_id, int escuela_id, String nombrecat, String apelnombres, String correo, String telefono) {
		super();
		this.alumno_id = alumno_id;
		this.escuela_id = escuela_id;
		this.nombrecat = nombrecat;
		this.apelnombres = apelnombres;
		this.correo = correo;
		this.telefono = telefono;
	}
	public int getAlumno_id() {
		return alumno_id;
	}
	public void setAlumno_id(int alumno_id) {
		this.alumno_id = alumno_id;
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
	public String getApelnombres() {
		return apelnombres;
	}
	public void setApelnombres(String apelnombres) {
		this.apelnombres = apelnombres;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Alumno [alumno_id=" + alumno_id + ", escuela_id=" + escuela_id + ", nombrecat=" + nombrecat
				+ ", apelnombres=" + apelnombres + ", correo=" + correo + ", telefono=" + telefono + "]";
	}

	

}
