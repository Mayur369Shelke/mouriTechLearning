import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CustomerMethods {
	
	
	public void showProductOperations() {
		
		
		ArrayList<Customer> customers = new ArrayList<Customer>();
				
		char ch = 'y';
		while (ch=='y') {
			
			String result = JOptionPane.showInputDialog("Enter the Operation name to execute ..... "+"\n"+"1.to add product   "+"\n"+" 2.list all products  "+"\n"+"3.to delete the product   ");
			int op = Integer.parseInt(result);
			switch (op) {
			case 1:
				String id = JOptionPane.showInputDialog("Enter customer ID");
				int custId = Integer.parseInt(id);
				String name = JOptionPane.showInputDialog("Enter customer Name");
				String email = JOptionPane.showInputDialog("Enter customer Email");
				String phone = JOptionPane.showInputDialog("Enter customer phone No");
				
				Customer cust = new Customer(custId, name, email, phone);
				customers.add(cust);
				break;
			case 2:
				for(int i=0;i<customers.size();i++) {
					System.out.println("List of customers"+"\n"+"Customer Id == "+customers.get(i).getCustId()+"\t"+"customer name == "+customers.get(i).getCustName()+"\t"+"customew Email Id == "+customers.get(i).getCustEmail()+"\t"+"Customer Phone No == "+customers.get(i).getCustPhoneNo());
				}
				break;
			case 3:
				String idremove = JOptionPane.showInputDialog("Enter customer ID to remove from database");
				int custIdremove = Integer.parseInt(idremove);
				for (int j=0;j>customers.size();j++) {
					if(customers.get(j).getCustId()==custIdremove) {
						System.out.println(custIdremove+"is removing");
						customers.remove(j);
						System.out.println(custIdremove+"is removed");
					}
				}
				
				break;

			default:
				break;
			}
		}
	}
	
	

}
