package swapnil;

public class Student {
	
	int rno;
	String name,grade,city;
	
	public Student(int rno,String name,String grade,String city){
		this.rno =rno;
		this.name=name;
		this.grade=grade;
		this.city=city;
	}
	public boolean equals(Object obj) {
		Student s = (Student)obj;
		return this.rno==s.rno && this.name.equals(s.name) && this.city.equals(s.city);
	}
	public String tostring() {
		return rno+" "+name+" "+city;
	}
	public int hashcode() {
		return rno;
	}
}
