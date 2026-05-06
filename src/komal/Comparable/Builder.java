//
//Assignment - 94 : 26th Jan'2025
//Create a class called Builder, define few variables and provide a mechanism to initialise them while creating an object.
//Create an ArrayList, add few builders object in the Arraylist and sort them based on any of the parameter.
//
//Attribute : name, city, exp, revenue
//expecting sorting based on revenue. 
//make sure while you print the list after sorting, it should print name and revenue in sorted order of revenue.

package komal.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Builder {

	void getSortedData() {
		ArrayList<BuilderDetails> list = new ArrayList<BuilderDetails>();
		list.add(new BuilderDetails("VTP Realty", "pune", 9, 19));
		list.add(new BuilderDetails("Lodha Group	", "Mumbai", 6, 9));
		list.add(new BuilderDetails("Godrej Properties", "Nashi", 8, 2));

		Collections.sort(list);
		System.out.print(list);
	}

	public static void main(String[] args) {

		new Builder().getSortedData();
	}

}
