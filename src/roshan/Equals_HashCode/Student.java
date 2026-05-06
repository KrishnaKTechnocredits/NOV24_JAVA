package roshan.Equals_HashCode;

public class Student {
	int rno;
	String name, grade, city;

	Student(int rno, String name, String grade, String city) {
		this.rno = rno;
		this.name = name;
		this.grade = grade;
		this.city = city;
		
	}
	@Override
	public String toString  () { // mistake made in writing it should be same and return not given
		 return  "rno =" + rno + ",name = " + name + ",grade= " + grade + ",city=" + city ;
	}
	@Override
	public int hashCode() {            //mistake made in writing hashCode(case sensitive)
		return rno;
	}
	@Override
		public boolean equals(Object obj) {  //object o should be capital
		Student s = (Student)obj;
		return this.rno == s.rno && this.name==s.name && this.city == s.city;
	}
}

/*
 * Assignment - 99 : 1st Feb'2025 Create a class called Student and return the
 * unique set of students. Student can have, rno, name, grade, city. If rno,
 * name and city is same then student will be considered as duplicate. Hint :
 * override hashcode() and equals() method.
 */