class GradingStudent{
	int score;
	
	void updateGrade(int score){
		if(score>90 && score<=100){
		 System.out.println("A+");
		}
		else if(score>80 && score<=90){
		 System.out.println("A");
		}
		else if(score>70 && score<=80){
		 System.out.println("B+");
		}
		else if(score>60 && score<=70){
		 System.out.println("B");
		}
		else if(score>50 && score<=60){
		 System.out.println("C");
		}
		else if(score>=0 && score<50){
		 System.out.println("work harder");
		}
		else {
		 System.out.println("Invalid score");
		}
	}
		
	public static void main(String[] args){
		GradingStudent gradingStudent = new GradingStudent();
		gradingStudent.updateGrade(92);
		gradingStudent.updateGrade(76);
		gradingStudent.updateGrade(23);
		gradingStudent.updateGrade(-19);
		gradingStudent.updateGrade(102);
	}
}