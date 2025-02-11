package pramod.collection;

public class Student {

	int rno;
	String name, grade, city;

	Student(int rno, String name, String grade, String city) {
		this.rno = rno;
		this.name = name;
		this.grade = grade;
		this.city = city;
	}

	public boolean equals(Object obj) {
		Student s = (Student) obj;
		return rno == s.rno && name.equals(s.name) && city.equals(s.city);
	}

	public String toString() {
		return "RNO: " + rno + ", Name: " + name + ", Grade: " + grade + ", City: " + city+"||";
	}

	public int hashCode() {
		return rno;
	}

}
