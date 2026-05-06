/*return the list of all the words having highest frequency.
 
String str = "Hi Hello Hi Hi Pune India Pune India India City";
output : [Hi, India] */

package sindhu.Collection;

import java.util.*;

public class Assignment96 {
	
	public List<String> getMaxValueStringsInMap(String[] arrStr) {
		Map<String, Integer> opMap = new HashMap<String, Integer>();
		
		for(int i=0; i<arrStr.length; i++) {
			String word = arrStr[i];
			if(opMap.containsKey(word)) {
				int count= opMap.get(word);
				opMap.put(word, count+1);
			}else {
				opMap.put(word, 1);
			}
		}
		
		Iterator<String> itr = opMap.keySet().iterator();
		
		List<String> l1 = new ArrayList<String>();
		
		String maxKey = null;
		int maxVal = 0;
		
		while(itr.hasNext()) {
			
			String key = itr.next();
			int value = opMap.get(key);
			
			if(maxVal<=value) {
				maxVal = value;
				maxKey = key;
				
				l1.add(key);
			}
		}
		return l1;
	}
	
	public static void main(String[] args) {
		String str = "Hi Hello Hi Hi Pune India Pune India India City";
		String[] arrStr = str.split(" ");
		System.out.println("The input array is: "+Arrays.toString(arrStr));
		List<String> output =new Assignment96().getMaxValueStringsInMap(arrStr);
		System.out.println("The keys with max value in the map: "+output);
	}
}
