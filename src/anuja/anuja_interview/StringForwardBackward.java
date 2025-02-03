package anuja.anuja_interview;

import java.util.Scanner;

public class StringForwardBackward {
	public static void main(String[] args) {
		StringForwardBackward obj = new StringForwardBackward();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String inputStr = sc.nextLine();
		System.out.println("Input String is: " + inputStr + "\n");
		System.out.println("Enter a char for which backward and forward compatibility asked to count the index ");
		char ch = sc.next().charAt(0);
		System.out.println("Input char to count index: " + ch + "\n");
		System.out.println(
				"Return index of char '" + ch + "' in string --" + inputStr + "-- using forward and backward way");
		obj.countIndexOFcharFromForwardAndBackward(inputStr, ch);

	}

	private void countIndexOFcharFromForwardAndBackward(String inputStr, char ch) {
		// anuja kannawar , w
		// forward compatibilty
		//int forwardCount = 0;
		int backwordCount = 0;
		int count = 0;

		for (int i = 0; i < inputStr.length(); i++) {
			if (inputStr.charAt(i) != ch) {
				count = i;
				break;
			}
		}
		System.out.println("Index of char " + ch + " in forward direction is: " +count);

	}
}
