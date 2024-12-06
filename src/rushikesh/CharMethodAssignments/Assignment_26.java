package rushikesh.CharMethodAssignments;

public class Assignment_26 {

	int getAsciiValueOfChar(char ch) {

		int a = ch;
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_26 assignment_26 = new Assignment_26();
		int a = assignment_26.getAsciiValueOfChar('A');
		System.out.println("Ascii value of A is " + a);
		int x = assignment_26.getAsciiValueOfChar('x');
		System.out.println("Ascii value of x is " + x);
		int e = assignment_26.getAsciiValueOfChar(',');
		System.out.println("Ascii value of (,) is " + e);
		int s = assignment_26.getAsciiValueOfChar(' ');
		System.out.println("Ascii value of space is " + s);
		int f = assignment_26.getAsciiValueOfChar('.');
		System.out.println("Ascii value of (.) is " + f);

	}

}
