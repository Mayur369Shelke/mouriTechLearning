package array;

import javax.swing.JOptionPane;

public class StoreProductObjectsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] productArray = new Product[3];
		
		Product product1 = new Product(1, "i-phone 11", 150000, "128GB");
		Product product2 = new Product(2, "i-phone 12", 80000, "64GB");
		Product product3 = new Product(3, "i-phone 13", 200000, "128GB");
		
				productArray[0]= product1;
				productArray[1]= product2;
				productArray[2]= product3;
				
		String result = JOptionPane.showInputDialog("Enter product ID to get informations");
		int productID = Integer.parseInt(result);
		try {
			
			for(int i=0;i<productArray.length;i++) {
				if(productArray[i].getProductId()==productID) 
				{
					System.out.println("Product information is");
				System.out.println("for product ID = "+productID+  productArray[i].toString());
				}
				
				else 
				{
					throw new ProductNotFoundException(" ######  product does not exist with id = "+productID);
				}
				
			}
		}
		catch (ProductNotFoundException e) {
			e.printStackTrace();
		}
		
		

	}

}
