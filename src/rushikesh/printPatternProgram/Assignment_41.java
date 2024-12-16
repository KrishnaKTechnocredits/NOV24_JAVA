package rushikesh.printPatternProgram;

public class Assignment_41 {

	void printPatternMethod() {
		for (int index = 1; index <= 5; index++) {
			for (int innerIndex = 1; innerIndex <= 4; innerIndex++) {
				System.out.print(index + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_41 assignment_41 = new Assignment_41();
		assignment_41.printPatternMethod();
	}

}
