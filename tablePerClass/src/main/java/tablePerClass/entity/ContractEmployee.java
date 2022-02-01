package tablePerClass.entity;

import javax.persistence.AttributeOverride;

import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cemployee_111")
@AttributeOverrides({
	@AttributeOverride(name = "eid",column = @Column(name = "ceid")),
	@AttributeOverride(name = "ename",column = @Column(name = "cename"))
})
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
