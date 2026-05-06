/*
 Assignment - 99 : 1st Feb'2025

Create a class called Student and return the unique set of students.
Student can have, rno, name, grade, city.
If rno, name and city is same then student will be considered as duplicate. 

Hint : override hashcode() and equals() method.
 */
package imran.CollectionFramework.equalsAndHashCodeMethod;

public class Student {

	int rno;
	String name, city, grade;
	public Student(int rno, String name, String grade, String city) {
		super();
		this.rno = rno;
		this.name = name;
		this.city = city;
		this.grade = grade;
	}
	
	public boolean equals(Object obj)
	{
		Student stu = (Student) obj;
		return this.rno == stu.rno && this.name.equals(stu.name) && this.city.equals(stu.city) ;
	}
		
	public int hashCode()
	{
		return rno;
	}
	
	public String toString()
	{
		return "roll no is: " + rno + " Name is : " + this.name + " City is : " + this.city + " Grade is : " + this.grade + "\n";
	}
}
	

