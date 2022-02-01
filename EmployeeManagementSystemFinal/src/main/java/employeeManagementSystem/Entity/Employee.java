package employeeManagementSystem.Entity;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employeeid")
	private int empId;
	
	@Column(name = "employeename")
	@Size(min=3)
	private String empName;
	
	@Column(name = "employeeemail")
	@Email
	private String empEmail;
	
	@Column(name = "employeemobno")
	@Pattern(regexp = "[0-9]", message="mobile number contains only digits")
	private String empMobileNo;

	public Employee() {
		super();
	
	}

	public Employee(String empName, String empEmail, String empMobileNo) {
		super();
		this.empName = empName;
		this.empEmail = empEmail;
		this.empMobileNo = empMobileNo;
	}

	public Employee(int empId, String empName, String empEmail, String empMobileNo) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empMobileNo = empMobileNo;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpMobileNo() {
		return empMobileNo;
	}

	public void setEmpMobileNo(String empMobileNo) {
		this.empMobileNo = empMobileNo;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", empMobileNo="
				+ empMobileNo + "]";
	}
	
	
		
}