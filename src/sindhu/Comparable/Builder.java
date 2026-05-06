/*Create a class called Builder, define few variables and provide a mechanism to initialise them while creating an object.
Create an ArrayList, add few builders object in the Arraylist and sort them based on any of the parameter.

Attribute : name, city, exp, revenue
expecting sorting based on revenue. 
make sure while you print the list after sorting, it should print name and revenue in sorted order of revenue.*/

package sindhu.Comparable;

public class Builder implements Comparable<Builder> {
	String name;
	String city;
	float exp;
	double revenue;
	
	public Builder(String name, String city, float exp, double revenue) {
		this.name = name;
		this.city = city;
		this.exp = exp;
		this.revenue = revenue;
	}

	@Override
	public int compareTo(Builder b) {
		return Double.compare(this.revenue, b.revenue);
	}
	
	public String toString(){
		return "Name:" +name +", Revenue: "+ revenue;
		
	}
}
