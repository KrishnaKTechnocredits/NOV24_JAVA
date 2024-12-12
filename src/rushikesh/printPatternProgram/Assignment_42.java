package rushikesh.printPatternProgram;

public class Assignment_42 {

	void printPatternMethod() {
		for (int index = 1; index <= 4; index++) {
			for (int innerIndex = 1; innerIndex <= index; innerIndex++) {
				System.out.print(index + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_42 assignment_42 = new Assignment_42();
		assignment_42.printPatternMethod();
	}

}
