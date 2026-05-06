/*Assignment - 94 : 26th Jan'2025
Create a class called Builder, define few variables and provide a mechanism to initialise them while creating an object.
Create an ArrayList, add few builders object in the Arraylist and sort them based on any of the parameter.

Attribute : name, city, exp, revenue
expecting sorting based on revenue. 
make sure while you print the list after sorting, it should print name and revenue in sorted order of revenue.
*/

package pramod.collection;

import java.util.*;

class Assignment94 {

	 void sortRevenue() {
		List<Builder> listOfBuilder = new ArrayList<Builder>();
		listOfBuilder.add(new Builder("VTP", "pune", 10, 100));
		listOfBuilder.add(new Builder("Vekatesh", "Ambegaon", 15, 90));
		listOfBuilder.add(new Builder("Basil", "Katraj", 9, 110));
		listOfBuilder.add(new Builder("Govind", "Vadgaon", 6, 50));
		
		System.out.println("List of Builders before sort: "+listOfBuilder);
		
		Collections.sort(listOfBuilder);
		System.out.println("List of Builders after applying sorting: "+listOfBuilder);
		
	}

	public static void main(String[] args) {
		new Assignment94().sortRevenue();
	}
}