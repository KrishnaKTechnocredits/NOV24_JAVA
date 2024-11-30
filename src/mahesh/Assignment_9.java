package mahesh;

public class Assignment_9 {
	
	void printGrade(int score) {
		
		if (score<0) {
			System.out.println("Invalid score, scoe can't be negative.");
			
		}else if (score>=0 && score<50) {
			System.out.println("Low score, needs to work hard.");
			
		}else if (score>=50 && score<60) {
			System.out.println("Obtained grade is C.");
			
		}else if (score>=60 && score<70) {
			System.out.println("Obtained grade is B.");
			
		}else if (score>=70 && score<80) {
			System.out.println("Obtained grade is B+.");
			
		}else if (score>=80 && score<90) {
			System.out.println("Obtained grade is A.");
			
		}else if (score>=90 && score<=100) {
			System.out.println("Obtained grade is A+.");
			
		}else {
			System.out.println("Invalid score.");
			
		}
	}
	
	public static void main(String[] args) {
		Assignment_9 assignment = new Assignment_9();
		assignment.printGrade(100);
		System.out.println("----------------------------------------");
		assignment.printGrade(89);
		System.out.println("----------------------------------------");
		assignment.printGrade(70);
		System.out.println("----------------------------------------");
		assignment.printGrade(-10);
		System.out.println("----------------------------------------");
		assignment.printGrade(122);
	}
}
