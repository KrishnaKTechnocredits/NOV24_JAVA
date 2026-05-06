package kishor;

public class Assignment94_Builder implements Comparable<Assignment94_Builder>{

	String name;
	String city;
	int experience;
	int revenue;

	public Assignment94_Builder(String name, String city, int experience, int revenue) {
		this.name = name;
		this.city = city;
		this.experience = experience;
		this.revenue = revenue;
	}
	
	public String toString() {
		return "Name:- "+name +" Revenue:- "+revenue;
	}
	
	public int compareTo(Assignment94_Builder obj) {
		return this.revenue-obj.revenue;
	}

}
