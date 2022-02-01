package com.mouritech.EmployeeManegmentSystem.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mouritech.EmployeeManegmentSystem.entity.Employee;
import com.mouritech.EmployeeManegmentSystem.util.HibernateUtil;

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

	public Employee getEmployee(Long empid) {
		Transaction transaction = null;
		Employee empById = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			empById = session.get(Employee.class, empid);
			if(empById!=null) {
				
				System.out.println("Employee details are = " + empById);
			}
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
		return empById;
		
	}

	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployee() {
		Transaction transaction = null;
		List<Employee> emplist = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			emplist = session.createQuery("from Employee").getResultList();
			if(emplist!=null) {
				
				System.out.println("Employee details are = " + emplist);
			}
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
		return emplist;
		
	}
}

