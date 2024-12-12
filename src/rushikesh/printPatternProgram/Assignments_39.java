package rushikesh.printPatternProgram;

public class Assignments_39 {

	void printPatternMethod() {
		for (int index = 1; index <= 6; index++) {
			for (int innerIndex = 1; innerIndex <= index; innerIndex++) {
				System.out.print(innerIndex + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignments_39 assignment_39 = new Assignments_39();
		assignment_39.printPatternMethod();
	}

}
