package harish.collections;

import java.util.Objects;

/**
 * Assignment - 99 : 1st Feb'2025
 * 
 * Create a class called Student and return the unique set of students. Student
 * can have, rno, name, grade, city. If rno, name and city is same then student
 * will be considered as duplicate.
 * 
 * Hint : override hashcode() and equals() method.
 */

public class A99_Student {

	int rollNumber;
	String name;
	char grade;
	String city;

	public A99_Student(int rollNumber, String name, char grade, String city) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.grade = grade;
		this.city = city;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public String getName() {
		return name;
	}

	public char getGrade() {
		return grade;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Student{" + "rno=" + rollNumber + ", name='" + name + '\'' + ", grade='" + grade + '\'' + ", city='"
				+ city + '\'' + '}';
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, name, rollNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A99_Student a99_Student = (A99_Student) obj;
		return Objects.equals(city, a99_Student.city) && Objects.equals(name, a99_Student.name)
				&& rollNumber == a99_Student.rollNumber;
	}
}