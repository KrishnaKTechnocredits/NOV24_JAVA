/*
 * Assignment - 94 : 26th Jan'2025
Create a class called Builder, define few variables and provide a mechanism to initialise them while creating an object.
Create an ArrayList, add few builders object in the Arraylist and sort them based on any of the parameter.

Attribute : name, city, exp, revenue
expecting sorting based on revenue. 
make sure while you print the list after sorting, it should print name and revenue in sorted order of revenue.
 */

package rohan;

public class Builder implements Comparable<Builder> {
	
	String name;
	String city;
	int revenue;

	public Builder(String name, String city, int revenue){
		
		super();
		this.name = name;
		this.city = city;
		this.revenue = revenue;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name::"+ name +" city::" + city +" revenue::" + revenue;
	}
	/*
	public int compareTo(Builder b) {
		return this.revenue-b.revenue;
	} */
	
	public int compareTo(Builder B) {
		return this.name.compareTo(B.name);
	}
}
