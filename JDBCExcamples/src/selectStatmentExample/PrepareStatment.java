package selectStatmentExample;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrepareStatment {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mourilearning", "root", "root");
			
			String insert = "insert into worker (WORKER_ID, FIRST_NAME, LAST_NAME, SALARY, JOINING_DATE, DEPARTMENT) values (?,?,?,?,?,?)";
			
			PreparedStatement statment = connection.prepareStatement(insert);
			//150,'Geetika', 'Chauhan', '90000', '2014-04-11 09:00:00', 'Admin'
			statment.setInt(1, 350);
			statment.setString(2, "mayur");
			statment.setString(3, "shelke");
			statment.setInt(4, 456582);
			statment.setTimestamp(5, null);
			statment.setString(6, "Adminaaaaa");
			
			int result = statment.executeUpdate();
			if(result!=0) {
				System.out.println("inserted");
				}
			else {
				System.out.println(" not inserted");
			}
			
			
	}
	
//	public void select() {
//		
//		
//		
//		PreparedStatement statment = connection.prepareCall("select * from worker");
//		ResultSet resultSet = statment.executeQuery();
//		while(resultSet.next()) {
//			
//			System.out.println("Worker ID is == "+resultSet.getInt(1)+"First name == "+resultSet.getString(2)+"Last name == "+resultSet.getString(3)+"Salary of worker == "+resultSet.getInt(4)+"Joining data == "+resultSet.getTimestamp(5)+"Department == "+resultSet.getString(6));
//
//		}
//	}
	

}
