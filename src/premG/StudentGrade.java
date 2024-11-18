package PremG;

public class StudentGrade {

	void studentScore( int score) {
		if(score> 90 && score <= 100) {
			System.out.println("Grade is A+");
		}else if(score> 80 && score <= 90) {
			System.out.println("Grade is A");
		}else if(score> 70 && score <= 80) {
			System.out.println("Grade is B+");	
		}else if(score> 60 && score <= 70) {
			System.out.println("Grade is B");	
		}else if(score>= 50 && score <= 60) {
			System.out.println("Grade is C");	
		}else if(score< 50 && score >= 0) {
			System.out.println("You need to work hard");	
		}else {	
			System.out.println("Invalid Score, Please check");
		}	
	}
		public static void main(String[] args){
			StudentGrade studentGrade = new StudentGrade();
			studentGrade.studentScore(92);
			studentGrade.studentScore(76);
			studentGrade.studentScore(23);
			studentGrade.studentScore(-19);
			studentGrade.studentScore(102);
					
		}
		

}
