package siddharth;

public class Assignment94Builder implements Comparable<Assignment94Builder> {

	String name;
	String city;
	int exp;
	int revenue;

	Assignment94Builder(String name, String city, int exp, int revenue) {
		this.name = name;
		this.city = city;
		this.exp = exp;
		this.revenue = revenue;
	}

	@Override
	public String toString() {
		return "Name=" + name + ", City=" + city + ", Exp=" + exp + ", Revenue=" + revenue;
	}

	@Override
	public int compareTo(Assignment94Builder o) {
		return this.revenue-o.revenue;
	}

}
