package com.mouritech.hibernetMapping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dept_data")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dept_id")
	private int deptId;
	@Column(name = "dept_name")
	private String deptname;
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public Department(int deptId, String deptname) {
		super();
		this.deptId = deptId;
		this.deptname = deptname;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptname=" + deptname + "]";
	}
	public Department(String deptname) {
		super();
		this.deptname = deptname;
	}
	
	
	
}


