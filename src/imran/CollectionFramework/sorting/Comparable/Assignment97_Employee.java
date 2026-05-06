/*
 Create a class called Employee, define few variables and provide a mechanism to initialise them while creating an object.
Create an ArrayList, add few builders object in the Arraylist and sort them based on multiple parameter.

Attribute : name, city, exp, salary
expecting sorting based on name 

make sure while you print the list after sorting, it should print name, revenue, exp in sorted order of revenue.
 */
package imran.CollectionFramework.sorting.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment97_Employee {

	void listEmployees()
	{
		List<Employee> listOfEmployee = new ArrayList<Employee>();
		listOfEmployee.add(new Employee("Imran", "satna", 7, 25));
		listOfEmployee.add(new Employee("Ahmed", "rewa", 6,21));
		listOfEmployee.add(new Employee("kanha", "sidhi",5,23));
		listOfEmployee.add(new Employee("Aadil", "Maihar",8,28));
		listOfEmployee.add(new Employee("Hasan","katni",11,32));
		System.out.println("The List of Employee is " + listOfEmployee);
		Collections.sort(listOfEmployee);
		System.out.println("The Sorted List of Employee, based on Names is " + listOfEmployee);
	}
	
	public static void main(String[] args) {
		new Assignment97_Employee().listEmployees();
	}
}
