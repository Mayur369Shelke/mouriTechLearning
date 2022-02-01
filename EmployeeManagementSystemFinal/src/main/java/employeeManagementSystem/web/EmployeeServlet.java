package employeeManagementSystem.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import employeeManagementSystem.Dao.EmployeeDao;
import employeeManagementSystem.Entity.Employee;

/**
 * Servlet implementation class EmployeeServlet
 */
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
private EmployeeDao employeeDao;
	
	public void init() {
		employeeDao = new EmployeeDao();
		
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String action = request.getServletPath();
		
		try {
			
			switch (action) {
			case "/new":
				showNewEmployeeForm(request,response);
				break;
			
			case "/list":
				listEmployee(request,response);
				break;

			case "/update":
				updateEmployee(request,response);
				break;
				
			case "/edit":
				showEditEmployeeForm(request,response);
				break;
				
			case "/delete":
				deleteEmployee(request,response);
				break;
				
			case "/insert":
				insertEmployee(request,response);
				break;
			default:
				break;
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void showNewEmployeeForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("employee-form.jsp");
		rd.forward(request, response);
		
	}
	private void insertEmployee(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//int empid=Integer.parseInt(request.getParameter("id"));
		String empname = request.getParameter("ename");
		String empemail = request.getParameter("eemail");
		String empmobno = request.getParameter("emobno");
		
		Employee employee = new Employee(empname, empemail, empmobno);
		employeeDao.saveEmployee(employee);
		response.sendRedirect("list");
	}
	private void showEditEmployeeForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer empid=Integer.parseInt(request.getParameter("id"));
	
		
		Employee existingEmployee = employeeDao.getEmployee(empid);
		RequestDispatcher rd = request.getRequestDispatcher("employee-form.jsp");
		request.setAttribute("existingEmployee", existingEmployee);
		rd.forward(request, response);
	}
	private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int empid=Integer.parseInt(request.getParameter("id"));
		employeeDao.deleteEmployee(empid);
		response.sendRedirect("list");
		
	}
	private void updateEmployee(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Integer empid=Integer.parseInt(request.getParameter("id"));
		String empname = request.getParameter("ename");
		String empemail = request.getParameter("eemail");
		String empmobno = request.getParameter("emobno");
		
		Employee emp = new Employee(empname,empemail,empmobno);
		employeeDao.updateEmployee(emp);
		response.sendRedirect("list");
		
	}
	private void listEmployee(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException, SQLException
	{
		List<Employee> listOfEmployee = employeeDao.getAllEmployee();
		request.setAttribute("listEmp", listOfEmployee);
		RequestDispatcher rd = request.getRequestDispatcher("employee-list.jsp");
		rd.forward(request, response);
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
