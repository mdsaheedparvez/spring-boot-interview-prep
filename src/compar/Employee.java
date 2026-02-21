package compar;

//public class Employee implements Comparable<Employee>{
	public class Employee {
	
	private String empName;
	private String phone;
	private int empId;
	private Double  salary;
	
//	@Override
//	public int compareTo(Employee o) {
//		// TODO Auto-generated method stub
//		return this.empId - o.empId;
//	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getphone() {
		return phone;
	}
	public void setphone(String phone) {
		this.phone = phone;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public Employee(String empName, String phone, int empId, Double salary) {
		super();
		this.empName = empName;
		this.phone = phone;
		this.empId = empId;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", phone=" + phone + ", empId=" + empId + ", salary=" + salary + "]";
	}
	

	

	

}
