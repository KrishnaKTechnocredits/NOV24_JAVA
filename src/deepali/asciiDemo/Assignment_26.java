package deepali.asciiDemo;

//Write a method which returns ascii value of given character.  
public class Assignment_26 {

	void getAsciiValue(char ch) {
		int asciiValue = ch;
		System.out.println(asciiValue);
	}

	public static void main(String[] args) {
		Assignment_26 assignment = new Assignment_26();
		assignment.getAsciiValue('A');
		assignment.getAsciiValue('x');
		assignment.getAsciiValue(' ');
		assignment.getAsciiValue('-');
	}
}
