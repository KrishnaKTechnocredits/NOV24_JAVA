package roshan.comperatorAssignment97;

public class Employee {
	String name,city;
	int exp,revenue;
	
	public Employee(String name,String city, int exp,int revenue) {
		
		this.name =name;
		this.city = city;
		this.exp = exp;
		this.revenue = revenue;
		
	}
	public String toString(){
		return "name : "+ name + ", revenue :" + revenue + ",exp :"+ exp; //write attribute what we want to show in output
		
	}

}


/*
 * Assignment - 97 : 26th Jan'2025 Create a class called Employee, define few
 * variables and provide a mechanism to initialise them while creating an
 * object. Create an ArrayList, add few builders object in the Arraylist and
 * sort them based on multiple parameter. Attribute : name, city, exp, revenue
 * expecting sorting based on revenue and exp. make sure while you print the
 * list after sorting, it should print name, revenue, exp in sorted order of
 * revenue
 */