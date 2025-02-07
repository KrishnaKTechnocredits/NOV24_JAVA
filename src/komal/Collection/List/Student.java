//Assignment - 99 : 1st Feb'2025
//
//Create a class called Student and return the unique set of students.
//Student can have, rno, name, grade, city.
//If rno, name and city is same then student will be considered as duplicate. 
//
//Hint : override hashcode() and equals() method.

package komal.Collection.List;

import java.util.HashSet;
import java.util.Set;

public class Student {
	int rollno;
	String name, city;
	char grade;

	Student(int id, String name, String city, char grade) {
		this.rollno = id;
		this.name = name;
		this.city = city;
		this.grade = grade;
	}

	@Override
	public int hashCode() {
		return this.rollno;
	}

	public boolean equals(Object obj) {
		Student s = (Student) obj;
		return this.rollno == s.rollno && this.name == s.name && this.grade == s.grade;

	}

	static void getData() {
		Set<Student> set = new HashSet<>();
		set.add(new Student(1, "Komal", "Pune", 'A'));
		set.add(new Student(2, "Shubham", "Gujrat", 'A'));
		set.add(new Student(3, "Vishal", "Nashik", 'A'));
		set.add(new Student(4, "Adishree", "Mumbai", 'A'));
		set.add(new Student(2, "Shubham", "Gujrat", 'A'));
		set.add(new Student(4, "Adishree", "Mumbai", 'A'));
//		System.out.println(set.size());
		// Displaying the set
		System.out.println("Student unique list is : ");
		for (Student s : set) {
			System.out.println(s.name + " " + s.city + " " + s.grade);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getData();
	}

}
