package harish.comparator;

/**
 * Assignment - 97 : 26th Jan'2025
 * 
 * Create a class called Builder, define few variables and provide a mechanism
 * to initialise them while creating an object. Create an ArrayList, add few
 * builders object in the Arraylist and sort them based on multiple parameter.
 * 
 * Attribute : name, city, exp, revenue expecting sorting based on revenue and
 * exp.
 * 
 * make sure while you print the list after sorting, it should print name,
 * revenue, exp in sorted order of revenue.
 */

public class Builder {

	private int builderId;

	private String builderName, builderCity;

	private double builderExperience, builderRevenue;

	Builder(int builderId, String builderName, String builderCity, double builderExperience, double builderRevenue) {
		this.builderId = builderId;
		this.builderName = builderName;
		this.builderCity = builderCity;
		this.builderExperience = builderExperience;
		this.builderRevenue = builderRevenue;
	}

	public int getBuilderId() {
		return builderId;
	}

	public String getBuilderName() {
		return builderName;
	}

	public String getBuilderCity() {
		return builderCity;
	}

	public double getBuilderExperience() {
		return builderExperience;
	}

	public double getBuilderRevenue() {
		return builderRevenue;
	}

	@Override
	public String toString() {
		return "Name=" + builderName + ", Exp=" + builderExperience + ", Rev=" + builderRevenue + "\n";
	}
}