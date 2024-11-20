package narendra;
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

public class Assignment_09_StudentGrade {
	
	void toPrintStudentGrade(int score) { // **using if only statement**
		if(score >90 && score <=100) {
			System.out.println("Result: Scored A+ Grade");
		}
		
		if(score >80 && score <=90) {
			System.out.println("Result: Scored A Grade");
		}
		
		if(score >70 && score <=80) {
			System.out.println("Result: Scored B+ Grade");
		}
		
		if(score >60 && score <=70) {
			System.out.println("Result: Scored B Grade");
		}
		
		if(score >=50 && score <=60) {
			System.out.println("Result: Scored C+ Grade");
		}
		
		if(score >=0 && score <50) {
			System.out.println("Need to work harder");
		}
		
		if(score >100 || score <0){
			System.out.println("Invalid score");
		}
	}

/*	
    void toPrintStudentGrade2(int score) { // **using if and else if statement**
		if(score >90 && score <=100) {
			System.out.println("Result: Scored A+ Grade");
		}
		
		else if(score >80 && score <=90) {
			System.out.println("Result: Scored A Grade");
		}
		
		else if(score >70 && score <=80) {
			System.out.println("Result: Scored B+ Grade");
		}
		
		else if(score >60 && score <=70) {
			System.out.println("Result: Scored B Grade");
		}
		
		else if(score >=50 && score <=60) {
			System.out.println("Result: Scored C+ Grade");
		}
		
		else if(score >=0 && score <50) {
			System.out.println("Need to work harder");
		}
		
		else{
			System.out.println("Invalid score");
		}
	}
*/

	public static void main(String[] args) {
		Assignment_09_StudentGrade studentgrade = new Assignment_09_StudentGrade();
		studentgrade.toPrintStudentGrade(92);
		studentgrade.toPrintStudentGrade(76);
		studentgrade.toPrintStudentGrade(23);
		studentgrade.toPrintStudentGrade(-19);
		studentgrade.toPrintStudentGrade(102);
	}

}