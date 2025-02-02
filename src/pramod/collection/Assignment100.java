/*
 * Assignment - 100 : 1st Feb'2025
Find out frequency of each word on user defined input. 
Hint : Use scanner class and Map.
 */
package pramod.collection;

import java.util.*;

public class Assignment100 {

	void findFrequency(String str) {
		Map<Character, Integer> hm = new HashMap<>();
		int value = 1;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (hm.containsKey(ch)) {
				value = hm.get(ch);
				hm.put(ch, (value + 1));
			} else {
				hm.put(ch, 1);
			}
		}
		System.out.print("Frequency of given string is: ");
		System.out.println(hm);

	}

	public static void main(String[] args) {
		System.out.println("Enter the string to find the frequency: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		new Assignment100().findFrequency(str);
		sc.close();
	}
}
