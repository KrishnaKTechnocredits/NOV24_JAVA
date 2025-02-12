package prem;

import java.util.HashSet;
import java.util.Set;

public class Assignment99 {
	
	public static void main(String[] args) {
		Set<Student>  hs=new HashSet<Student>();
		hs.add(new Student(13, "PremLata", "Pune", 'C'));
		hs.add(new Student(42, "Avi", "Mumbai", 'B'));			
		hs.add(new Student(23, "Meenu", "Pune", 'A'));
		hs.add(new Student(15, "Avi", "Mumbai", 'B'));
		hs.add(new Student(13, "PremLata", "Pune", 'C'));
		System.out.println(hs);
		System.out.println("Size of set is : "+ hs.size());
	}	

}
