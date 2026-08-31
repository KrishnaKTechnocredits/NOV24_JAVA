/*Create a class called Student and return the unique set of students.
Student can have, rno, name, grade, city.
If rno, name and city is same then student will be considered as duplicate.
Hint : override hashcode() and equals() method.*/

package sindhu.hashcode_equals;

import java.util.*;

public class Assignment99 {
	
	public static void main(String[] args) {
		Set<Student99> hs = new HashSet<Student99>();
		
		Student99 e1 = new Student99(101,"sindhu",8.8f, "pune");
		Student99 e2 = new Student99(102,"Pradip",8.9f,"Mumbai");
		Student99 e3 = new Student99(103,"Anuja",9.7f, "Hydrabad");
		Student99 e4 = new Student99(101,"sindhu",7.5f, "pune");
		Student99 e5 = new Student99(103,"Anuja",8.7f, "Hydrabad");
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		
//		System.out.println(e1.hashCode());
//		System.out.println(e2.hashCode());
//		System.out.println(e3.hashCode());
//		System.out.println(e4.hashCode());
//		System.out.println(e5.hashCode());
		
		System.out.println("The sixe of hashset is: "+hs.size());
		System.out.println("The unique set of records: ");
		System.out.println(hs);
		}
		
}
