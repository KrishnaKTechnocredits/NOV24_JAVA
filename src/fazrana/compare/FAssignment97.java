//Assignment - 97 : 26th Jan'2025
//Create a class called Employee, define few variables and provide a mechanism to initialise them while creating an object.
//Create an ArrayList, add few builders object in the Arraylist and sort them based on multiple parameter.
//
//Attribute : name, city, exp, revenue
//expecting sorting based on revenue and exp. 
//
//make sure while you print the list after sorting, it should print name, revenue, exp in sorted order of revenue.

package fazrana.compare;

import java.util.*;

public class FAssignment97 {

	List<Employee> getArray() {
		List<Employee> list= new ArrayList<Employee>();
		list.add(new Employee("Name1","City1",300,100));
		list.add(new Employee("Name2","City2",200,300));
		list.add(new Employee("Name3","City3",100,400));
		list.add(new Employee("Name4","City4",400,200));
		return list;
	}
	
	void getSortedArrayRevenue() {
		List<Employee> list= new ArrayList<Employee>();
		list=getArray();
		Collections.sort(list, new RevenueSortClass());
		System.out.println("Sorted based on Reveue: "+list);
	}
	
	void getSortedArrayExp() {
		List<Employee> list= new ArrayList<Employee>();
		list=getArray();
		Collections.sort(list, new ExpSortClass());
		System.out.println("Sorted based on Expense: "+list);
	}
	
	public static void main(String[] args) {
		new FAssignment97().getSortedArrayRevenue();
		new FAssignment97().getSortedArrayExp();
	}
}
