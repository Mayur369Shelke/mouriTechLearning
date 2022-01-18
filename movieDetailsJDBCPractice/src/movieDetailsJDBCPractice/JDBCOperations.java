package movieDetailsJDBCPractice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class JDBCOperations {
	static Connection conn = null;
	static Statement stmt = null;
	static Scanner sc = new Scanner(System.in);
	public JDBCOperations() {
		conn = DBConnection.getDBConnection();
	}
	
	
	
String ch = "y";
	
	public void jdbcMenu() throws SQLException {
		while(ch=="y") {
			
			String choice = JOptionPane.showInputDialog("Enter the choice of JDBC Operation"+"\n"+"create : to create the MovieDetails data"+"\n"
			+"insert : to insert the MovieDetails data"+"\n"
					+"update : to update the MovieDetails data"+"\n"
			+"delete : to delete the MovieDetails data"+"\n"
					+"selectone : to view a specific MovieDetails data"+"\n"
			+"selectall : to view all MovieDetails data");
		
		switch (choice) {
		case "insert":
			insert();
			break;
		case "create":
			createTable();
			break;
		case "update":
			update();
			break;
		case "delete":
			delete();
			break;
		case "selectall":
			selectAll();
			break;
		case "selectone":
			selectByID();
			break;
		default:
			System.out.println("no case found....");
			break;
		}
			String ch = JOptionPane.showInputDialog("do you want to continue");
		}
	}
	
	
	public void createTable() throws SQLException {
		
		String createTableStm = "CREATE TABLE MovieDetails (movieid int NOT NULL AUTO_INCREMENT,moviename varchar(255) NOT NULL,movielanguage varchar(255),movierating int,PRIMARY KEY (movieid));";
		
		PreparedStatement statement = conn.prepareStatement(createTableStm);
		int result = statement.executeUpdate();
		System.out.println(result);
		if(result !=0) {
			System.out.println("MovieDetails table created in data base");
		}
		else {
			System.out.println("Pleasse check data base connection");
		}
	}
	
	public void insert() throws SQLException {
		
		String insert =
				"insert into MovieDetails "
						+ "(movieid,moviename,movielanguage,movierating) "
						+ "values(?,?,?,?);";
		
				String movieid1 = JOptionPane.showInputDialog("please inter movieid");
				int movieid = Integer.parseInt(movieid1);
				String moviename = JOptionPane.showInputDialog("please inter moviename");
				String movielanguage = JOptionPane.showInputDialog("please inter movielanguage");
				String movierating1 = JOptionPane.showInputDialog("please inter movierating");
				int movierating = Integer.parseInt(movierating1);
				
				PreparedStatement statement = conn.prepareStatement(insert);
				statement.setInt(1, movieid);
				statement.setString(2, moviename);
				statement.setString(3, movielanguage);
				statement.setInt(4, movierating);
				
				int result = statement.executeUpdate();
				if(result !=0) {
					System.out.println("data inserted");
				}
				else {
					System.out.println("data not inserted");
				}
				
			
				
	}
	
public void update() throws SQLException {
	
	String update =  "update MovieDetails set movierating = ? where moviename = ?";
	
	PreparedStatement statement = conn.prepareStatement(update);
	String moviename = JOptionPane.showInputDialog("please enter moviename to update rating");
	String movierating1 = JOptionPane.showInputDialog("please enter movierating");
	int movierating = Integer.parseInt(movierating1);
	statement.setInt(1, movierating);
	statement.setString(2, moviename);
	
	int result = statement.executeUpdate();
	if(result !=0) {
		System.out.println("data updateded");
	}
	else {
		System.out.println("Not updated  = " + moviename + " not found");
	}
}

public void selectByID() throws SQLException {
	
	String selectStmt = "select * from MovieDetails where movieid = ?";
	
	PreparedStatement statement = conn.prepareStatement(selectStmt);
	
	String movieid1 = JOptionPane.showInputDialog("please inter movieid");
	int movieid = Integer.parseInt(movieid1);
	
	statement.setInt(1, movieid);
	
	ResultSet resultSet = statement.executeQuery();
	while(resultSet.next()) {
		System.out.println("movieid"+resultSet.getInt("movieid"));
		System.out.println("moviename"+resultSet.getString("moviename"));
		System.out.println("movielanguage"+resultSet.getString("movielanguage"));
		System.out.println("movierating"+resultSet.getInt("movierating"));
		
	
	}
	
	
}

public void delete() throws SQLException {
	
	String deleteStmt = "delete from MovieDetails where movieid = ?";
	PreparedStatement statement = conn.prepareStatement(deleteStmt);
	String movieid1 = JOptionPane.showInputDialog("please inter movieid");
	int movieid = Integer.parseInt(movieid1);
	statement.setInt(1, movieid);
	
	int result = statement.executeUpdate();
	if(result !=0) {
		System.out.println("data deleted");
	}
	else {
		System.out.println("Not deleted  = " + movieid + " not found");
	}
}

public void selectAll() throws SQLException {
	String select = "select * from MovieDetails";
	PreparedStatement statement = conn.prepareStatement(select);
	ResultSet resultSet = statement.executeQuery();
	while(resultSet.next()) {
		System.out.println("movieid"+resultSet.getInt("movieid"));
		System.out.println("moviename"+resultSet.getString("moviename"));
		System.out.println("movielanguage"+resultSet.getString("movielanguage"));
		System.out.println("movierating"+resultSet.getInt("movierating"));
		System.out.println("===================================================");
	
	}
	
	
	
	
	
}

}
