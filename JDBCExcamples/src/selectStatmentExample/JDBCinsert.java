package selectStatmentExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCinsert{
	
	public static void main(String[] args) {
		//Step 1= Resister the driver
	
	//Step 1= Resister the driver
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mourilearning", "root", "root");
		
		Statement stml = connection.createStatement();
		
		int i = stml.executeUpdate("insert into worker (WORKER_ID, FIRST_NAME, LAST_NAME, SALARY, JOINING_DATE, DEPARTMENT) values (150,'Geetika', 'Chauhan', '90000', '2014-04-11 09:00:00', 'Admin');\r\n"
				+ "");
		
		 if (i!=0){
			System.out.println("sucessfullfull inserted");
		}
	} catch (Exception e) {
		// TODO Auto-generated catch bloc
		e.printStackTrace();
	}

}
}


