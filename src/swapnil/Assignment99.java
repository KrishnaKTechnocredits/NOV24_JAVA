package swapnil;

import java.util.HashSet;
import java.util.Set;

public class Assignment99 {

	public static void main(String[] args) {
		Set<Student> s = new HashSet<Student>();
		Student s1 = new Student(1,"Swapnil","A","Pune");
		Student s2 = new Student(2,"shakti","AA","Patas");
		Student s3 = new Student(3,"sonu","B","akluj");
		Student s4 = new Student(4,"preesha","C","Solapur");
		Student s5 = new Student(1,"Swapnil","A","Pune");
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		System.out.println(s1.hashcode());
		System.out.println(s2.hashcode());
		System.out.println(s3.hashcode());
		System.out.println(s4.hashcode());
		System.out.println(s5.hashcode());
		
		
		System.out.println(s.size());
	}
}
