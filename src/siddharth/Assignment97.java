package siddharth;

import java.util.ArrayList;
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
	
	void EmployeeDetails() {
		List<Assignment97Employee> listOfEmployeeData = new ArrayList<Assignment97Employee>();
		listOfEmployeeData.add(new Assignment97Employee("Ezio","A123",10,24000));
		listOfEmployeeData.add(new Assignment97Employee("Altair","A124",12,25000));
		listOfEmployeeData.add(new Assignment97Employee("Edward","A125",14,20000));
		listOfEmployeeData.add(new Assignment97Employee("Kassandra","A126",17,19000));
		listOfEmployeeData.add(new Assignment97Employee("Bayek","A127",15,23000));
		
		Collections.sort(listOfEmployeeData, new Assignment97name());
		System.out.println("Sorted by Name: "+listOfEmployeeData);
		Collections.sort(listOfEmployeeData, new Assignment97exp());
		System.out.println("Sorted by Exp: "+listOfEmployeeData);
		Collections.sort(listOfEmployeeData, new Assignment97Revenue());
		System.out.println("Sorted by Revenue: "+listOfEmployeeData);
	}
	
	public static void main(String[] args) {
		Assignment97 assignment97 = new Assignment97();
		assignment97.EmployeeDetails();
	}
}
