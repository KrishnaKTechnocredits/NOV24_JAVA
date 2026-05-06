package fazrana.map;

public class Student {
	String name, city;
	int rnumber,grade;
	
	public Student(String name, String city, int rnumber, int grade) {
//		super();
		this.name = name;
		this.city = city;
		this.rnumber = rnumber;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", rnumber=" + rnumber + ", grade=" + grade + "]";
	}

	@Override
	public int hashCode() {
		return rnumber;
	}
	
	public boolean equals(Object obj) {
		Student e=(Student)obj;
		return this.name.equals(e.name) && this.rnumber==e.rnumber && this.city.equals(e.city);
	}
	
	
}
