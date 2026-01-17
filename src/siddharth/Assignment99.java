package siddharth;

import java.util.HashSet;
import java.util.Set;

/*
Assignment - 99 : 1st Feb'2025

Create a class called Student and return the unique set of students.
Student can have, rno, name, grade, city.
If rno, name and city is same then student will be considered as duplicate. 

Hint : override hashcode() and equals() method.
 */
public class Assignment99 {

	public static void main(String[] args) {
		
		Set<Assignment99Student> StudentData = new HashSet<Assignment99Student>();
		StudentData.add(new Assignment99Student(1,"Sid",'F',"Pune"));
		StudentData.add(new Assignment99Student(2,"Prajakta",'A',"Nashik"));
		StudentData.add(new Assignment99Student(3,"Aarti",'B',"Nagpur"));
		StudentData.add(new Assignment99Student(4,"Ashutosh",'C',"Kolhapur"));
		StudentData.add(new Assignment99Student(5,"Allwyn",'D',"Thane"));
		StudentData.add(new Assignment99Student(6,"Kiran",'E',"Solapur"));
		StudentData.add(new Assignment99Student(1,"Sid",'A',"Pune")); // Duplicate, hash collision handled by equals method
		
		System.out.println(StudentData);
		System.out.println("Size of Set is :"+StudentData.size());
	}

}