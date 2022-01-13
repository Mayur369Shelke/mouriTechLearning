package payRoll;

public class Academic extends PayRoll {
	

	int workingDays;
	int dailyWages;
	
	
	@Override
	public int adjustSalary() {
		
		int salary = workingDays*dailyWages;
		return salary;
	}


	public String giveLecture() {
		
		return name+"  will conduct lecture on 10th std";
	}
	
	


	public Academic(String name, int workingDays, int dailyWages) {
		super(name);
		this.workingDays = workingDays;
		this.dailyWages = dailyWages;
	}



	
	
}
