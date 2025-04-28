package vrushali.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

//Assignment - 95 : 26th Jan'2025
//
//String str = "Hi Hello Hi Hi Pune India Pune India India City";
//output : Hi -> 3
//         Hello -> 1
//		 Pune -> 2
//		 India -> 3
//		 City -> 1
//		 
//		 return a map, having only those words with freq more than 1. 
//		 Hi -> 3
//         Pune -> 2
//		 India -> 3
//		 
//NOTE : use ConcurrentHashMap

public class ReturnMapHavingWordFreqMoreThatOne95 {

	Map<String, Integer> returntWordFrequencyMop(String str) {
		String[] strArray = str.split(" ");
		Map<String, Integer> wordFreqMao = new ConcurrentHashMap<String, Integer>();
		int count = 0;
		for (String word : strArray) {
			if (wordFreqMao.containsKey(word)) {
				count = wordFreqMao.get(word);
				count++;
				wordFreqMao.put(word, count);
			} else {
				wordFreqMao.put(word, 1);
			}
		}
		return wordFreqMao;
	}

	Map<String, Integer> returntMapHavingFreqMoreThanOne(String str) {
		Map<String, Integer> wordFreqMap = returntWordFrequencyMop(str);
		Set<String> wordSet = wordFreqMap.keySet();
		for (String word : wordSet) {
			if (wordFreqMap.get(word) <= 1) {
				wordFreqMap.remove(word);
			}
		}
		return wordFreqMap;
	}

	public static void main(String[] args) {

		ReturnMapHavingWordFreqMoreThatOne95 returnMapHavingWordFreqMoreThatOne95 = new ReturnMapHavingWordFreqMoreThatOne95();
		String str = "Hi Hello Hi Hi Pune India Pune India India City";
		Map<String, Integer> wordFreqMap = returnMapHavingWordFreqMoreThatOne95.returntMapHavingFreqMoreThanOne(str);
		System.out.println("Words with freq more than 1 are : "+wordFreqMap);
	}
}
