//str = ""techno10creadit23hiii  output=>33

package komal.TestProgram;

public class StrsumOfDigit {
	int sum = 0;
	String temp = " ";

	int sumOfNumber(String str) {

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				temp = temp + ch;
			} else {
				if (temp != " ") {
					sum = sum + Integer.parseInt(temp.trim());
					temp = " ";
				}
			}
		}

		if (temp != "") {
			sum = sum + Integer.parseInt(temp.trim());
		}

		// System.out.println(temp + "hii");
		return sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "techno10creadit23hiii10";
		StrsumOfDigit s = new StrsumOfDigit();
		int value = s.sumOfNumber(str);
		System.out.print("sum of digit :" + value);
	}

}
