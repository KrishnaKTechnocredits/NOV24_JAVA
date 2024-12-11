//Assignment - 9 : 18th Nov'2024
//
//Print student grade based on obtain score.
//
//If score is between 90 (excluding) to 100 (including) -> "A+"
//If score is between 80 (excluding) to 90 (including) -> "A"
//If score is between 70 (excluding) to 80 (including) -> "B+"
//If score is between 60 (excluding) to 70 (including) -> "B"
//If score is between 50 (including) to 60 (including) -> "C"
//If score is between 50 (excluding) to 0 (including) -> "work harder"
//Any other score should be considered as Invalid score.
//
//input : 92
//output : A+
//
//input : 76
//output : B+
//
//input : 23
//output : work harder
//
//input : -19
//output : Invalid score
//
//input : 102
//output : Invalid score

//If-else ladder

package ritik;

public class Assignment9 {
	
	void m1(int x) {
		if(x >90 && x<=100) {
			System.out.println("A+");
		}else if(x>80 && x<=90) {
			System.out.println("A");
		}else if(x>70 && x<=80) {
			System.out.println("B+");
		}else if(x>60 && x<=70) {
			System.out.println("B");
		}else if(x>50 && x<=60) {
			System.out.println("C");
		}else if(x>=0 && x<50) {
			System.out.println("Work harder");
		}else {
			System.out.println("Invalid Score");
		}
		
	}
	
	public static void main(String[] args) {
		Assignment9 assignment9 = new Assignment9();
		assignment9.m1(92);
		assignment9.m1(76);
		assignment9.m1(23);
		assignment9.m1(102);
	}
}
