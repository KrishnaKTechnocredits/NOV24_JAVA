package roshan;

public class Revstringorder {

	static void getReverse(String str) {
		for (int index = str.length() - 1; index >= 0; index--) {
			System.out.print(str.charAt(index));
		}
	}

	public static void main(String[] args) {
		getReverse("Roshan");

	}

}

/*
 * Assignment - 19 : 24rd Nov'2024 [20 mins] Print all the characters of given
 * string in reverse order. input : te ch3no output : o n 3 H c e t
 */