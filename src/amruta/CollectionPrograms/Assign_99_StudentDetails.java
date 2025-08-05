package amruta.CollectionPrograms;

import java.util.HashSet;
import java.util.Set;

public class Assign_99_StudentDetails {
	
	public static void main(String[] args) {
		Set<Assign_99_StudentClass> students = new HashSet<>();
		
		students.add(new Assign_99_StudentClass(1, "Amit", 'A', "Mumbai"));
		students.add(new Assign_99_StudentClass(2, "Priya", 'B', "Delhi"));
		students.add(new Assign_99_StudentClass(1, "Amit", 'C', "Mumbai")); // Duplicate (same rno, name, city)
		students.add(new Assign_99_StudentClass(3, "Rahul", 'A', "Bangalore"));
		students.add(new Assign_99_StudentClass(4, "Sneha", 'A', "Chennai"));
		students.add(new Assign_99_StudentClass(1, "Amit", 'A', "Mumbai")); // Duplicate

		System.out.println("Unique Students:" + students);

		
	}
}