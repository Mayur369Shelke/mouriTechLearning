package selectStatmentExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCSelectDemo {

	public static void main(String[] args) {
		//Step 1= Resister the driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mourilearning", "root", "root");
			
			Statement stml = connection.createStatement();
			
			ResultSet resultSet = stml.executeQuery("select * from worker");
			
			while(resultSet.next()) {
				System.out.println("Worker ID is == "+resultSet.getInt(1)+"First name == "+resultSet.getString(2)+"Last name == "+resultSet.getString(3)+"Salary of worker == "+resultSet.getInt(4)+"Joining data == "+resultSet.getTimestamp(5)+"Department == "+resultSet.getString(6));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		}

	}

}
