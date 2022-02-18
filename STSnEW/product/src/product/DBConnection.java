package product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConnection {

	static Connection con;
	static Statement stmt;

	public static Connection getDBConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mourilearning", "root", "root");

		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		return con;
	}
}
