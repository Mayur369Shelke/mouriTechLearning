package movieDetailsJDBCPractice;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

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
