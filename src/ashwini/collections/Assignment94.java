package ashwini.collections;

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
	
	 void m1() {
		ArrayList<Builder> listOfBuilder=new ArrayList<>();
		
		listOfBuilder.add(new Builder("Kalpataru", "pune", 12, 9089567));
		listOfBuilder.add(new Builder("Lodha", "Mumbai", 19, 879654));
		listOfBuilder.add(new Builder("Arbor Vista", "Nagpur", 10, 189567));
		listOfBuilder.add(new Builder("Zen", "Kharadi", 17, 7689765));
		 System.out.println(listOfBuilder);
        Collections.sort(listOfBuilder);
        System.out.println(listOfBuilder);
	}
	
public static void main(String[] args) {
	Assignment94 a94=new Assignment94();
	a94.m1();
}
}
