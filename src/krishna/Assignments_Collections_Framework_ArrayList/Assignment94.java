package Assignments_Collections_Framework_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment94 {

	public static void main(String[] args) {
		List<Builder> listOfBuilders = new ArrayList<Builder>();
		listOfBuilders.add(new Builder("akansha", "biaora", (byte)2, 200000));
		listOfBuilders.add(new Builder("krishna", "biaora", (byte)3, 150000));
		listOfBuilders.add(new Builder("vishal", "biaora", (byte)5, 800000));
		
		Collections.sort(listOfBuilders);
		System.out.println(listOfBuilders);
	}
}

final class Builder implements Comparable<Builder>{
	
	String name;
	String city;
	byte exp;
	int revenue;
	
	public Builder(String name, String city, byte exp, int revenue) {
		super();
		this.name = name;
		this.city = city;
		this.exp = exp;
		this.revenue = revenue;
	}

	@Override
	public String toString() {
		return "Builder [name=" + name + ", revenue=" + revenue + "]";
	}

	@Override
	public int compareTo(Builder o) {
		//for ascending order
		return this.revenue - ((Builder)o).revenue;
		
		//for descending order
		//return ((Builder)o).revenue-this.revenue;
	}
	
	
	
}