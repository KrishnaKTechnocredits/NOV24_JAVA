package prem;

import java.util.Objects;

public class Student {

	int rno;
	String name, city;
	char grade;

	public Student(int rno, String name, String city, char grade) {
		super();
		this.rno = rno;
		this.name = name;
		this.city = city;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", city=" + city + ", grade=" + grade + "]";
	}

	@Override
	public int hashCode() {
		return rno;
	}

	@Override
	public boolean equals(Object obj) {
		Student other = (Student) obj;
		return grade == other.grade && Objects.equals(name, other.name) && rno == other.rno;
	}

}
