package payRoll;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Academic academic = new Academic("Mayur", 28, 500);
		Admin admin = new Admin("raju", 28, 1000);
		System.out.println("Academic salary is "+academic.adjustSalary());
		System.out.println("given lecture is "+academic.giveLecture()); 
	   
		System.out.println("Admin salary is  "+admin.adjustSalary());
		System.out.println("admin work is  "+admin.doAdminStuff()); 
		
	

	}

}
