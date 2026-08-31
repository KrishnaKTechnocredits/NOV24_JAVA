/*
 * Assignment -93
Find the character frequency of below string
String s = "1234534622123"
Output: {1=2, 2=4, 3=3, 4=2, 5=1, 6=1}  
 */

package rohan;

import java.util.*;

public class Assignment_93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "1234534622123";

		Map<Object, Integer> charfreq = new TreeMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (charfreq.containsKey(ch)) {
				int frequency = charfreq.get(ch);
				charfreq.put(ch, ++frequency);
			} else {
				charfreq.put(ch, 1);
			}
		}
		System.out.println(charfreq);
	}

}
