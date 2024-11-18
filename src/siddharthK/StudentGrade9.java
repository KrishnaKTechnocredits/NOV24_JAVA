package siddharthK;
// Assignment 9
public class StudentGrade9 {
	
	void displayScore(int score) {
		if(score > 90 && score <= 100) {
			System.out.println("Input: "+score);
			System.out.println("Output: A+");
		}else if(score > 80 && score <= 90){
			System.out.println("Input: "+score);
			System.out.println("Output: A");
		}else if(score > 70 && score <= 80){
			System.out.println("Input: "+score);
			System.out.println("Output: B+");
		}else if(score > 60 && score <= 70){
			System.out.println("Input: "+score);
			System.out.println("Output: B");
		}else if(score > 50 && score <= 60){
			System.out.println("Input: "+score);
			System.out.println("Output: C");
		}else if(score > 0 && score <= 50){
			System.out.println("Input: "+score);
			System.out.println("Output: Work Harder");
		}else{
			System.out.println("Input: "+score);
			System.out.println("Output: Invalid Score");
		}
	}
	
	public static void main(String[] args) {
		StudentGrade9 studentGrade9 = new StudentGrade9();
		studentGrade9.displayScore(92);
		studentGrade9.displayScore(76);
		studentGrade9.displayScore(23);
		studentGrade9.displayScore(-19);
		studentGrade9.displayScore(102);
	}
}
