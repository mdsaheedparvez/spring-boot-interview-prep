package compar;

//public class Employee implements Comparable<Employee>{
	public class Employee {
	
	private String empName;
	private String phone;
	private int empId;
	
//	@Override
//	public int compareTo(Employee o) {
//		// TODO Auto-generated method stub
//		return this.empId - o.empId;
//	}
	
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
	
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", phone=" + phone + ", empId=" + empId + "]";
	}
	public Employee(String empName, String phone, int empId) {
		super();
		this.empName = empName;
		this.phone = phone;
		this.empId = empId;
	}

	

}
