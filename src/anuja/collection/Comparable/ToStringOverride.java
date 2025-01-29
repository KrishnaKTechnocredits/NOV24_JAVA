package anuja.collection.Comparable;

class ToStringOverride {
	int id;
	String name;

	ToStringOverride(int id, String name) {
		this.id = id;
		this.name = name;
	}

	/*
	 * @Override public String toString() { return "Employee{id=" + id + ", name='"
	 * + name + "'}"; }
	 */

	public static void main(String[] args) {
		ToStringOverride e = new ToStringOverride(1, "Anuja");
		System.out.println(e); // Output: Employee{id=1, name='Anuja'}
	}

}
