package com.mouritech.EmployeeManegmentSystem.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mouritech.EmployeeManegmentSystem.dao.EmployeeDao;
import com.mouritech.EmployeeManegmentSystem.entity.Employee;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	private EmployeeDao employeeDao;
	
	public void init() {
		employeeDao = new EmployeeDao();
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getServletPath();
		
		try {
			
			switch (action) {
			case "/new":
				
				break;
			
			case "/list":
				listEmployee(req,resp);
				break;

			case "/update":
				
				break;
				
			case "/edit":
				
				break;
				
			case "/insert":
	
				break;
			default:
				break;
			}
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	private void listEmployee(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException, SQLException
	{
		List<Employee> listOfEmployee = employeeDao.getAllEmployee();
		request.setAttribute("listEmp", listOfEmployee);
		RequestDispatcher rd = request.getRequestDispatcher("employee-list.jsp");
		rd.forward(request, response);
	
	}


}
