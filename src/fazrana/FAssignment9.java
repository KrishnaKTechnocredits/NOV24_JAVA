package fazrana;

public class FAssignment9 {
	
	void grades(int marks) {
		if (marks>90 && marks<=100) {
			System.out.println("grade of the student is A+ with marks "+marks);
		}else if (marks>80 && marks<=90) {
			System.out.println("grade of the student is A with marks "+marks);
		}else if (marks>70 && marks<=80) {
			System.out.println("grade of the student is B+ with marks "+marks);
		}else if (marks>60 && marks<=70) {
			System.out.println("grade of the student is B with marks "+marks);
		}else if (marks>=50 && marks<=60) {
			System.out.println("grade of the student is C with marks "+marks);
		}else if (marks>0 && marks<50) {
			System.out.println("Work Hard");
		}else {
			System.out.println("Invalid number, please assign a valid number");
		}	
	}
	
	public static void main(String[] args) {
		FAssignment9 fassignmnet9= new FAssignment9();
		fassignmnet9.grades(92);
		fassignmnet9.grades(76);
		fassignmnet9.grades(23);
		fassignmnet9.grades(-19);
		fassignmnet9.grades(102);
	}
}
