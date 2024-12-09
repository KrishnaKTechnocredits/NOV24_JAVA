package nitish;

public class CharAscii {
	
	int result1(char ch) {
		int value = ch;
		return value;
	}
	
	int result2(char ch) {
		int value = ch;
		return value;
	}
	
	int result3(char ch) {
		int value = ch;
		return value;
	}
	
	int result4(char ch) {
		int value = ch;
		return value;
	}

	public static void main(String[] args) {
		char input1 = 'A';
		char input2 = 'a';
		char input3 = ' ';
		char input4 = '.';
		CharAscii charAscii = new CharAscii();
		int ans = charAscii.result1('A');
		System.out.println("The Ascii value of '"+input1+"' is "+ans);
		int ans2 = charAscii.result2('a');
		System.out.println("The Ascii value of '"+input2+"' is "+ans2);
		int ans3 = charAscii.result3(' ');
		System.out.println("The Ascii value of '"+input3+"' is "+ans3);
		int ans4 = charAscii.result4('.');
		System.out.println("The Ascii value of '"+input4+"' is "+ans4);
		

	}

}
