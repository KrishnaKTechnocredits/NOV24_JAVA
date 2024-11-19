package swapnil;

public class Assignment9 {
	int score;

	void examScore(int score) {
	if (score>90 && score<=100) {
		System.out.println("Your grade is " +"A+");
	}
	else if (score>80 && score<=90){
		System.out.println("Your grade is " +"A");
	}
	else if (score>70 && score<=80) {
		System.out.println("Your grade is " +"B+");
	}
	else if (score>60 && score<=70) {
		System.out.println("B");
	}
	else if (score>=50 && score<=60) {
		System.out.println("C");
	}
	else if (score<50 && score>=0) {
		System.out.println("work harder");
	}
	else {
		System.out.println("Invalid score");	
		}
		
	}

	public static void main(String[] args) {
		Assignment9 assignment9 = new Assignment9();
		assignment9.examScore(92);
		assignment9.examScore(76);
		assignment9.examScore(23);
		assignment9.examScore(-19);
		assignment9.examScore(102);
		
	}
}








/*If score is between 90 (excluding) to 100 (including) -> "A+"
If score is between 80 (excluding) to 90 (including) -> "A"
If score is between 70 (excluding) to 80 (including) -> "B+"
If score is between 60 (excluding) to 70 (including) -> "B"
If score is between 50 (including) to 60 (including) -> "C"
If score is between 50 (excluding) to 0 (including) -> "work harder"
Any other score should be considered as Invalid score.

input : 92
output : A+

input : 76
output : B+

input : 23
output : work harder

input : -19
output : Invalid score

input : 102
output : Invalid score

*/