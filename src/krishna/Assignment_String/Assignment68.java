package Assignment_String;

import java.util.Scanner;

public class Assignment68 {

	String getRearrangedString(String str) {
		String uCase = "";
		String lCase = "";
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				uCase += str.charAt(i);
			} else if (Character.isLowerCase(str.charAt(i))) {
				lCase += str.charAt(i);
			} else if (Character.isDigit(str.charAt(i))) {
				sum += Character.getNumericValue(str.charAt(i));
			}
		}

		return uCase +sum+ lCase;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter string");
		String str = sc.nextLine();

		System.out.println(new Assignment68().getRearrangedString(str));
	}
}
