//Assignment - 94 : 26th Jan'2025
//Create a class called Builder, define few variables and provide a mechanism to initialise them while creating an object.
//Create an ArrayList, add few builders object in the Arraylist and sort them based on any of the parameter.
//
//Attribute : name, city, exp, revenue
//expecting sorting based on revenue. 
//make sure while you print the list after sorting, it should print name and revenue in sorted order of revenue.

package komal.Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment94 {

	void getSortedData() {
		ArrayList<Builder> list = new ArrayList<Builder>();

		list.add(new Builder("VTP Realty", "pune", 9, 19));
		list.add(new Builder("Lodha Group	", "Mumbai", 6, 9));
		list.add(new Builder("Godrej Properties", "Nashi", 8, 2));

		Collections.sort(list, new RevenueComparator());
		System.out.println(list);
		Collections.sort(list, new ExperienceComparator());
		System.out.println(list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Assignment94().getSortedData();

	}

}
