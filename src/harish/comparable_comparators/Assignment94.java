package harish.comparable_comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
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

public class Assignment94 {

	public static void main(String[] args) {

		List<Builder> listOfBuilders = new ArrayList<Builder>();
		listOfBuilders.add(new Builder("Lodha", "Mumbai", 30, 59.00));
		listOfBuilders.add(new Builder("Heeranandani", "Mumbai", 35, 48.00));
		listOfBuilders.add(new Builder("DLF", "Gurgaon", 27, 87.50));
		listOfBuilders.add(new Builder("Gera", "Pune", 18, 24.60));
		listOfBuilders.add(new Builder("Panchshil", "Pune", 19, 33.50));
		listOfBuilders.add(new Builder("Orange City", "Nagpur", 12, 18.00));

		System.out.println("List of Builders : " + listOfBuilders);

		Collections.sort(listOfBuilders);

		System.out.println("List of Builders after sorting based on revenue : " + listOfBuilders);
	}
}