/*
 Assignment - 99 : 1st Feb'2025

Create a class called Student and return the unique set of students.
Student can have, rno, name, grade, city.
If rno, name and city is same then student will be considered as duplicate. 

Hint : override hashcode() and equals() method.
 */
package imran.CollectionFramework.equalsAndHashCodeMethod;

import java.util.HashSet;
import java.util.Set;

public class Assignment99_UniqueSetofStudent {

	void getdata()
	{
		Set<Student> studentlist = new HashSet<Student>();
		studentlist.add(new Student(1,"Imran","A++","Satna"));
		studentlist.add(new Student(2,"Husnain","A++","Satna"));
		studentlist.add(new Student(3,"Aadil","A+","Maihar"));
		studentlist.add(new Student(4,"Qamar","B++","Rewa"));
		boolean info =studentlist.add(new Student(1,"Imran","A++","Satna")); // duplicate data not added
		studentlist.add(new Student(5,"Qutub","A+","Satna"));
		studentlist.add(new Student(1,"Imran","A++","Satna"));//duplicate
		studentlist.add(new Student(5,"Qutub","A+","Satna")); // duplicate
		
		System.out.println(studentlist);
		System.out.println(info);
		
	}
	public static void main(String[] args) {
		Assignment99_UniqueSetofStudent  assignment99_1 = new Assignment99_UniqueSetofStudent ();
		assignment99_1.getdata();
	}
}
