package anuja.collection.Comparable;

import java.util.ArrayList;
import java.util.Collections;

/*Assignment - 94 : 26th Jan'2025
Create a class called Builder, define few variables and provide a mechanism to initialise them while creating an object.
Create an ArrayList, add few builders object in the Arraylist and sort them based on any of the parameter.

Attribute : name, city, exp, revenue
expecting sorting based on revenue. 
make sure while you print the list after sorting, it should print name and revenue in sorted order of revenue.*/
public class Assignment94 {
	
	public void m1() {
		ArrayList<BuilderAssignment94> list1 = new ArrayList<BuilderAssignment94>();
		list1.add(new BuilderAssignment94("Anuja" , 10 , 900 , "Pune"));
		list1.add(new BuilderAssignment94("Parttek" , 9 , 800 , "Hyd"));
		list1.add(new BuilderAssignment94("Ameya" , 6 , 300 , "Nanded"));
		list1.add(new BuilderAssignment94("Soan" , 4 , 600 , "Nanded"));
		
		 // Display  before sorting
        System.out.println("Before sorting: \n" + list1);
        System.out.println("---------------------------");

        // Sorting the list using Collections.sort() which relies on Comparable
        Collections.sort(list1);

        // Display list after sorting
        System.out.println("After sorting: \n" + list1);

	}
	
	
	public static void main(String[] args) {
		new Assignment94().m1();
	}
}
