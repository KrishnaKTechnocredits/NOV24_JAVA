package nitish;

public class ValueChar {

	int result1(int input1) {
		char ch = (char) input1;
		return ch;
	}

	int result2(int input2) {
		char ch = (char) input2;
		return ch;
	}

	int result3(int input3) {
		char ch = (char) input3;
		return ch;
	}

	public static void main(String[] args) {
		int input1 = 65;
		int input2 = 90;
		int input3 = 55;
		ValueChar valueChar = new ValueChar();
		int ans = valueChar.result1(65);
		System.out.println("The Ascii value of '" + input1 + "' is " + ans);
		int ans2 = valueChar.result2(90);
		System.out.println("The Ascii value of '" + input2 + "' is " + ans2);
		int ans3 = valueChar.result3(55);
		System.out.println("The Ascii value of '" + input3 + "' is " + ans3);

	}

}
