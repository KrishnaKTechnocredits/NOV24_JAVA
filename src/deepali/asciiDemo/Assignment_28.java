package deepali.asciiDemo;

//write a method to print all the characters having ascii value from 65 to 100.
public class Assignment_28 {

	void getAsciiValue(int startIndex, int endIndex) {

		for (int value = startIndex; value <= endIndex; value++) {
			char characterValue = (char) value;
			System.out.println(characterValue);
		}
	}

	public static void main(String[] args) {
		Assignment_28 assignment = new Assignment_28();
		assignment.getAsciiValue(65, 100);
	}
}
