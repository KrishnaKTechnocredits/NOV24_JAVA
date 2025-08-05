package siddharth;

import java.util.Objects;

/*
Assignment - 99 : 1st Feb'2025

Create a class called Student and return the unique set of students.
Student can have, rno, name, grade, city.
If rno, name and city is same then student will be considered as duplicate. 

Hint : override hashcode() and equals() method.
 */
public class Assignment99Student {
	
	int rno;
	String name;
	char grade;
	String city;
	
	public Assignment99Student(int rno,String name,char grade,String city) {
		super();
		this.rno = rno;
		this.name = name;
		this.grade = grade;
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Rno: "+rno+",Name: "+name+",Grade: "+grade+",City: "+city+"||";
	}
	
	@Override
	public int hashCode() { //used to determine the bucket placement for objects
		return rno;
	}
	
	@Override
	public boolean equals(Object obj) { //return true = not added to set
		Assignment99Student castedStudent = (Assignment99Student) obj;
		return rno == castedStudent.rno && Objects.equals(name,castedStudent.name) && city == castedStudent.city;
	}
}
