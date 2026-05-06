package siddharth;

import java.util.ArrayList;
import java.util.Collections;

/*
Assignment - 94 : 26th Jan'2025
Create a class called Builder, define few variables and provide a mechanism to initialise them while creating an object.
Create an ArrayList, add few builders object in the Arraylist and sort them based on any of the parameter.

Attribute : name, city, exp, revenue
expecting sorting based on revenue. 
make sure while you print the list after sorting, it should print name and revenue in sorted order of revenue.
 */
public class Assignment94 {
	
	void printBuilderData() {
		ArrayList<Assignment94Builder> listOfBuilders = new ArrayList<Assignment94Builder>();
		listOfBuilders.add(new Assignment94Builder("Ezio","Florence",10,24000));
		listOfBuilders.add(new Assignment94Builder("Altair","Masyaf",12,25000));
		listOfBuilders.add(new Assignment94Builder("Edward","Wales",14,20000));
		listOfBuilders.add(new Assignment94Builder("Kassandra","Sparta",17,19000));
		listOfBuilders.add(new Assignment94Builder("Bayek","Siwa",15,23000));
		
		Collections.sort(listOfBuilders);
		System.out.println(listOfBuilders);
	}

	public static void main(String[] args) {
		Assignment94 assignment94 = new Assignment94();
		assignment94.printBuilderData();
	}
}
