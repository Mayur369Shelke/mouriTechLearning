package product;

import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class ProductAdd
 */
@WebServlet("/ProductAdd")
public class ProductAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	 Connection conn = DBConnection.getDBConnection();
	    
		protected void doPost(HttpServletRequest request, HttpServletResponse response) 
		{
			try {
			
			String productId = request.getParameter("productId");
			String productName = request.getParameter("productName");
			String productPrice = request.getParameter("productPrice");
			String productBrand = request.getParameter("productBrand");
			String productCategory = request.getParameter("productCategory");
			
			 response.setContentType("text/html");
			 
			 PrintWriter out = response.getWriter();
			 out.println("product Id =="+productId);
			 out.println("product Name =="+productName);
			 out.println("product price =="+productPrice);
			 out.println("product brand =="+productBrand);
			 out.println("product category =="+productCategory);
			 
			 
				 
				/*
				 * String createTableStm =
				 * "CREATE TABLE product (productId varchar(255),productName varchar(255),productPrice varchar(255),productBrand varchar(255),productCategory varchar(255));"
				 * ;
				 * 
				 * PreparedStatement statement1 = conn.prepareStatement(createTableStm); int
				 * result = statement1.executeUpdate();
				 * out.println("Product table created"+result);
				 */
					
					
					String insert ="insert into product values(?,?,?,?,?);";
							
							PreparedStatement statement = conn.prepareStatement(insert);
							statement.setString(1, productId);
							statement.setString(2, productName);
							statement.setString(3, productPrice);
							statement.setString(4, productBrand);
							statement.setString(5, productCategory);
							
							int result1 = statement.executeUpdate();
							if(result1 !=0) {
								out.println("data inserted");
							}
							else {
								out.println("data not inserted");
							}
					
				 
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

}
