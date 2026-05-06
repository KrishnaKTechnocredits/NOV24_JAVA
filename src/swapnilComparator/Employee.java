package swapnilComparator;



public class Employee {
	
	String name;
	int empId;
	int age;
	int salary;
	
	public Employee(String name, int empId, int age, int salary) {
		super();
		this.name = name;
		this.empId = empId;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", age=" + age + ", salary=" + salary + "]";
	}

	
	
	
}
