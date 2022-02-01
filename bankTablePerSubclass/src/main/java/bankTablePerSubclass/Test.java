package bankTablePerSubclass;

import org.hibernate.Session;
import org.hibernate.Transaction;

import bankTablePerSubclass.entity.BankAccount;
import bankTablePerSubclass.entity.CurrentAccount;
import bankTablePerSubclass.entity.SavingAccount;
import bankTablePerSubclass.util.HibernateUtil;



public class Test {

	public static void main(String[] args) {
	
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the employee object in to database
			BankAccount bankAccount = new BankAccount();
			bankAccount.setAccName("mayur");
			bankAccount.setAccBalance(5000);
			
			
			SavingAccount savingAccount =new SavingAccount();
			savingAccount.setAccName("sanket");
			savingAccount.setAccBalance(6000);
			savingAccount.setServiceCharge(5);
			
			CurrentAccount currentAccount = new CurrentAccount();
			currentAccount.setAccName("sumit");
			currentAccount.setAccBalance(5689);
			currentAccount.setInterestRate(50);
			
			session.save(bankAccount);
			session.save(savingAccount);
			session.save(currentAccount);
			
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
