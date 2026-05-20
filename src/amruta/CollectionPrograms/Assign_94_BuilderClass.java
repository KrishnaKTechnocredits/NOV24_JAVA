/*
 * Assignment - 94 : 26th Jan'2025
 * 
 * Create a class called Builder, define few variables and provide a mechanism
 * to initialize them while creating an object.
 * 
 * Create an ArrayList, add few builders object in the Arraylist and sort them
 * based on any of the parameter.
 * 
 * Attribute : name, city, exp, revenue
 * 
 * expecting sorting based on revenue.
 * 
 * make sure while you print the list after sorting, it should print name and
 * revenue in sorted order of revenue.
 */

package amruta.CollectionPrograms;

public class Assign_94_BuilderClass implements Comparable<Assign_94_BuilderClass> {

	private String name;
	private String city;
	private int experience;
	private double revenue;

	Assign_94_BuilderClass(String name, String city, int experience, double revenue) {
		setName(name);
		setCity(city);
		setExperience(experience);
		setRevenue(revenue);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public double getRevenue() {
		return revenue;
	}

	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}

	@Override
	public String toString() {
		return "Builder [name=" + name + ", revenue=" + revenue + "]\n";
	}

	/**
	 * comparison based on revenue of builder
	 * 
	 * We are using Double.valueOf(d) to convert our primitive data type double to
	 * it's Wrapper class object to further compareTo method provided by Double
	 * class to make comparison
	 */

	@Override
	public int compareTo(Assign_94_BuilderClass builder) {
		
	//	return Double.valueOf(this.revenue).compareTo(Double.valueOf(builder.revenue));
		return (int) (this.revenue - builder.revenue);
	}
}