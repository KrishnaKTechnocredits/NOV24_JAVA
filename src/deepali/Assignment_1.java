package deepali;

//Program to print student info
public class Assignment_1 {
	String studentName = "Deepali";
	int rno = 15;
	
	void displayInfo() {
		System.out.println("Student name :" + studentName );
		System.out.println("Student roll number :" + rno );
	}
	
	public static void main(String[] args) {
		Assignment_1 assignment = new Assignment_1();
		assignment.displayInfo();
	}
}
