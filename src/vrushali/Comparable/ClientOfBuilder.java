package vrushali.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//Assignment - 94 : 26th Jan'2025
//Create a class called Builder, define few variables and provide a mechanism to initialise them while creating an object.
//Create an ArrayList, add few builders object in the Arraylist and sort them based on any of the parameter.
//
//Attribute : name, city, exp, revenue
//expecting sorting based on revenue. 
//make sure while you print the list after sorting, it should print name and revenue in sorted order of revenue.

public class ClientOfBuilder {
	public static void main(String[] args) {
		List<Builder> builderList = new ArrayList<Builder>();
		builderList.add(new Builder("Rohan", "Pune", 3, 121));
		builderList.add(new Builder("Lodha", "Pune", 2, 453));
		builderList.add(new Builder("Atul", "Pune", 12, 322));
		builderList.add(new Builder("Sai", "Pune", 5, 654));
		builderList.add(new Builder("Ora", "Pune", 6, 345));

		Collections.sort(builderList);
		System.out.println(builderList);
	}

}
