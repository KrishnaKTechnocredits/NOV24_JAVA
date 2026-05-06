package roshan.Map;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ReturnWordsHavingHighestFrequency96 {
	public List<String> getWordsWithHighestFrequency96(String str) {
		String[] arr = str.split(" ");
		Map<String, Integer> maplist = new ConcurrentHashMap<>();
	    List <String> outputList = new ArrayList<> ();
		for (String word : arr) {
			if (!maplist.containsKey(word)) {
				maplist.put(word, 1);
			} else {
				int count = maplist.get(word) + 1;
				maplist.put(word, count);

			}
		}
		    //find max frequency(itterator not require can use inhance for loop)
			Set<String> fword = maplist.keySet();  //mistake>>i have write this inside loop
			Iterator<String> itr = fword.iterator();
			int maxfreq = 0;
			while (itr.hasNext()) {
				String currentword = itr.next();
				int value = maplist.get(currentword);
				if (maxfreq < value) {
					maxfreq = value;
				}

			}
			//System.out.println(maxfreq);
			
			for(String countfreq : fword) {       //need to write this to get all word wth max frequency
				int value = maplist.get(countfreq);
				if (value == maxfreq) {
					outputList.add(countfreq);
				}
				
				
			}

		

		return outputList;

	}

	public static void main(String[] args) {
		String str = "Hi Hello Hi Hi Pune India Pune India India City";
		ReturnWordsHavingHighestFrequency96 returnwordshavinghighestfrequency96 = new ReturnWordsHavingHighestFrequency96();
		List<String> result = returnwordshavinghighestfrequency96.getWordsWithHighestFrequency96(str);
		System.out.println(result);

	}
}

/*
 * Assignment - 96 : 26th Jan'2025 return the list of all the words having
 * highest frequency. String str =
 * "Hi Hello Hi Hi Pune India Pune India India City"; output : [Hi, India]
 */