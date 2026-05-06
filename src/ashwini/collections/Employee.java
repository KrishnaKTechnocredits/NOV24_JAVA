package ashwini.collections;
//Assignment97
public class Employee {
	String name;
	String city;
	int exp, salary;
	
	
	public Employee(String name, String city, int exp, int salary) {
		super();
		this.name = name;
		this.city = city;
		this.exp = exp;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + ", exp=" + exp + ", salary=" + salary + "]";
	}


	public static void main(String[] args) {
		
	}
}
