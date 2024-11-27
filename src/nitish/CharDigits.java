package nitish;

public class CharDigits {

	int Total(String digits) {
		int count = 0;
		for (int num = 0; num < digits.length(); num++) {
			char ch = digits.charAt(num);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String str = "Nit03is1h0Meh56t8a";
		System.out.println("Input we are giving is '" + str + "'\n");
		CharDigits charDigits = new CharDigits();
		int totalDigits = charDigits.Total(str);
		System.out.println("Total '" + totalDigits + "' digits are there in the given input.");

	}

}
