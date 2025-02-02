package fazrana.compare;

import java.util.*;
public class Builder implements Comparable<Builder> {
	String name;
	String city;
	int expenses;
	int revenue;
	public Builder(String name, String city, int expenses, int revenue) {
		super();
		this.name = name;
		this.city = city;
		this.expenses = expenses;
		this.revenue = revenue;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", revenue=" + revenue + "]";
	}
	@Override
	public int compareTo(Builder o) {
		return this.revenue- o.revenue;
	}
	
	
}
