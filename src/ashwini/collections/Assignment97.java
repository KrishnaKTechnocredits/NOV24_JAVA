package ashwini.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 Assignment - 97 : 26th Jan'2025
Create a class called Employee, define few variables and provide a mechanism to initialise them while creating an object.
Create an ArrayList, add few builders object in the Arraylist and sort them based on multiple parameter.

Attribute : name, city, exp, revenue
expecting sorting based on revenue and exp. 

make sure while you print the list after sorting, it should print name, revenue, exp in sorted order of revenue.

 */
public class Assignment97 {
void sortEmployee() {
	List <Employee> listOfEmployee=new ArrayList<Employee>();
	listOfEmployee.add(new Employee("Ashwini", "pune", 8, 50000));
	listOfEmployee.add(new Employee("Komal", "Mumbai", 10, 75000));
	listOfEmployee.add(new Employee("Mrunmayee", "Nagpur", 6, 45000));
	listOfEmployee.add(new Employee("Arohi", "Kharadi", 9, 90000));
	Collections.sort(listOfEmployee,new ExpComparator());
	System.out.println(listOfEmployee);
	Collections.sort(listOfEmployee,new RevComparator());
	System.out.println(listOfEmployee);
}
	public static void main(String[] args) {
		Assignment97 a97=new Assignment97();
		a97.sortEmployee();

	}

}
