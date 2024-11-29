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
package pooja.ifelse;

public class Assignment_9 {
	void grade(int num) {
		if (num > 90 && num <= 100) {
			System.out.println("A+");
		} else if (num > 80 && num <= 90) {
			System.out.println("A");
		} else if (num > 70 && num <= 80) {
			System.out.println("B+");
		} else if (num > 60 && num <=70) {
			System.out.println("B");
		}else if(num >= 50 && num <=60) {
			System.out.println("C");
		}else if(num >=0 && num < 50) {
			System.out.println("Work Harder !!");
		}else {
			System.out.println("Invalid score !!");
		}		
	}

	public static void main(String[] args) {		
		Assignment_9 assignment_9 = new Assignment_9();
		assignment_9.grade(92);
		assignment_9.grade(76);
		assignment_9.grade(23);
		assignment_9.grade(-19);
		assignment_9.grade(102);		
	}
}