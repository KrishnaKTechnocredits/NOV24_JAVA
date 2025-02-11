package imran.CollectionFramework.sorting.Comparable;

public class Employee implements Comparable<Employee>{

	String name, city;
	int age, salary;
	public Employee(String name, String city, int age, int salary) {
		super();
		this.name = name;
		this.city = city;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee s) {
		return this.name.compareTo(s.name);
	}
	
	public String toString()
	{
		return "name is : " + name + ", city is :" + city + ",  age is : "+ age+ ",  salary is : " + salary  +"\n";
	}
	
}
