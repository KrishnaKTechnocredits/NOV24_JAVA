package deepali.asciiDemo;

//Write a method which returns character of given ascii value. 
public class Assignment_27 {

	void getAsciiValue(int value) {
		char characterValue = (char)value;
		System.out.println(characterValue);
	}

	public static void main(String[] args) {
		Assignment_27 assignment = new Assignment_27();
		assignment.getAsciiValue(65);
		assignment.getAsciiValue(90);
		assignment.getAsciiValue(55);
	}
}
