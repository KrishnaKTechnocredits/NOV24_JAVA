package harish.collections;

import java.util.HashSet;
import java.util.Set;

public class Assignment99 {

	public static void main(String[] args) {

		Set<A99_Student> students = new HashSet<>();

		students.add(new A99_Student(1, "Amit", 'A', "Mumbai"));
		students.add(new A99_Student(2, "Priya", 'B', "Delhi"));
		students.add(new A99_Student(1, "Amit", 'C', "Mumbai")); // Duplicate (same rno, name, city)
		students.add(new A99_Student(3, "Rahul", 'A', "Bangalore"));
		students.add(new A99_Student(4, "Sneha", 'A', "Chennai"));
		students.add(new A99_Student(1, "Amit", 'A', "Mumbai")); // Duplicate

		System.out.println("Unique Students:");
		for (A99_Student student : students) {
			System.out.println(student);
		}
	}
}