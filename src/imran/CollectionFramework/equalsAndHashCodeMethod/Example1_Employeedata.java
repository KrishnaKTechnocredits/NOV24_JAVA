package imran.CollectionFramework.equalsAndHashCodeMethod;

import java.util.HashSet;
import java.util.Set;

public class Example1_Employeedata {

	void getEmployeeData()
	{
		Set<Employee> empList = new HashSet<Employee>();
		empList.add(new Employee(101,"Rupesh",30000,"Satna", "CSE"));
		empList.add(new Employee(102,"Mahesh",20000,"Satna", "Sales"));
		empList.add(new Employee(103,"Ganesh",15400,"Unchehra", "Electrical"));
		empList.add(new Employee(101,"Rupesh",3000,"Satna", "CSE")); // duplicate
		empList.add(new Employee(104,"Durgesh",35000,"Satna", "CSE"));
		empList.add(new Employee(105,"Alam",10000,"Maihar", "CSE"));
		empList.add(new Employee(106,"Dheeraj",20600,"Rewa", "IT"));
		empList.add(new Employee(102,"Mahesh",20000,"Satna", "Sales"));// duplicate
		empList.add(new Employee(101,"Rupesh",3000,"Satna", "CSE")); // duplicate
		
		System.out.println(empList);
	}
	
	public static void main(String[] args) {
		Example1_Employeedata example1 = new Example1_Employeedata();
		example1.getEmployeeData();
		
	}
}
