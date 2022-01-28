package com.mouritech.hibernetMapping.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mouritech.hibernetMapping.model.Orders;
import com.mouritech.hibernetMapping.util.HibernateUtil;

public class OrderDao {

	public void saveOrder(Orders orders) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the employee object in to database
			session.save(orders);
			// commit transaction
			transaction.commit();
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
	}

	public Orders getorder(int orderId) {
		Transaction transaction = null;
		Orders orderById = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			
			
			//get entity from database
			orderById = session.get(Orders.class, orderId);
			if(orderById!=null) {
				
				System.out.println(" details are = ");
				System.out.println(orderById.toString());
			}
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
		return orderById;
		
	}
}

