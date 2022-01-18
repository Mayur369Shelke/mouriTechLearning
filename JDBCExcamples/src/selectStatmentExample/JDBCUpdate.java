package selectStatmentExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//Step 1= Resister the driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mourilearning", "root", "root");
			
			Statement stml = connection.createStatement();
			
			int i = stml.executeUpdate("delete from worker where WORKER_ID = 150;"
					+ "");
			
			 if (i!=0){
				System.out.println("Deleted");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		}


	}
	}

