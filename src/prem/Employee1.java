package prem;

public class Employee1 {

	String name;
	String city;
	int exp, salary;
		
		
	public Employee1(String name, String city, int exp, int salary) {
		super();
		this.name = name;
		this.city = city;
		this.exp = exp;
		this.salary = salary;
	}

	public String toString() {
		return "Employee [name=" + name + ", city=" + city + ", exp=" + exp + ", salary=" + salary + "]";
	}
}
