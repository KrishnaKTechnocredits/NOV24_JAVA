/* rno, name, grade, city
 * If rno, name and city is same then student will be considered as duplicate.*/

package sindhu.hashcode_equals;

public class Student99 {
	int rno;
	float grade;
	String name, city;
	
	Student99(int rno, String name, float grade, String city){
		this.rno = rno;
		this.name = name;
		this.grade = grade;
		this.city = city;
	}
	
	public boolean equals(Object ob){
		Student99 e = (Student99) ob;
		return this.rno == e.rno && this.name.equals(e.name) && this.city.equals(e.city);
	}
	
	public int hashCode() {
		return rno;
	}
	
	public String toString() {
        return "{" +
                "rno=" + rno +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", city='" + city + '\'' +
                '}';
	}   
}
