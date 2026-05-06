package imran.CollectionFramework.equalsAndHashCodeMethod;

public class Employee {

	int emp_id, salary ;
	String EmpName, City, department;
	
	public Employee(int emp_id, String empName, int salary, String city, String department) {
		super();
		this.emp_id = emp_id;
		this.salary = salary;
		this.EmpName = empName;
		this.City = city;
		this.department = department;
	}
	
	public int hashCode()
	{
		return emp_id;
	}
	
	public String toString()
	{
		return "Emp_id is : " + this.emp_id + " Name is : " + this.EmpName +" salary is : " + this.salary + " city is : " + this.City + " Department is : " + this.department + "\n";
	}
	
	public boolean equals(Object obj)
	{
		Employee empl = (Employee) obj;
		return this.emp_id == empl.emp_id && this.EmpName.equals(empl.EmpName) && this.City.equals(empl.City) && this.department.equals(empl.department);
	}
	
}
