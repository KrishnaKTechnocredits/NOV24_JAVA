package komal.Collection.List;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Practice {
	void getAllCharFrequency(String word) {
		char[] arr = word.toCharArray();
//		System.out.println(arr[0]);
		Map<Character, Integer> mapOfCharFreq = new TreeMap<Character, Integer>();

		for (char ch : arr) {
			if (mapOfCharFreq.containsKey(ch)) {
				int count = mapOfCharFreq.get(ch);
				mapOfCharFreq.put(ch, count + 1);
			} else {
				mapOfCharFreq.put(ch, 1);
			}
		}

//		for
//		int max1 = 0;
//		mapOfCharFreq.forEach((key, value) -> {
//			if (max1 < value) { // Condition: value > 3
//				max1 = value;
//				System.out.println("Key: " + key + ", Value: " + max1);
//			}
//		});

		Set<Character> setOfKeys = mapOfCharFreq.keySet();
		System.out.println("-->" + setOfKeys);
		int max = 0;
		char maxCh = ' ';

		for (char key : setOfKeys) {
			int value = mapOfCharFreq.get(key);
			System.out.println(key + "->" + value);

			if (max < value) {
				max = value;
				maxCh = key;
			}
		}
		System.out.println(maxCh + "-->" + max);
	}

	void getAllCharFrequency1(String word) {
		char[] arr = word.toCharArray();
		Map<Character, Integer> mapOfCharFreq = new TreeMap<Character, Integer>();

		for (char ch : arr) {
			if (mapOfCharFreq.containsKey(ch)) {
				int count = mapOfCharFreq.get(ch);
				mapOfCharFreq.put(ch, count + 1);
			} else {
				mapOfCharFreq.put(ch, 1);
			}
		}

		Set<Character> setOfKeys = mapOfCharFreq.keySet();
		int max = 0;

		for (char key : setOfKeys) {
			int value = mapOfCharFreq.get(key);
			System.out.println(key + "->" + value);

			if (max < value) {
				max = value;
			}
		}
		System.out.println(max);
		System.out.println("==============================");
		for (char key : setOfKeys) {
			int value = mapOfCharFreq.get(key);
			if (value == max) {
				System.out.println(key);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aakankshakkakak";
		new Practice().getAllCharFrequency(str);
	}

}
