package anuja.collection.overrideMethods;

import java.util.HashSet;
import java.util.Set;

public class ClientAssignment99 {
	public static void main(String[] args) {
		Set<Assignment99> studentData = new HashSet<Assignment99>();
		
		studentData.add(new Assignment99(10, "Anuja", 'A', "Pune"));
		studentData.add(new Assignment99(11, "Rahul", 'B', "Mumbai"));
		studentData.add(new Assignment99(10, "Anuja", 'A', "Pune")); // Duplicate rollNo & name
		studentData.add(new Assignment99(12, "Sneha", 'A', "Pune"));
		studentData.add(new Assignment99(13, "Anuja", 'A', "Bangalore")); // Duplicate name, different city
		studentData.add(new Assignment99(14, "Ravi", 'B', "Mumbai")); // Duplicate grade & city
		
		System.out.println("Input Student data is: " +studentData +"\n");
		System.out.println("Size of data is: " +studentData.size());

	}

}
