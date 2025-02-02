package pramod.collection;

public class Builder implements Comparable<Builder>{

	String name;
	String city;
	int exp, revenue;

	public Builder(String name, String city, int exp, int revenue) {
		this.name = name;
		this.city = city;
		this.exp = exp;
		this.revenue = revenue;
	}

	public String toString() {
		//return "Name:" + name+ ", City: "+city +", Exp: "+ exp +", Rev:"+ revenue;
		return "Name:" + name+ ", Rev:"+ revenue;
	}

	public int compareTo(Builder o) {
		return this.revenue - o.revenue;
		//return this.exp - o.exp;
		//return this.name.compareTo(o.name);
	}

}