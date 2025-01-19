//Assignment - 35 : 7th Dec [20 mins]
//return "Upper" if uppercase frequency is higher than lowercase frequency other return "lower".
//if both having same freqency then return "same".
//
//input : teChnOcreDits
//output : lower
//
//if(uCount > lCount)
//	return "upper";
//else if(lCount > uCount)
//   return "lower";
//else
//   return "same";

package harshada.string;

public class StringAss12 {

	String findUpperLowerChar(String str) {
		int uCount = 0, lCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int index = str.indexOf(ch);
			if (index == i) {
				if (Character.isUpperCase(ch)) {
					uCount++;
				} else if (Character.isLowerCase(ch)) {
					lCount++;
				}
			}
		}
		System.out.println("Frequency of Uppercase char -> " + uCount);
		System.out.println("Frequency of Lowercase char -> " + lCount);

		if (uCount > lCount) {
			return "upper";
		} else if (lCount > uCount) {
			return "Lower";
		} else
			return "Same";
	}

	public static void main(String[] args) {
		StringAss12 stringAss12 = new StringAss12();
		String frequency = stringAss12.findUpperLowerChar("teChnOcreDits");
		System.out.println(frequency);
	}
}
