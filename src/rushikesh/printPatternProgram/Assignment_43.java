package rushikesh.printPatternProgram;

public class Assignment_43 {

	void printPatternMethod() {
		char ch = 'A';
		for (int index = 1; index <= 4; index++) {
			for (int innerIndex = 1; innerIndex <= index; innerIndex++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_43 assignment_43 = new Assignment_43();
		assignment_43.printPatternMethod();
	}

}
