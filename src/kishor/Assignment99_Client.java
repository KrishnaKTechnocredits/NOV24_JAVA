package kishor;

//Create a class called Student and return the unique set of students.
//Student can have, rno, name, grade, city.
//If rno, name and city is same then student will be considered as duplicate.

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment99_Client {
	
	
	public static void main(String[] args) {
		Set<Assignment99_Student> set = new LinkedHashSet<Assignment99_Student>();
		
		set.add(new Assignment99_Student("kishor",123,'A',"Pune"));
		set.add(new Assignment99_Student("aman",124,'B',"Mumbai"));
		set.add(new Assignment99_Student("syam",1235,'C',"Ngp"));
		set.add(new Assignment99_Student("kishor",123,'A',"Pune"));
		
		System.out.println(set.size());
		
		System.out.println(set);
		
	}
}
