package krishna;

import java.util.Scanner;

//get upper case , lower case , digits , spaces and special characters count
public class Assignment23 {

	void getDifferentCharactersCount(String str) {
		int uCount = 0;
		int lCount = 0;
		int dCount = 0;
		int spaceCount = 0;
		int specialCharCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isAlphabetic(str.charAt(i))) {
				if (Character.isUpperCase(str.charAt(i))) {
					uCount++;
				} else {
					lCount++;
				}
			} else if (Character.isDigit(str.charAt(i))) {
				dCount++;
			} else if (str.charAt(i) == ' ') {
				spaceCount++;
			} else
				specialCharCount++;
		}

		System.out.println("Upper case count in the given string are " + uCount);
		System.out.println("Lower case count in the given string are " + lCount);
		System.out.println("Digit case count in the given string are " + dCount);
		System.out.println("Space case count in the given string are " + spaceCount);
		System.out.println("Special character case count in the given string are " + specialCharCount);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter string");
		String str = sc.nextLine();

		new Assignment23().getDifferentCharactersCount(str);
	}
}
