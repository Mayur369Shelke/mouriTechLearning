package com.mouritech.hibernetMapping.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mouritech.hibernetMapping.model.StockDetails;
import com.mouritech.hibernetMapping.util.HibernateUtil;

public class StockDetailsDao {

	public void saveEmployee(StockDetails stockDetails) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the employee object in to database
			session.save(stockDetails);
			// commit transaction
			transaction.commit();
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
	}

	public StockDetails getStockDetails(Long stockDetailsId) {
		Transaction transaction = null;
		StockDetails stockDetailsById = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the employee object in to database
			//session.saveOrUpdate(emp);
			
			//get entity from database
			stockDetailsById = session.get(StockDetails.class, stockDetailsId);
			if(stockDetailsById!=null) {
				
				System.out.println("Employee details are = " + stockDetailsById);
			}
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
		return stockDetailsById;
		
	}
}