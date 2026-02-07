package roshan.Scanner;

import java.util.*;
import java.util.Scanner;

public class FindFrequencyofWord100 {

	static Map<String, Integer> getFrequency(String input) {
		String[] word = input.split(" ");
		Map<String, Integer> mapList = new HashMap<>();

		for (String Singleword : word) {
			if (!mapList.containsKey(Singleword)) {
				mapList.put(Singleword, 1);
			} else {
				int count = mapList.get(Singleword) + 1;
				mapList.put(Singleword, count);

			}
		}
		return mapList;
	}

	static Map<String, Integer> userInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please entr input:");
		String input = sc.nextLine();
		System.out.println("Given input is: " + input);

		Map<String, Integer> result1 = getFrequency(input);
		sc.close();
		return result1;
	}

	public static void main(String[] args) {
		Map<String, Integer> result = userInput();
		System.out.println(result);
	}

}

/*
 * Assignment - 100 : 1st Feb'2025 Find out frequency of each word on user
 * defined input. Hint : Use scanner class and Map
 */