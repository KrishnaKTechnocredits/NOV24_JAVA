/*Assignment - 58 : 21th Dec'2024 [15 mins]
Return the second maximum length string from given array.
If you find multiple string as second maximum, return the last second maximum.*/

package harshada.Array3;

public class SecondMaxLenStr {

	static void getSecondMaxStr(String[] str) {
		String maxLenStr = str[1];
		String secMaxLenStr = str[0];
		if (str[0].length() > str[1].length()) {
			maxLenStr = str[0];
			secMaxLenStr = str[1];
		}

		for (int j = 2; j < str.length; j++) {
			if (maxLenStr.length() < str[j].length()) {
				secMaxLenStr = maxLenStr;
				maxLenStr = str[j];
			} else if (secMaxLenStr.length() <= str[j].length()) {
				secMaxLenStr = str[j];
			}
		}
		System.out.println(
				"Second max length String is " + secMaxLenStr + " and String length is " + secMaxLenStr.length());
	}

	public static void main(String[] args) {
		String[] input = { "Tech", "Tech", "Technocredits", "aashvi", "GlobantPune", "Ashvik", "PuneGlobant", "Pune",
				"PuGlobantne" };
		getSecondMaxStr(input);
	}
}
