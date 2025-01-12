//Assignment - 71: 5th Jan'2025 [IMP]
//return the word having highest digits in the given String.
//String str = "H2i22 H1ello Techno C2red3i3t4s5";
//output: C2red3i3t4s5

package titiksha.string;

public class MaxLengthString {
	int getdigitcount(String name) {
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		return count;
	}

	String getmaxDigitString(String str) {
		int maxcount = 0;
		int count = 0;
		String maxlength = "";
		String[] split = str.split(" ");// spliting the each string "h2i22" "h1ello"..
		for (int i = 0; i < split.length; i++) {
			count = getdigitcount(split[i]);
			if (maxcount < count) {
				maxcount = count;
				maxlength = split[i];
			}
		}
		return maxlength;
	}

	void getDigitCount(String str) {
		int count = 0;
		String[] split = str.split(" ");// spliting the each string "h2i22" "h1ello"..
		for (int i = 0; i < split.length; i++) {
			count = getdigitcount(split[i]);
			System.out.println(split[i] + "---->" + count);
		}

	}

	public static void main(String[] args) {
		MaxLengthString maxLengthString = new MaxLengthString();
		String name = "H2i22 H1ello Techno C2red3i3t4s5";
		String output = maxLengthString.getmaxDigitString(name);
		System.out.println("The input string is:" + " " + name);
		System.out.println("The maxlength string is:" + " " + output + "\n");
		System.out.println("The count of digit in given string is:");
		maxLengthString.getDigitCount(name);

	}

}
