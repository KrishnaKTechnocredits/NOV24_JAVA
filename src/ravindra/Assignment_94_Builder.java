package ravindra;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment_94_Builder implements Comparable<Assignment_94_Builder> {
	String name;
	String city;
	int exp;
	int revenue;

	Assignment_94_Builder(String name, String city, int exp, int revenue) {
		this.name = name;
		this.city = city;
		this.exp = exp;
		this.revenue = revenue;
	}

	@Override
	public String toString() {
		return "Name :" + name + ", City :" + city + ", Experience :" + exp + ", Revenue :" + revenue;
	}

	@Override
	public int compareTo(Assignment_94_Builder obj) {
		return revenue - obj.revenue;
	}

	public static void main(String[] args) {
		ArrayList<Assignment_94_Builder> ar = new ArrayList<Assignment_94_Builder>();
		ar.add(new Assignment_94_Builder("Lodha Group", "Pune", 30, 5000000));
		ar.add(new Assignment_94_Builder("Pride Group", "Mumbai", 15, 2500000));
		ar.add(new Assignment_94_Builder("Rohan Builders.", "Pune", 31, 6500000));
		ar.add(new Assignment_94_Builder("Vilas Javdekar.", "Hinjewadi", 11, 63000000));
		ar.add(new Assignment_94_Builder("Kolte Patil.", "Banner", 19, 59000000));
		
		System.out.println(ar);
		Collections.sort(ar);
		System.out.println("====================================");
		System.out.println(ar);
	}

}
