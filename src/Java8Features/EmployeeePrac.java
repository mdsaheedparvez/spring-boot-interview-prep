package Java8Features;

public class EmployeeePrac {
	
	private String empName;
	private String phone;
	private int age;
	private Double salary;
	private String department;

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


	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public EmployeeePrac(String empName, String phone, int age, Double salary, String department) {
		super();
		this.empName = empName;
		this.phone = phone;
		this.age = age;
		this.salary = salary;
		this.department = department;
	}

	@Override
	public String toString() {
		return "EmployeeePrac [empName=" + empName + ", phone=" + phone + ", age=" + age + ", salary=" + salary + ", department="+ department+"]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
