package payRoll;

public class Admin extends PayRoll{
	
	int workingDays;
	int dailyWages;
	
	@Override
	public int adjustSalary() {
		
		int salary = workingDays*dailyWages;
		return salary;
	}
	

	public String doAdminStuff() {
		return "Admin need to add some employee list and its work according to position";
	}

	public Admin(String name, int workingDays, int dailyWages) {
		super(name);
		this.workingDays = workingDays;
		this.dailyWages = dailyWages;
	}
	

}
