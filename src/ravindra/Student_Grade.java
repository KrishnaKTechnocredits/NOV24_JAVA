//Assignment 9
package ravindra;

public class Student_Grade {
	public void studentGrade(int score) {
		if(score>90 && score<=100) {
			System.out.println("Grade is A+");
		}
		if(score>80 && score<=90) {
			System.out.println("Grade is A");
		}
		if(score>70 && score<=80) {
			System.out.println("Grade is B+");
		}
		if(score>60 && score<=70) {
			System.out.println("Grade is B");
		}
		if(score>50 && score<=60) {
			System.out.println("Grade is C");
		}
		if(score<50 && score>=0) {
			System.out.println("work harder");
		}
		if(score>100){
			System.out.println("Invalid score");
		}
		if(score<0){
			System.out.println("Invalid score");
		}
	}	
	
	public static void main(String []args){
		Student_Grade student_Grade=new Student_Grade();
		student_Grade.studentGrade(92);
		student_Grade.studentGrade(76);
		student_Grade.studentGrade(23);
		student_Grade.studentGrade(-19);
		student_Grade.studentGrade(102);
	}
}
