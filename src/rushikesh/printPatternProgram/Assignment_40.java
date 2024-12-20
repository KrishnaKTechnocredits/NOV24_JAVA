package rushikesh.printPatternProgram;

public class Assignment_40 {

	void printPatternMethod() {
		int count = 1;
		for (int index = 1; index <= 4; index++) {
			for (int innerIndex = 1; innerIndex <= index; innerIndex++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_40 assignment_40 = new Assignment_40();
		assignment_40.printPatternMethod();
	}

}
