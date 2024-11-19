package ashwiniB;

public class StudentGrade {
	int marks;
	void StudentGrade(int marks) {
		 if (marks < 0 || marks > 100) {
	            System.out.println("Invalid score");
	        } else if (marks > 90) {
	            System.out.println("A+");
	        } else if (marks > 80) {
	            System.out.println("A");
	        } else if (marks > 70) {
	            System.out.println("B+");
	        } else if (marks > 60) {
	            System.out.println("B");
	        } else if (marks >= 50) {
	            System.out.println("C");
	        } else {
	            System.out.println("work harder");
	        }
	}

	public static void main(String[] args) {
		StudentGrade studentGrade =new StudentGrade();
		studentGrade.StudentGrade(92);
		studentGrade.StudentGrade(76);
		studentGrade.StudentGrade(23);
		studentGrade.StudentGrade(19);
		studentGrade.StudentGrade(102);
	}
}
