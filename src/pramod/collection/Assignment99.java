/*Assignment - 99 : 1st Feb'2025

Create a class called Student and return the unique set of students.
Student can have, rno, name, grade, city.
If rno, name and city is same then student will be considered as duplicate. 

Hint : override hashcode() and equals() method.
*/

package pramod.collection;

import java.util.*;

public class Assignment99{
	
	public static void main(String[] args) {
			
		Set<Student> hs=new HashSet<Student>();
		hs.add(new Student(1,"Pramod", "A", "Pune"));
		hs.add(new Student(2,"Arnav", "B", "Satara"));
		hs.add(new Student(1,"Pravin", "C", "Sangli"));
		hs.add(new Student(4,"Pramod", "D", "Mumbai"));
		hs.add(new Student(1,"Pramod", "A", "Pune"));    //Duplicate Entry.
		
		System.out.println("Student records which are added in set are: ");
		System.out.println(hs);
		System.out.println("Count of the unique students: "+hs.size());
		
	}
}

