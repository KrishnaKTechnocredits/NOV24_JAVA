/*
Assignment - 9 : 18th Nov'2024

Print student grade based on obtain score.

If score is between 90 (excluding) to 100 (including) -> "A+"
If score is between 80 (excluding) to 90 (including) -> "A"
If score is between 70 (excluding) to 80 (including) -> "B+"
If score is between 60 (excluding) to 70 (including) -> "B"
If score is between 50 (including) to 60 (including) -> "C"
If score is between 50 (excluding) to 0 (including) -> "work harder"
Any other score should be considered as Invalid score.
*/
package ajay;

public class Assignment9 {
	
	void grade(int score) {
		
		if(score>90 && score<=100){
			System.out.println("Grade is A+");
		}else if(score>80 && score<=90) {
			System.out.println("Grade is A");
		}else if(score>70 && score<=80) {
			System.out.println("Grade is B+");
		}else if(score>60 && score<=70) {
			System.out.println("Grade is B");
		}else if(score>=50 && score<=60) {
			System.out.println("Grade is C");
		}else if(score<50 && score>=0) {
			System.out.println("Your Score is " +score +" you need to Work Harder");
		}else {
			System.out.println("Invalid Score");
		}
		
	}
	public static void main(String[] args) {
		Assignment9 assignment9=new Assignment9();
		assignment9.grade(7);
	}
}
