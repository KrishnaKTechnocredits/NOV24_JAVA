package rushikesh.CharMethodAssignments;

public class Assignment_29 {

	void printAsciiOfChar(char startIndex, char endIndex) {

		for (char index = startIndex; index <= endIndex; index++) {
			if (Character.isDigit(index)) {
				int digit = index;
				System.out.println(index + "->" + digit);
			} else if (Character.isUpperCase(index)) {
				int digit = (char) index;
				System.out.println(index + "->" + digit);
			} else if (Character.isLowerCase(index)) {
				int digit = (char) index;
				System.out.println(index + "->" + digit);
			}
		}
	}

	public static void main(String[] args) {
		Assignment_29 assignment_29 = new Assignment_29();
		System.out.println("Print Ascii Value of Capital Letter");
		assignment_29.printAsciiOfChar('A', 'Z');
		System.out.println();
		System.out.println("Print Ascii Value of small Letter");
		assignment_29.printAsciiOfChar('a', 'z');
		System.out.println();
		System.out.println("Print Ascii Value of digit Letter");
		assignment_29.printAsciiOfChar('0', '9');

	}
}