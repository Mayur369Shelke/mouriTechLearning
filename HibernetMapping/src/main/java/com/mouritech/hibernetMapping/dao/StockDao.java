package com.mouritech.hibernetMapping.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mouritech.hibernetMapping.model.Stock;
import com.mouritech.hibernetMapping.util.HibernateUtil;

public class StockDao {
	
	

	public void saveStock(Stock stock) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the employee object in to database
			session.save(stock);
			// commit transaction
			transaction.commit();
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
	}

	public Stock getStock(Long stockid) {
		Transaction transaction = null;
		Stock stockById = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the employee object in to database
			//session.saveOrUpdate(emp);
			
			//get entity from database
			stockById = session.get(Stock.class, stockid);
			if(stockById!=null) {
				
				System.out.println("Stock details are = " + stockById.toString());
			}
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
		return stockById;
		
	}
}