package cal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {

	Connection cx;
	
	String url="jdbc:mysql://localhost:3306/a605";
	String user="root";
	String password="";
	
	
public  conexion() {
		
	}
public Connection conectar() {
		try {
			cx=DriverManager.getConnection(url,user,password);
			System.out.println("Conexion Exitosa");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cx;
	}

public void desconectar() {
	try {
		cx.close();
		System.out.println("Desconexion Existosa");
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
public static void main (String [] args) {
	conexion c=new conexion();
	c.conectar();
	c.desconectar();
}
	
	
	
}
