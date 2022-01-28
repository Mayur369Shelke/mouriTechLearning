package com.mouritech.hibernetMapping.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mouritech.hibernetMapping.model.Items;
import com.mouritech.hibernetMapping.model.Orders;
import com.mouritech.hibernetMapping.util.HibernateUtil;

public class ItemDao {

	public void saveItem(Items items) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the employee object in to database
			session.save(items);
			// commit transaction
			transaction.commit();
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
	}

	public Items getItem(int itemId) {
		Transaction transaction = null;
		Items itemById = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			
			
			//get entity from database
			itemById = session.get(Items.class, itemId);
			if(itemById!=null) {
				
				System.out.println(" details are = ");
				System.out.println(itemById.toString());
			}
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
		return itemById;
		
	}
}