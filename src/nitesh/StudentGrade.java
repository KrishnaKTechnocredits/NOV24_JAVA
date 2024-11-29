package nitesh;

public class StudentGrade {
	int marks;
 
	void grade(int score) {
		this.marks = score;
		if(marks <=100 && marks >90) {
			System.out.println("Student grade is A+");
		}else if(marks <=90 && marks>80) {
			System.out.println("Student grade is A");
		}else if(marks <=80 && marks>70) {
			System.out.println("Student grade is B+");
		}else if(marks <=70 && marks>60) {
			System.out.println("Student grade is B");
		}else if(marks <=60 && marks>50) {
			System.out.println("Student grade is C");
		}else if(marks <=50 && marks>0) {
			System.out.println("work hard");
		}else {
			System.out.println("Invalid Score");
		}
	}
	public static void main(String[] args) {
		StudentGrade studentgrade = new StudentGrade();
		studentgrade.grade(92);
		studentgrade.grade(76);
		studentgrade.grade(23);
		studentgrade.grade(-19);
		studentgrade.grade(102);
	}

}
