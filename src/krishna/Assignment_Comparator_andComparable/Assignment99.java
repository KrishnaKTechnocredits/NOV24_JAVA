package Assignment_Comparator_andComparable;

import java.util.HashSet;
import java.util.Set;

public class Assignment99 {

	public static void main(String[] args) {
		Set<Student> setOfStudent = new HashSet<Student>();
		setOfStudent.add(new Student("krishna", "biaora", 'a', 1));
		setOfStudent.add(new Student("akansha", "indore", 'b', 2));
		setOfStudent.add(new Student("vishal", "bhopal", 'a', 3));
		setOfStudent.add(new Student("krishna", "biaora", 'c', 1));
		
		System.out.println(setOfStudent);
		System.out.println(setOfStudent.size());
	}
}
