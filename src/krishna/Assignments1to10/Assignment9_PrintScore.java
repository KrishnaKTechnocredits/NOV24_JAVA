package Assignments1to10;

import java.util.Scanner;

public class Assignment9_PrintScore {
	
	void printStudentGrades(int marks) {
		
		if(marks >=90 && marks<= 100) {
			System.out.println("student grades are A+");
			return;
		} else if(marks >=80 && marks<= 90) {
			System.out.println("student grades are A");
			return;
		}else if(marks >=70 && marks<= 80) {
			System.out.println("student grades are B+");
			return;
		}else if(marks >=60 && marks<= 70) {
			System.out.println("student grades are B");
			return;
		}else if(marks >=50 && marks<= 60) {
			System.out.println("student grades are C");
			return;
		}else if(marks >0 && marks<= 50) {
			System.out.println("Work Hard");
			return;
		}else if(marks >100 || marks >=0) {
			System.out.println("invaild input");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter student marks");
		int studentMarks = sc.nextInt();
		
		new Assignment9_PrintScore().printStudentGrades(studentMarks);
	}
}
