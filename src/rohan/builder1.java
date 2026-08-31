/*
 * Assignment - 94 : 26th Jan'2025
Create a class called Builder, define few variables and provide a mechanism to initialise them while creating an object.
Create an ArrayList, add few builders object in the Arraylist and sort them based on any of the parameter.

Attribute : name, city, exp, revenue
expecting sorting based on revenue. 
make sure while you print the list after sorting, it should print name and revenue in sorted order of revenue.
 */

package rohan;
import java.util.*;
public class builder1 {

	public static void main(String[] args) {
		
		List<Builder> input = new ArrayList<Builder>();
		input.add(new Builder("Rohan","Solapur",97));
		input.add(new Builder("Pavan","Pune",77));
		input.add(new Builder("Ravi","Mumbai",67));
		input.add(new Builder("Vishal","Hyderabad",27));
		input.add(new Builder("Ishita","Vapi",9));
		input.add(new Builder("Deepak","Deccan",15));
		
		System.out.println(input);
		Collections.sort(input);
		System.out.println(input);
		
	}
}
