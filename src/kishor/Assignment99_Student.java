package kishor;

public class Assignment99_Student {
	
	String name;
	int rollNo;
	char grade;
	String city;
	
	Assignment99_Student(String name, int rollNo, char grade, String city){
		this.name=name;
		this.rollNo=rollNo;
		this.grade=grade;
		this.city=city;
	}
	
	public boolean equals(Object obj) {
		Assignment99_Student s = (Assignment99_Student)obj;
		return this.name.equals(s.name) && this.rollNo==s.rollNo && this.city.equals(s.city);
	}
	
	public int hashCode() {
		return rollNo;
	}
	
	public String toString() {
		return "Name:- "+name+ " Roll No:- "+rollNo + " City:- "+city;
	}
}
