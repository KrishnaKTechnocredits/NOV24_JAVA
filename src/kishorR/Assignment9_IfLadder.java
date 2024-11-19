package kishorR;

public class Assignment9_IfLadder {
	
	void printStudentInfo(int marks) {
		if(marks>90 && marks<=100) {
			System.out.println("A+");
		}
		else if(marks>80 && marks<=90) {
			System.out.println("A");
		}
		else if(marks>70 && marks<=80) {
			System.out.println("B+");
		}
		else if(marks>60 && marks<=70) {
			System.out.println("B");
		}
		else if(marks>=50 && marks<=60) {
			System.out.println("C");
		}
		else if(marks<50 && marks>=0) {
			System.out.println("work harder");
		}
		else {
			System.out.println("invalid score");
		}
	}
	public static void main(String[] args) {
		Assignment9_IfLadder ifladder = new Assignment9_IfLadder();
		ifladder.printStudentInfo(92);
		ifladder.printStudentInfo(76);
		ifladder.printStudentInfo(23);
		ifladder.printStudentInfo(-19);
		ifladder.printStudentInfo(102);
	}
}
