package rohan;

public class Assignmet_26 {

	int AsciiValue(char input) {
		int num = (int) input;
		System.out.println("Input: " + input + "\n" + "Output: " + num + "\n");
		return num;
	}

	public static void main(String[] args) {
		Assignmet_26 a = new Assignmet_26();
		a.AsciiValue('A');
		a.AsciiValue('x');
		a.AsciiValue(' ');
		a.AsciiValue('.');
	}

}
