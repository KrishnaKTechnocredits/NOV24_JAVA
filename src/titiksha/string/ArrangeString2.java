//Rearrange the given string uppercase followed by digit followed by lowercase
//Te1ch6NOCre4dits
//TNOC11echredits

package titiksha.string;

public class ArrangeString2 {
	String getArrangedString(String arrange) {
		int digit = 0;
		String uppercase = "";
		String lowercase = "";
		int sum=0;
		for (int i = 0; i < arrange.length(); i++) {
			char ch = arrange.charAt(i);
			if (Character.isDigit(ch)) {
				digit=Character.getNumericValue(ch);
				sum=sum+digit;
			} else if (Character.isUpperCase(ch)) {
				uppercase += ch;
			} else if (Character.isLowerCase(ch)) {
				lowercase += ch;
			}
		}

		return uppercase + sum+ lowercase;

	}

	public static void main(String[] args) {
		ArrangeString2 arrangeString = new ArrangeString2();
		String input = "Te1ch6NOCre4dits";
		String output = arrangeString.getArrangedString(input);
		System.out.println("The input is: " + input);
		System.out.println("The output is: " + output);

	}

}


