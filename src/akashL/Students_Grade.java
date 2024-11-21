package akashL;

public class Students_Grade {
	
	void score(int grade) {
		if (grade<=100 && grade>=90) {
			System.out.println("students grade is A+: "+ grade+ "%");
		
		}else if (grade<=90 && grade>=80) {
			System.out.println("students grade is A: "+ grade+ "%");
	
		}else if (grade<=80 && grade>=70) {
			System.out.println("students grade is B+: "+ grade+ "%");
		
		}else if (grade<=70 && grade>=60) {
			System.out.println("students grade is B: "+ grade+ "%");
		
		}else if (grade<=60 && grade>=50) {
			System.out.println("students grade is C: "+ grade+ "%");
		
		}else if (grade<=50 && grade>=35) {
			System.out.println("Work harder: "+ grade+ "%");
			
		}else{
			System.out.println("invalid score");
		}
}
		public static void main(String[] args) {
			Students_Grade students_Grade=new Students_Grade();
			students_Grade.score(98);
			students_Grade.score(88);
			students_Grade.score(75);
			students_Grade.score(68);
			students_Grade.score(58);
			students_Grade.score(38);
		}
	
}
