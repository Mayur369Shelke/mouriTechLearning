package hibernetInheritanceexample.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("cemployee")
public class ContractEmployee extends Employee {
	@Column(name = "emp_wdays")
	private int workingDays;
	@Column(name = "emo_ctname")
	private String contractorName;
	public ContractEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ContractEmployee(int workingDays, String contractorName) {
		super();
		this.workingDays = workingDays;
		this.contractorName = contractorName;
	}
	public int getWorkingDays() {
		return workingDays;
	}
	public void setWorkingDays(int workingDays) {
		this.workingDays = workingDays;
	}
	public String getContractorName() {
		return contractorName;
	}
	public void setContractorName(String contractorName) {
		this.contractorName = contractorName;
	}
	@Override
	public String toString() {
		return "ContractEmployee [workingDays=" + workingDays + ", contractorName=" + contractorName + "]";
	}
	
	
	

}
