package komal.Comparable;

public class BuilderDetails implements Comparable<BuilderDetails> {
	String name, location;
	int exp, revenue;

	BuilderDetails(String name, String location, int exp, int revenue) {

		this.name = name;
		this.location = location;
		this.exp = exp;
		this.revenue = revenue;
	}

	@Override
	public String toString() {
		return "BuilderDetails [name=" + name + ", location=" + location + ", exp=" + exp + ", revenue=" + revenue
				+ "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compareTo(BuilderDetails o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}

}
