package anuja.collection.overrideMethods;

import java.util.Objects;

/*Create a class called Student and return the unique set of students.
Student can have, rno, name, grade, city.
If rno, name and city is same then student will be considered as duplicate. 

Hint : override hashcode() and equals() method.*/
public class Assignment99 {

	int rollNo;
	String name;
	char grade;
	String city;

	Assignment99(int rollNo, String name, char grade, String city) {
		this.rollNo = rollNo;
		this.name = name;
		this.grade = grade;
		this.city = city;
	}// constructor

	@Override
	public boolean equals(Object obj) {
		Assignment99 e = (Assignment99) (obj);
		return rollNo == e.rollNo && Objects.equals(name, e.name) && Objects.equals(city, e.city);

	}

	@Override

	public int hashCode() {
		return Objects.hash(rollNo, name, city); // Generate unique hash code
	}

	@Override
	public String toString() {
//		return "rollNo=" + rollNo
//				+ ", name='" + name + '\''
//				+ ", grade=" + grade 
//				+ ", city='" + city + '\'';
		
		 return "Assignment99{" +
         "rollNo=" + rollNo +
         ", name='" + name + '\'' +
         ", grade=" + grade +
         ", city='" + city + '\'' +
         '}';
	}

}