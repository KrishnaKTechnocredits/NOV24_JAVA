package Assignment_Comparator_andComparable;

import java.util.Comparator;

public class Assignment97_Employee {

	String name;
	String city;
	int exp;
	int revenue;

	
	public Assignment97_Employee(String name, String city, int exp, int revenue) {
		super();
		this.name = name;
		this.city = city;
		this.exp = exp;
		this.revenue = revenue;
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

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getRevenue() {
		return revenue;
	}

	public void setRevenue(int revenue) {
		this.revenue = revenue;
	}

	public String toString() {
		return "empName = " + name + " empCity = " + city + " revenue = " + revenue + " empExp = " + exp;

	}
}
