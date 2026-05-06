package imran.CollectionFramework.sorting.Comparator;

public class Employees {

	String name, city;
	int salary, experience;
	public Employees(String name, String city, int salary, int experience) {
		super();
		this.name = name;
		this.city = city;
		this.salary = salary;
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "name=" + name + ", city=" + city + ", salary=" + salary + ", experience=" + experience + "\n";
	}
	
	
	
}
