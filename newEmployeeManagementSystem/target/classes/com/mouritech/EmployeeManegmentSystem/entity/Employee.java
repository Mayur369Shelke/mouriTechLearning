package com.mouritech.EmployeeManegmentSystem.entity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee-Servlet")
public class Employee {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "emp_id")
		private Long empId;
		
		@Column(name = "first_name")
		private String empFirstName;
		
		@Column(name = "last_name")
		private String empLastName;
		
		@Column(name = "email")
		private String empEmail;

		@Column(name = "Date_of_birth")
		private LocalDate emoDOB;

		public Long getEmpId() {
			return empId;
		}

		public void setEmpId(Long empId) {
			this.empId = empId;
		}

		public String getEmpFirstName() {
			return empFirstName;
		}

		public void setEmpFirstName(String empFirstName) {
			this.empFirstName = empFirstName;
		}

		public String getEmpLastName() {
			return empLastName;
		}

		public void setEmpLastName(String empLastName) {
			this.empLastName = empLastName;
		}

		public String getEmpEmail() {
			return empEmail;
		}

		public void setEmpEmail(String empEmail) {
			this.empEmail = empEmail;
		}

		public LocalDate getEmoDOB() {
			return emoDOB;
		}

		public void setEmoDOB(LocalDate emoDOB) {
			this.emoDOB = emoDOB;
		}

		public Employee(String empFirstName, String empLastName, String empEmail, LocalDate emoDOB) {
			super();
			this.empFirstName = empFirstName;
			this.empLastName = empLastName;
			this.empEmail = empEmail;
			this.emoDOB = emoDOB;
		}

		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
					+ ", empEmail=" + empEmail + ", emoDOB=" + emoDOB + "]";
		}
		
		
}
