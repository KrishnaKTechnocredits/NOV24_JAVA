package roshan.Equals_HashCode;

import java.util.*;

public class Teacher {
	static Set<Student> getstudentlist() {
		Set<Student> studentList = new LinkedHashSet<>();
		studentList.add(new Student(11, "roshan", "a", "nagpur"));
		studentList.add(new Student(12, "esha", "b", "pune"));
		studentList.add(new Student(13, "nova", "c", "vijaynaar"));
		studentList.add(new Student(11, "roshan", "b", "nagpur"));
		studentList.add(new Student(13, "nova", "c", "ddd"));
		return studentList;

	}

	public static void main(String[] args) {
		System.out.println(getstudentlist());
	}
}
