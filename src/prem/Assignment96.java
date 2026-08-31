package prem;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Assignment96 {

	void m1(String str) {
		ConcurrentHashMap<String, Integer> setOfFreq = new ConcurrentHashMap<String, Integer>();
		String[] word = str.split(" ");

		for (int i = 0; i < word.length; i++) {
			int count = 0;
			String str1 = word[i];
			for (int j = 0; j < word.length; j++) {
				String str2 = word[j];
				if (str1.equals(str2)) {
					count++;
				}
			}
			setOfFreq.put(str1, count);

		}
		System.out.println(setOfFreq);
		Set<String> list = setOfFreq.keySet();
		Iterator<String> itr = list.iterator();
		int max = 0;
		while (itr.hasNext()) {
			String key = itr.next();
			int value = setOfFreq.get(key);

			if (max > value) {
				setOfFreq.remove(key);
			} else if (max <= value) {
				max = value;
			}
		}
		System.out.println(setOfFreq);
	}

	public static void main(String[] args) {
		String str = "Hi Hello Hi Hi Pune India Pune India India City";
		Assignment96 assign96 = new Assignment96();
		assign96.m1(str);
	}

}
