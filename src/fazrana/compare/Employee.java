package fazrana.compare;

public class Employee  {
	String name;
	String city;
	int expense;
	int revenue;
	public Employee(String name, String city, int expense, int revenue) {
		super();
		this.name = name;
		this.city = city;
		this.expense = expense;
		this.revenue = revenue;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", expense=" + expense + ", revenue=" + revenue + "]";
	}
	
}
