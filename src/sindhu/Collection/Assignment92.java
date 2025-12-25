/*Find the word frequency of below string
String s = "hi hello good morning good evening hi bye hello"; 
Output: {hi=2, hello=2, evening=1, good=2, morning=1, bye=1}*/

package sindhu.Collection;

import java.util.*;

public class Assignment92 {
	public static void main(String[] args) {
		String s = "hi hello good morning good evening hi bye hello"; 
		String[] arr = s.split(" ");
		System.out.println("the input array: "+Arrays.toString(arr));
		List<String> lst = new ArrayList<>(Arrays.asList(arr));
		Map<String, Integer> outMap = getStringFreq(lst);
		System.out.println("The output map: "+outMap);
	}
	
	public static Map<String, Integer> getStringFreq(List<String> lst){
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0; i<lst.size(); i++) {
			String word = lst.get(i);
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			}else {
				map.put(word, 1);
			}
		}
		
		return map;
	}
	
}
