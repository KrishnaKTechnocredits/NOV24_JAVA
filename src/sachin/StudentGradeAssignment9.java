package sachin;

public class StudentGradeAssignment9 {
	
	void gradeStudentA (int score){
		
		if(score> 90 && score<=100) {
			
			System.out.println("Student Grade is : A+");
			
		}else if (score>80 && score <=90) {
			
			System.out.println("Student Grade is : A");
			
		}else if (score>70 && score <=80) {
			
			System.out.println("Student Grade is : B+");
			
		}else if (score>60 && score <=70) {
			
			System.out.println("Student Grade is : B");
			
		}else if (score>=50 && score <=60) {
			
			System.out.println("Student Grade is : C");
			
		}else if (score <50 && score >=0 ) {
			
			System.out.println("work harder");
			
		}else {
			
			System.out.println("Invalid Score");
		}}
		
		
	    public static void main(String[] args) {
	    	
	    	StudentGradeAssignment9 studentgrade = new StudentGradeAssignment9();
	    	studentgrade.gradeStudentA(92);
	    	studentgrade.gradeStudentA(76);
	    	studentgrade.gradeStudentA(23);
	    	studentgrade.gradeStudentA(-19);
	    	studentgrade.gradeStudentA(102);
	}

}
