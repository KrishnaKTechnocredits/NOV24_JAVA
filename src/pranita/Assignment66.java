package pranita;


	import java.util.*;

	class Assignment66 {

		boolean getIsDigit(String word) {
			boolean flag = true;
			for (int i = 0; i < word.length(); i++) {
				char ch = word.charAt(i);
				if (Character.isDigit(ch)) {
					flag = false;
				}
			}
			return flag;
		}

		String getStringInReverse(String word, boolean flag) {
			String output = "";

			for (int i = word.length() - 1; i >= 0; i--) {

				if (flag == true) {
					char ch = word.charAt(i);
					output = output + ch;
				} else
					return getDigitRemoved(word);
			}
			return output;
		}

		String getDigitRemoved(String word) {
			String output = "";
			for (int i = 0; i < word.length(); i++) {
				char ch = word.charAt(i);
				if (!Character.isDigit(ch)) {
					output = output + ch;
				}
			}
			return output;
		}

		void printReverseWordInArrayIfDigitNotPresent(String[] input) {
			for (int i = 0; i < input.length; i++) {
				boolean flag = getIsDigit(input[i]);
				String str = getStringInReverse(input[i], flag);
				input[i] = str;
			}
			System.out.println("Reverse word in array if digit not present is : " + Arrays.toString(input));
		}

		public static void main(String[] args) {
			Assignment66 A66 = new Assignment66();
			String[] input = { "tech", "aa1shvi", "credits", "H4i", "Hello" };
			System.out.println("Given array is : " + Arrays.toString(input));
			A66.printReverseWordInArrayIfDigitNotPresent(input);
		}
	}

