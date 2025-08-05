package Assignment_Comparator_andComparable;

import java.util.Objects;

public class Student {

	String name;
	String city;
	char grade;
	int rno;
	public Student(String name, String city, char grade, int rno) {
		super();
		this.name = name;
		this.city = city;
		this.grade = grade;
		this.rno = rno;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", grade=" + grade + ", rno=" + rno + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	@Override
	public int hashCode() {
		return rno;
	}
	@Override
	public boolean equals(Object obj) {
		Student std = (Student)obj;
		return this.name.equals(std.name) && this.city.equals(std.city);
	}
	
	
}
