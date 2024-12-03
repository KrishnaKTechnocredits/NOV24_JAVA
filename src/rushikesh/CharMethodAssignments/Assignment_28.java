package rushikesh.CharMethodAssignments;

public class Assignment_28 {

	void printCharOfAsciiValue(int startIndex, int endIndex) {

		for (int index = startIndex; index <= endIndex; index++) {
			char ch = (char) index;
			System.out.println(index + " ->" + ch);
		}
	}

	void printAsciiValueOfChar(char startIndex, char endIndex) {

		for (char index = startIndex; index <= endIndex; index++) {
			int digit = index;
			System.out.println(index + " ->" + digit);
		}
	}

	public static void main(String[] args) {
		Assignment_28 assignment_28 = new Assignment_28();
		assignment_28.printCharOfAsciiValue(65, 100);
		System.out.println();
		assignment_28.printAsciiValueOfChar('A', 'Z');
	}
}
