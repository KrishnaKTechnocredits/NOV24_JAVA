package ravindra;

public class Assignment_67 {
	public static void main(String[] args) {
		String input = "Te1ch6NOCre3dits";
		String str=rearrangeString(input);
		System.out.println(str);
	}

	static String rearrangeString(String input) {
		String upperCase = "";
		String lowerCase = "";
		String digit = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch)) {
				upperCase += ch;
			} else if (Character.isDigit(ch)) {
				digit += ch;
			} else {
				lowerCase += ch;
			}
		}
		return upperCase+digit+lowerCase;
	}
}
