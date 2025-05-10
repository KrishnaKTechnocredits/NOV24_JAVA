/*
 * Assignment - 99 : 1st Feb'2025
 * 
 * Create a class called Student and return the unique set of students. Student
 * can have, rno, name, grade, city. If rno, name and city is same then student
 * will be considered as duplicate.
 * 
 * Hint : override hashcode() and equals() method.
 */

package amruta.CollectionPrograms;

public class Assign_99_StudentClass {
	int rollNumber;
	String name;
	char grade;
	String city;

	public Assign_99_StudentClass(int rollNumber, String name, char grade, String city) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.city = city;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public String getName() {
		return name;
	}

	public char getGrade() {
		return grade;
	}

	public String getCity() {
		return city;
	}
	
	@Override
	public String toString() {
		return "Student Details : \n [rollNumber = " + rollNumber + ", name = " + name + ", grade = " + grade + ", city = "
				+ city + "]";
	}
	
	public int hashcode() {
		return rollNumber;
	}

	public boolean equals(Object obj) {
		Assign_99_StudentClass s = (Assign_99_StudentClass)obj;
		return this.rollNumber==s.rollNumber && this.name.equals(s.name) && this.grade ==s.grade && this.city.equals(s.city);
	}
}