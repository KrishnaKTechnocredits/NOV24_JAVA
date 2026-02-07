package roshan.ComparableComperator;


public class Builder implements Comparable <Builder> { //spelling mistake in implement and comparable
	String name;
	String city;
	int experience;
	int revenue;
	
	
	Builder(String Name,String City,int Experience,int Revenue){
		this.name = Name;
		this.city =City;
		this.experience =Experience;
		this.revenue =Revenue;
		}
	
	public String toString() {
		return "Builder Name :" + name + ",Currentcity: " + ", Total revenue  :" + revenue ; //as sorting need only on name and revenue
	}

	public int compareTo(Builder obj) {
	return this.revenue - obj.revenue;
	}

}


/**
 * Assignment - 94 : 26th Jan'2025 Create a class called Builder, define few
 * variables and provide a mechanism to initialise them while creating an
 * object. Create an ArrayList, add few builders object in the Arraylist and
 * sort them based on any of the parameter. Attribute : name, city, exp, revenue
 * expecting sorting based on revenue. make sure while you print the list after
 * sorting, it should print name and revenue in sorted order of revenue.
 */



