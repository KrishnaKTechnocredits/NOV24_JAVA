package rushikesh.printPatternProgram;

public class Assignment_38 {

	void printPatternProhgram() {
		for (int index = 1; index <= 4; index++) {
			for (int innerIndex = 1; innerIndex <= index; innerIndex++) {
				System.out.print("*" + "  ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment_38 assignment_38 = new Assignment_38();
		assignment_38.printPatternProhgram();
	}
}
