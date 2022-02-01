package tablePerClass.entity;

import javax.persistence.AttributeOverride;

import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pemployee")
@AttributeOverrides({
	@AttributeOverride(name = "eid",column = @Column(name = "peid")),
	@AttributeOverride(name = "ename",column = @Column(name = "pename"))
})
public class PermanentEmployee extends Employee{
	@Column(name = "emp_designation")
	private String designation;
	@Column(name = "emp_dept")
	private String department;
	
	
	public PermanentEmployee(String designation, String department) {
		super();
		this.designation = designation;
		this.department = department;
	}


	public PermanentEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	@Override
	public String toString() {
		return "PermanentEmployee [designation=" + designation + ", department=" + department + "]";
	}
	
	

}
