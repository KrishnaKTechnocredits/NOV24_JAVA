package krishna;

import java.util.Scanner;

//get all char freq //nested for loop
public class Assignment32_Optimized {

	void getCharFreq(String str) {
		int charCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i)) == i) {
				for (int j = 0; j < str.length(); j++) {
					if (str.charAt(i) == str.charAt(j)) {
						charCount++;
					}
				}
				System.out.println(str.charAt(i) + " character frequency is : " + charCount);
				charCount = 0;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter string");
		String str = sc.nextLine();

		new Assignment32_Optimized().getCharFreq(str);
	}

}
