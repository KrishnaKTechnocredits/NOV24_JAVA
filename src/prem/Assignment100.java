package prem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assignment100 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter input");
		String input = sc.nextLine();
		Map<Character, Integer> frequency = new HashMap<>();
		for (int j = 0; j < input.length(); j++) {
			char ch = input.charAt(j);
			int count = 0;
			if (!frequency.containsKey(ch)) {
				for (int i = 0; i < input.length(); i++) {
					char ch1 = input.charAt(i);

					if (ch1 == ch) {
						count++;
						frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
					}
				}
			}
		}
		System.out.println(frequency);
		sc.close();

	}
}
