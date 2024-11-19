/*Assignment - 9 : 18th Nov'2024

Print student grade based on obtain score.

If score is between 90 (excluding) to 100 (including) -> "A+"
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

package anuja;

public class Assignment9 {
	
	public void displayGrade(int score) {
		System.out.println("-------------------------- ");
		
		if(score>90 && score<=100) {
			System.out.println("Congratulations you are having grade A+");// if score is 100 or between 90
		}
		else if (score>80 && score<=90) {
			System.out.println("Congratulations you are having grade A");// if score is 90 or between 80 to 90
		}
		else if (score>70 && score<=80) {
			System.out.println("Congratulations you are having grade B+");// if score is 80 or between 80 to 90
		}
		else if (score>60 && score<=70) {
			System.out.println("Congratulations you are having grade B");// if score is 80 or between 70 to 80
		}
		else if (score>=50 && score<=60) {
			System.out.println("Congratulations you are having grade C+");// if score is 70 or between 60 to 70
		}
		else if (score<50 && score>=0) {
			System.out.println("Work hard next time for better score");// if score is 50 or between 50 to 0
		}
		else {
			System.out.println("Please enter a valid score");
		}
	}
	
	public static void main (String[] args){
		Assignment9 assignment9 = new Assignment9();
		assignment9.displayGrade(92);
		assignment9.displayGrade(76);
		assignment9.displayGrade(23);
		assignment9.displayGrade(-19);
		assignment9.displayGrade(102);
		
	}
	
}
