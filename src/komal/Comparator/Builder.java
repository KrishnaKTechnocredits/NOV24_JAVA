package komal.Comparator;

public class Builder {
	String name, location;
	int exp, revenue;

	Builder(String name, String location, int exp, int revenue) {

		this.name = name;
		this.location = location;
		this.exp = exp;
		this.revenue = revenue;
	}

	@Override
	public String toString() {
		return "Builder [name=" + name + ", location=" + location + ", exp=" + exp + ", revenue=" + revenue + "]";
	}

}
