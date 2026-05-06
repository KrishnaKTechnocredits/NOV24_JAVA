package pooja.collection;

public class Assignment_94 implements Comparable<Assignment_94> {

	String name, city;
	int exp;
	int revunue;

	public Assignment_94(String name, String city, int exp, int revunue) {
		this.name = name;
		this.city = city;
		this.exp = exp;
		this.revunue = revunue;
	}

	@Override
	public String toString() {
		return "Name=" + name + " " + "Revunue=" + revunue;
	}

	@Override
	public int compareTo(Assignment_94 o) {
		return this.revunue - o.revunue;
	}
}