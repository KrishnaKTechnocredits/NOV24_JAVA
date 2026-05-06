//Assignment - 99 : 1st Feb'2025
//
//Create a class called Student and return the unique set of students.
//Student can have, rno, name, grade, city.
//If rno, name and city is same then student will be considered as duplicate. 
//
//Hint : override hashcode() and equals() method.

package fazrana.map;

import java.util.*;

public class FAssignment99 {
	static Set<Student> getStudentSet() {
		Set<Student> set=new LinkedHashSet<Student>();
		set.add(new Student("name1","city1",5,1));
		set.add(new Student("name2","city2",5,1));
		set.add(new Student("name3","city3",3,3));
		set.add(new Student("name4","city4",4,4));
		set.add(new Student("name1","city1",5,5));
		
		return set;
	}
	
	public static void main(String[] args) {
		System.out.println(getStudentSet());
	}
	
}
