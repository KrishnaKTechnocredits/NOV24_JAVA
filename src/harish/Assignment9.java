/**
 * 
 */
package harish;

/**
 * Assignment - 9 : 18th Nov'2024
 * 
 * Print student grade based on obtain score.
 * 
 * If score is between 90 (excluding) to 100 (including) -> "A+"
 * 
 * If score is between 80 (excluding) to 90 (including) -> "A"
 * 
 * If score is between 70 (excluding) to 80 (including) -> "B+"
 * 
 * If score is between 60 (excluding) to 70 (including) -> "B"
 * 
 * If score is between 50 (including) to 60 (including) -> "C"
 * 
 * If score is between 50 (excluding) to 0 (including) -> "work harder"
 * 
 * Any other score should be considered as Invalid score.
 */
public class Assignment9 {

	/* Method which prints student's grades based on the score obtained */
	private void studentGrade(int marks) {
		if (marks > 90 && marks <= 100) {
			System.out.println("A+");
		} else if (marks > 80 && marks <= 90) {
			System.out.println("A");
		} else if (marks > 70 && marks <= 80) {
			System.out.println("B+");
		} else if (marks > 60 && marks <= 70) {
			System.out.println("B");
		} else if (marks >= 50 && marks <= 60) {
			System.out.println("C");
		} else if (marks < 50 && marks >= 0) {
			System.out.println("Work Harder...");
		} else {
			System.out.println("Invalid Score!");
		}
	}

	public static void main(String[] args) {
		Assignment9 assignment9 = new Assignment9();
		assignment9.studentGrade(92);
		assignment9.studentGrade(76);
		assignment9.studentGrade(23);
		assignment9.studentGrade(-19);
		assignment9.studentGrade(102);
		assignment9.studentGrade(65);
	}
}