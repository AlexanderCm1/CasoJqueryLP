package pratice.com.webpractice.con;

import java.sql.*;

public class Conexion {
	private static Connection conn = null;
	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String user = "root";
	private static final String pass = "123";
	private static final String url = "jdbc:mysql://localhost:3306/trabajo_lp";
	
	public static Connection getConex() {
		try {
			Class.forName(driver);
			if(conn == null) {
				conn = DriverManager.getConnection(url, user, pass);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		return conn;
	}
	
	
	
	
	
	
	/*
	public static void main(String[] args) {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pass);
			
			System.out.println("Conectado");
			
			
			
			
		} 
		catch (SQLException e) {
			System.out.println("Error de Mysql");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		catch (Exception e) {
			System.out.println("Se ha encontrado el siguiente error: " + e.getMessage());
		}
		
	}*/
}
