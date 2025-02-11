/*
 Assignment - 94 : 26th Jan'2025
Create a class called Builder, define few variables and provide a mechanism to initialise them while creating an object.
Create an ArrayList, add few builders object in the Arraylist and sort them based on any of the parameter.

Attribute : name, city, exp, revenue
expecting sorting based on revenue. 
make sure while you print the list after sorting, it should print name and revenue in sorted order of revenue.
 */

package imran.CollectionFramework.sorting.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment94_Builder {
	
	List<Builder> listBuilder()
	{
		List<Builder> listOfBuilder = new ArrayList<Builder>();
		listOfBuilder.add(new Builder("Imran","Satna",12,33));
		listOfBuilder.add(new Builder("Aadil","Maihar",10,32));
		listOfBuilder.add(new Builder("Umar","Rewa",3,14));
		listOfBuilder.add(new Builder("Husnain","Maihar",10,34));
		System.out.println("The Given List is : " + listOfBuilder);
		Collections.sort(listOfBuilder);
		return listOfBuilder;
	}
	
	public static void main(String[] args) {
		List<Builder> builderList = new Assignment94_Builder().listBuilder();
		System.out.println("The Sorted list of Builder, based on revenue is " + builderList);
	}



	
}
