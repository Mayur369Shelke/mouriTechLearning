package tablePerClass;


import org.hibernate.Session;
import org.hibernate.Transaction;

import tablePerClass.entity.ContractEmployee;
import tablePerClass.entity.Employee;
import tablePerClass.entity.PermanentEmployee;
import tablePerClass.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
	
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the employee object in to database
			
			Employee emp = new Employee();
			emp.setEmpName("mayur");
			
			ContractEmployee cemp = new ContractEmployee();
			cemp.setEmpName("krishna");
			cemp.setWorkingDays(10);
			cemp.setContractorName("deva");
			session.save(emp);
			
			PermanentEmployee pemp = new PermanentEmployee();
			pemp.setEmpName("raju");
			pemp.setDepartment("IT");
			pemp.setDesignation("project manager");
			
			session.save(emp);
			session.save(cemp);
			session.save(pemp);
			
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