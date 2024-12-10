package nilam.conditionalStatements;

public class Assignment9_studenResult {
	
	int score;
	
	void studentGrade(int s) {
		score=s;
		if(score>90 && score<=100) {
			System.out.println("A+");
		}else if(score>80 && score<=90){
			System.out.println("A");
		}else if(score>70 && score<=80) {
			System.out.println("B+");
		}else if(score>60 && score>=70) {
			System.out.println("B");
		}else if(score>50 && score>=60) {
			System.out.println("C");
		}else if(score<50 && score>=0) {
			System.out.println("Work harder");
		}else {
			System.out.println("Any other score should be considered as Invalid score.");
		}
	}
	
	public static void main(String[] args) {
		Assignment9_studenResult assignment9_studenresult=new Assignment9_studenResult();
		assignment9_studenresult.studentGrade(92);
		assignment9_studenresult.studentGrade(76);
		assignment9_studenresult.studentGrade(23);
		assignment9_studenresult.studentGrade(-19);
		assignment9_studenresult.studentGrade(110);	
	}

}
