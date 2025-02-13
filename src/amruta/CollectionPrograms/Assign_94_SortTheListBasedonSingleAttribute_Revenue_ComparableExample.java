/*
 * Assignment - 94 : 26th Jan'2025
 * 
 * Create a class called Builder, define few variables and provide a mechanism
 * to initialize them while creating an object.
 * 
 * Create an ArrayList, add few builders object in the Arraylist and sort them
 * based on any of the parameter.
 * 
 * Attribute : name, city, exp, revenue
 * 
 * expecting sorting based on revenue.
 * 
 * make sure while you print the list after sorting, it should print name and
 * revenue in sorted order of revenue.
 */

package amruta.CollectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assign_94_SortTheListBasedonSingleAttribute_Revenue_ComparableExample {

	public static void main(String[] args) {

		List<Assign_94_BuilderClass> listOfBuilders = new ArrayList<Assign_94_BuilderClass>();
		listOfBuilders.add(new Assign_94_BuilderClass("Clover", "Pune", 30, 34.00));
		listOfBuilders.add(new Assign_94_BuilderClass("Evershine", "Mumbai", 35, 27.00));
		listOfBuilders.add(new Assign_94_BuilderClass("Nirman", "Nashik", 27, 12.50));
		listOfBuilders.add(new Assign_94_BuilderClass("Swayam", "Satara", 18, 49.60));
		listOfBuilders.add(new Assign_94_BuilderClass("Vishwanath", "Ahmedabad", 19, 78.50));
		listOfBuilders.add(new Assign_94_BuilderClass("Skyline", "Jaipur", 12, 67.00));
		System.out.println("List of Builders : \n" + listOfBuilders);

		Collections.sort(listOfBuilders);

		System.out.println("\nList of Builders after sorting based on revenue : \n" + listOfBuilders);
	}
}