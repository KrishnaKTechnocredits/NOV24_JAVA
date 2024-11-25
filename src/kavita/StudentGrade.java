package kavita;

public class StudentGrade {
	
	void studentgrades(int score) {
		if (score>90 && score<=100) {
			System.out.println("A+");
		}else if(score>80 && score<=90) {
			System.out.println("A");
		}else if(score>70 && score<=80) {
			System.out.println("B+");
		}else if(score>60 && score<=70) {
			System.out.println("B");
		}else if(score>50 && score<=60) {
			System.out.println("C");
		}else if(score<50 && score>=0) {
			System.out.println("Work Harder");
		}else{
			System.out.println("Invalid score");
		}
		
}
	public static void main(String[] args) {
		StudentGrade studentGrade=new StudentGrade();
		studentGrade.studentgrades(92);
		studentGrade.studentgrades(76);
		studentGrade.studentgrades(23);
		studentGrade.studentgrades(-19);
		studentGrade.studentgrades(102);
		
	}
}	
