package deepali.basicDemo;

public class Assignment_9 {
	
	void scoreRange(int score) {
		if(score > 90 && score <= 100) {
			System.out.println("Student grade is : A+");
		}else if(score > 80 && score <= 90) {
			System.out.println("Student grade is : A");
		}else if(score > 70 && score <= 80) {
			System.out.println("Student grade is : B+");
		}else if(score > 60 && score <= 70) {
			System.out.println("Student grade is : B");
		}else if(score >= 50 && score <= 60) {
			System.out.println("Student grade is : C");
		}else if(score < 50 && score >= 0) {
			System.out.println("Work harder");
		}else {
			System.out.println("Invalid score");
		}
	}
	
	public static void main(String[] args) {
		Assignment_9 assignment = new Assignment_9();
		assignment.scoreRange(92);
		assignment.scoreRange(76);
		assignment.scoreRange(23);
		assignment.scoreRange(-19);
		assignment.scoreRange(102);
	}

}
