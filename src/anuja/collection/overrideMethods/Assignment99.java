package anuja.collection.overrideMethods;
/*Create a class called Student and return the unique set of students.
Student can have, rno, name, grade, city.
If rno, name and city is same then student will be considered as duplicate. 

Hint : override hashcode() and equals() method.*/
public class Assignment99 {
	
	int rollNo ;
	String name;
	char grade;
	String city;
	
public Assignment99(int rollNo, String name , char grade, String city) {
	this.rollNo = rollNo;
	this.name = name;
	this.grade = grade;
	this.city = city;
}

@Override
public boolean equals(Object obj) {
	Assignment99 e = (Assignment99)(obj);
	return true;
	
}
}
