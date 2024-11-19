package SindhuP;

public class StudentGrade {
	void getStudentGrade(int score){
		if(score>90 && score<= 100){
			System.out.println("Input: "+score);
			System.out.println("Your Grade is A+");
		}else if(score>80 && score<=90){
			System.out.println("Input: "+score);
			System.out.println("Your Grade is A");
		}else if(score>70 && score<=80){
			System.out.println("Input: "+score);
			System.out.println("Your Grade is B+");
		}else if(score>60 && score<=70){
			System.out.println("Input: "+score);
			System.out.println("Your Grade is B");
		}else if(score>=50 && score<=60){
			System.out.println("Input: "+score);
			System.out.println("Your Grade is C");
		}else if(score<50 && score>=0){
			System.out.println("Input: "+score);
			System.out.println("Please Work Harder");
		}else {
			System.out.println("Input: "+score);
			System.out.println("Invalid Score");
		}
	}
	
	public static void main(String[] args){
		StudentGrade studentGrade = new StudentGrade();
		studentGrade.getStudentGrade(92);
		studentGrade.getStudentGrade(76);
		studentGrade.getStudentGrade(23);
		studentGrade.getStudentGrade(-19);
		studentGrade.getStudentGrade(102);
	}
}
