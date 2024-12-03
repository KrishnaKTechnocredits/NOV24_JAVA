package rushikesh.CharMethodAssignments;

public class Assignment_27 {

	char getCharfromAsciiValue(int ascii) {

		char ch = (char) ascii;
		return ch;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_27 assignment_27 = new Assignment_27();
		char ch = assignment_27.getCharfromAsciiValue(65);
		System.out.println("Ascii value 65 character is " + ch);
		char ch1 = assignment_27.getCharfromAsciiValue(90);
		System.out.println("Ascii value 90 character is " + ch1);
		char ch2 = assignment_27.getCharfromAsciiValue(55);
		System.out.println("Ascii value 55 character is " + ch2);

	}

}
