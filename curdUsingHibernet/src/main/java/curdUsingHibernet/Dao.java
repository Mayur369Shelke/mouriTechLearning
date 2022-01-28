package curdUsingHibernet;
import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Dao {

	public void Save(Customer emp) {
		Transaction transaction = null;
		try (Session session = Util.getSessionFactory().openSession()) {
			
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

	public void getAllCustomer() {
		// retrieve the data from database to java program using hibernate
		//Transaction transaction = null;
				try (Session session = Util.getSessionFactory().openSession()) {

					List<Customer> employeeList = session.createQuery("from Customer", Customer.class).list();

				} catch (Exception e) {
					e.printStackTrace();
				}
				
		
	}
	public void deletecustomer1(Long empid) {
		Transaction transaction1 = null;
		try (Session session1 = Util.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction1 = session1.beginTransaction();
			Customer deleteEmp = session1.get(Customer.class, empid);
			System.out.println(deleteEmp);
			if(deleteEmp!=null) {
				session1.delete(deleteEmp);
				System.out.println("Employee deleted successfully");
			}
			
			/*
			 * Employee emp2 = new Employee(); emp2.setEmpId(empid); session1.delete(emp2);
			 * System.out.println("Employee deleted"); transaction1.commit();
			 */
			transaction1.commit();
			
		}catch (Exception e) {
			if (transaction1 != null) {
				transaction1.rollback();
			}

			e.printStackTrace();
		}
		
	}
	public void deleteEmployee(Class<?> type,Serializable empid) {
		Transaction transaction1 = null;
		try (Session session1 = Util.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction1 = session1.beginTransaction();
			Customer emp = session1.get(Customer.class, empid);
			System.out.println(emp);
			if(emp!=null) {
				session1.remove(emp);
				System.out.println("Employee deleted successfully");
			}
			
			/*
			 * Employee emp2 = new Employee(); emp2.setEmpId(empid); session1.delete(emp2);
			 * System.out.println("Employee deleted"); transaction1.commit();
			 */
			transaction1.commit();
			
		}catch (Exception e) {
			if (transaction1 != null) {
				transaction1.rollback();
			}

			e.printStackTrace();
		}
		
	}

	public void updateEmployee(Long empid,String mobNo) {
		Transaction transaction = null;
		try (Session session = Util.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the employee object in to database
			//session.saveOrUpdate(emp);
			
			//get entity from database
			Customer updatingEmp = session.get(Customer.class, empid);
			System.out.println(updatingEmp);
			//do changes
			updatingEmp.setEmpMobileNo(mobNo);
			//update the Employee object
			session.saveOrUpdate(updatingEmp);
			// commit transaction
			transaction.commit();
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
		
	}

	public void getEmployeeById(Long empid) {
		Transaction transaction = null;
		try (Session session = Util.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the employee object in to database
			//session.saveOrUpdate(emp);
			
			//get entity from database
			Employee empById = session.get(Employee.class, empid);
			if(empById!=null) {
				
				System.out.println("Employee details are = " + empById);
			}
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
		
	}

}
