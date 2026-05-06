package anuja.collection;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*Assignment - 96 : 26th Jan'2025

return the list of all the words having highest frequency.
 
String str = "Hi Hello Hi Hi Pune India Pune India India City";
output : [Hi, India] */
public class Assignment96 {

	public static void main(String[] args) {
		String str =  "Hi Hello Hi Hi Pune India Pune India India City";
		System.out.println("Given String is \n" +str +"\n");
		List<String> list = new ArrayList<>(Arrays.asList(str.split(" ")));
		new Assignment96().processData(list);
		//System.out.println(list);
		
	}
	
	public void processData(List<String> list) {
		
		Map<String, Integer> wordsWithMaxfreq = new HashMap <String, Integer>();
		
		for(String names: list) {
			
			if(wordsWithMaxfreq.containsKey(names)) {
				wordsWithMaxfreq.put(names, wordsWithMaxfreq.get(names)+1);
			}
			else {
					wordsWithMaxfreq.put(names,1);
			}
		}
		System.out.println("Transformed string in map is: " + wordsWithMaxfreq +"\n");
		findMaxValueinMap(wordsWithMaxfreq);
	}
	public void findMaxValueinMap (Map<String, Integer> wordsWithMaxfreq) {
		int maxNum = 0;
		
		//logic to find only value which is max;
		Iterator <Integer> valueItr1 =  wordsWithMaxfreq.values().iterator();
		//maxnum arrya ;
		
		while(valueItr1.hasNext()) {
			int num = valueItr1.next();
			if(num>maxNum) {
				maxNum =  num;
			}
			
		}

		//logic only to find the words with max frequencey we used one more ietrator on key value pair
		List<String> maxFreqList = new ArrayList<String>();
		Iterator <Map.Entry<String, Integer>> itr =  wordsWithMaxfreq.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<String, Integer> keyValuePair = itr.next();
			if(keyValuePair.getValue() == maxNum) {
			maxFreqList.add(keyValuePair.getKey());
			}
		}	

		System.out.println("Max frequency words are :  "+maxFreqList  );
	}
		
		
}
	
	

