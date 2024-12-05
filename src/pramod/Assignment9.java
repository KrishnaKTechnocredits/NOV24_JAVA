/*Assignment - 9 : 18th Nov'2024 (13 Min)

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

package pramod;

class Assignment9 {
	void printGrade(int marks) {
			if(marks > 90 && marks <= 100){
				System.out.println("Student Grade is: A+");
			}
			else if(marks > 80 && marks <= 90){
				System.out.println("Student Grade is: A");
			}
			else if(marks > 70 && marks <= 80){
				System.out.println("Student Grade is: B+");
			}
			else if(marks > 60 && marks <= 70){
				System.out.println("Student Grade is: B");
			}
			else if(marks >= 50 && marks <= 60){
				System.out.println("Student Grade is: C");
			}
			else if(marks < 50 && marks >= 0){
				System.out.println("Work Harder");
			}else {
				System.out.println("Invalid Score");
			}
	}
	
	public static void main(String[] args){
			Assignment9 grade = new Assignment9();
			grade.printGrade(92);
			grade.printGrade(76);
			grade.printGrade(23);
			grade.printGrade(-19);
			grade.printGrade(102);
	}
}