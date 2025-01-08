//Rearrange the given string uppercase followed by digit followed by lowercase
//input: Te1ch6NOCre3dits
//output: TNOC163echredits

package titiksha.string;

public class ArrangeStringinorder {
	String getArrangedString(String arrange) {
		int digit = 0;
		String uppercase = "";
		String lowercase = "";
		for (int i = 0; i < arrange.length(); i++) {
			char ch = arrange.charAt(i);
			if (Character.isDigit(ch)) {
				digit += ch;
			} else if (Character.isUpperCase(ch)) {
				uppercase += ch;
			} else if (Character.isLowerCase(ch)) {
				lowercase += ch;
			}
		}

		return uppercase + digit + lowercase;

	}

	public static void main(String[] args) {
		ArrangeStringinorder arrangeStringinorder = new ArrangeStringinorder();
		String input = "Te1ch6NOCre3dits";
		String output = arrangeStringinorder.getArrangedString(input);
		System.out.println("The input is: " + input);
		System.out.println("The output is: " + output);

	}

}
