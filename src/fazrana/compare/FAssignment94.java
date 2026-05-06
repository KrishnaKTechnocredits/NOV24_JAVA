//Assignment - 94 : 26th Jan'2025
//Create a class called Builder, define few variables and provide a mechanism to initialise them while creating an object.
//Create an ArrayList, add few builders object in the Arraylist and sort them based on any of the parameter.
//
//Attribute : name, city, exp, revenue
//expecting sorting based on revenue. 
//make sure while you print the list after sorting, it should print name and revenue in sorted order of revenue.


package fazrana.compare;

import java.util.*;

public class FAssignment94 {
	
	void sortByRevenue() {
		List<Builder> list= new ArrayList<Builder>();
		list.add(new Builder("User1","City1",100,500));
		list.add(new Builder("User2","City2",200,900));
		list.add(new Builder("User3","City3",300,700));
		list.add(new Builder("User4","City4",400,300));
		System.out.println(list);
		
//		list.sort(Builder);
		Collections.sort(list);
		System.out.println(list);
		
	}
	public static void main(String[] args) {
		FAssignment94 fassignment94=new FAssignment94();
		fassignment94.sortByRevenue();
	}

}
