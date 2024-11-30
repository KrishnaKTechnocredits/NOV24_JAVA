/*
 * Assignment - 9 : 18th Nov'2024

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

package amruta;


public class Assignment_9 {
	
	void studentReport(int score) {
		if(score >90 && score <=100){
			System.out.println("You Received " +score+ " marks & Your grade is A+ ");
		}else if(score >80 && score <=90){
			System.out.println("You Received " +score+ " marks & Your grade is A");
		}else if(score >70 && score <=80){
			System.out.println("You Received " +score+ " marks & Your grade is B+");	
		}else if(score >60 && score <=70){
			System.out.println("You Received " +score+ " marks & Your grade is B");
		}else if(score >=50 && score <=60){
			System.out.println("You Received " +score+ " marks & Your grade is C");	
		}else if(score <50 && score >=0){
			System.out.println("Need to Work Hard Your score is "+score );
		}else{
			System.out.println(score+" is Invalid Score");
		}
	}
	
	public static void main(String[] args) {
		Assignment_9 a9 = new Assignment_9();
		a9.studentReport(92);
		a9.studentReport(76);
		a9.studentReport(23);
		a9.studentReport(-19);
		a9.studentReport(102);
	}
}

