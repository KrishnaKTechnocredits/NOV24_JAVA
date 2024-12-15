
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

package komal.Inheritance;

public class Assignment35 {
	String getCharFrequency(String input) {
		int upperCount = 0, lowerCount = 0;

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch)) {
				upperCount++;
			} else {
				lowerCount++;
			}
		}

		if (upperCount > lowerCount) {
			System.out.println("Count of uppercase is " + upperCount);
			return "Upper";

		} else if (lowerCount > upperCount) {
			System.out.println("Count of lowercase is " + lowerCount);
			return "Lower";

		} else {
			// System.out.println("Count of lowercase is " + );
			return "same";
		}

	}

	public static void main(String args[]) {
		Assignment35 a35 = new Assignment35();
		String input = "teChnOcreDits";
		String value = a35.getCharFrequency(input);
		System.out.println(value);
	}
}
