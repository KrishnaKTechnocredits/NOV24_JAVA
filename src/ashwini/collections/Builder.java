package ashwini.collections;

//Assignment94

public class Builder implements Comparable<Builder> {
	String name;
	String city;
	int exp;
	int revenue;
	
	

	public Builder(String name, String city, int exp, int revenue) {
		
		this.name = name;
		this.city = city;
		this.exp = exp;
		this.revenue = revenue;
	}



	@Override
	public String toString() {
		return "name: " + name+ ","+"revenue :"+revenue;
	}



	@Override
	public int compareTo(Builder b) {
		
		return this.revenue - b.revenue;
	}
	
}


