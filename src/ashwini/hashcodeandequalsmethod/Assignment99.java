package ashwini.hashcodeandequalsmethod;

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
	Set<Student>  hs=new HashSet<Student>();
	hs.add(new Student(1, "Ashwini", "Pune", 'C'));
	hs.add(new Student(2, "Sachin", "Mumbai", 'B'));
	hs.add(new Student(3, "Mrunmayee", "Pune", 'A'));
	hs.add(new Student(4, "Harshali", "Baner", 'D'));
	hs.add(new Student(1, "Ashwini", "Pune", 'C'));
	System.out.println(hs);
	System.out.println("Size of set is : "+ hs.size());
}
}
