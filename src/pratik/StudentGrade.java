package pratik;

public class StudentGrade {
	int score;

	void grade(int score) {
		this.score = score;
		if (score > 80 && score <= 100) {
			System.out.println("Your grade is A+");
		} else if (score > 70 && score <= 90) {
			System.out.println("Your grade is A");
		} else if (score > 60 && score <= 80) {
			System.out.println("Your grade is B+");
		} else if (score > 60 && score <= 70) {
			System.out.println("Your grade is B");
		} else if (score > 40 && score <= 60) {
			System.out.println("Your grade is C");
		} else if (score < 30 && score >= 0) {
			System.out.println("Need to improve study");
		} else {
			System.out.println("Invalid score");
		}
	}

	public static void main(String[] args) {
		StudentGrade sg = new StudentGrade();
		sg.grade(83);
		sg.grade(65);
		sg.grade(19);
		sg.grade(-15);
		sg.grade(95);
	}

}
