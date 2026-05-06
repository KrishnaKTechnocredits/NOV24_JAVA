
//
//📥 Input: naman, 1221
//✅ naman is a palindrome string
//✅ 1221 is a palindrome number
//❌ techno is not a palindrome string
//❌ 1211 is not a palindrome number  [My-time 10min]
package komal.Array;

public class Assignment103 {

	int checkNumPalindrmOrNot(int num) {
		int rev = 0;
		while (num > 0) {

			rev = rev * 10 + num % 10;
			num = num / 10;

		}

		return rev;

	}

	String checkStringPalindrmOrNot(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);
		}

		return rev;

	}

	public static void main(String args[]) {

		int num = 1211;
		String str = "naman";
		int rev = new Assignment103().checkNumPalindrmOrNot(num);
		String revStr = new Assignment103().checkStringPalindrmOrNot(str);
		if (rev == num) {
			System.out.println(num + " Number is palindrome");
		} else {
			System.out.println(num + " Number is not palindrome");
		}

		if (revStr.equals(str)) {
			System.out.println(str + " String is palindrome");
		} else {
			System.out.println(str + " String is not palindrome" + revStr);
		}

	}

}
