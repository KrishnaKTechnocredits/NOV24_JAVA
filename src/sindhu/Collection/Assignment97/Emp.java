/*Create a class called Employee, define few variables and provide a mechanism to 
 * initialise them while creating an object.
 * name, city, exp, revenue
expecting sorting based on revenue and exp.*/

package sindhu.Collection.Assignment97;

public class Emp {
	String name;
	String city;
	int exp;
	double revenue;
	
	public Emp(String name, String city, int exp, double revenue){
		this.name= name;
		this.city = city;
		this.exp = exp;
		this.revenue = revenue;
	}
	
	public String toString(){
		return "[name=" + name + ", expense=" + exp + ", revenue=" + revenue + "]";
	}
}
