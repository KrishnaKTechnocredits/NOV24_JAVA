package rushikeshK;

public class Assignment_9 {
	
	double totalMarks=100.00;
	
	void resultOfStudent(float score) {
		
		if(score>90 && score<=100) {
			System.out.println("A+ grade-");
			System.out.println("Student total score "+score+" out of "+totalMarks);
			System.out.println();
		}
		else if(score>=80 && score<=90) {
			System.out.println("A grade-");
			System.out.println("Student total score "+score+" out of "+totalMarks);
			System.out.println();
		}
		else if(score>70 && score<=80) {
			System.out.println("B+ grade-");
			System.out.println("Student total score "+score+"% out of "+totalMarks+"%");
			System.out.println();
		}
		else if(score>60 && score<=70) {
			System.out.println("B grade-");
			System.out.println("Student total score "+score+"% out of "+totalMarks+"%");
			System.out.println();
		}
		else if(score>50 && score<=60) {
			System.out.println("C grade-");
			System.out.println("Student total score "+score+"% out of "+totalMarks+"%");
			System.out.println();
		}
		else if(score<50) {
			System.out.println("Fail-");
			System.out.println("Student total score "+score+"% out of "+totalMarks+"%");
			System.out.println("Need to work hard");
			System.out.println();
		}
		else {
			System.out.println("Invalid score");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_9 result=new Assignment_9();
		result.resultOfStudent(92.32f);
		result.resultOfStudent(76.23f);
		result.resultOfStudent(23.02f);
		result.resultOfStudent(19.10f);
		result.resultOfStudent(102);
	}

}
