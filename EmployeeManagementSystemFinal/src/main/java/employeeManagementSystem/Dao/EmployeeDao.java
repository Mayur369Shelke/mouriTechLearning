package employeeManagementSystem.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import employeeManagementSystem.Entity.Employee;
import employeeManagementSystem.Util.HibernateUtil;

public class EmployeeDao {
	
	
	public void saveEmployee(Employee emp) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the employee object in to database
			session.save(emp);
			// commit transaction
			transaction.commit();
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
	}

	public Employee getEmployee(int empid) {
		Transaction transaction = null;
		Employee empById = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			empById = session.get(Employee.class, empid);
			if(empById!=null) {
				
				System.out.println("Employee details are = " );
			}
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
		return empById;
		
	}

	public List<Employee> getAllEmployee() {
		Transaction transaction = null;
		List<Employee> emplist = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			emplist = session.createQuery("from Employee").getResultList();
			if(emplist!=null) {
				
				System.out.println("Employee details are fetched");
				System.out.println(emplist.toString());
				for(Employee employee:emplist) {
					System.out.println(employee.getEmpId());
					System.out.println(employee.getEmpName());
					System.out.println(employee.getEmpMobileNo());
				}
				System.out.println("data is fetched");
			}
			transaction.commit();
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
		return emplist;
		
	}

	public void deleteEmployee(int empid) {
		Transaction transaction = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			Employee emp =session.get(Employee.class, empid);
			if(emp!=null) {
				session.delete(emp);
			}
			transaction.commit();
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
		
		
	}

	

	public void updateEmployee(Employee emp) {

		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();

			session.saveOrUpdate(emp);
	
			// commit transaction
			transaction.commit();
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
		
	}
}



