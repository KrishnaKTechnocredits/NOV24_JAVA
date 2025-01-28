//Assignment - 96 : 26th Jan'2025
//
//return the list of all the words having highest frequency.
// 
//String str = "Hi Hello Hi Hi Pune India Pune India India City";
//output : [Hi, India] 

package fazrana.map;

import java.util.Arrays;
import java.util.*;

public class FAssignment96 {
	Map<String, Integer> getFrequency(String str) {
		String[] array= str.split(" ");
		List<String> list= new ArrayList<String>(Arrays.asList(array));
		Map<String, Integer> map= new HashMap<String, Integer>();
		
		for(int i=0;i<list.size();i++) {
			String s=list.get(i);
			if(list.indexOf(s)==i) {
				map.put(s, 1);
			}else {
				int value=map.get(s);
				map.put(s, value+1);
			}
		}
		return map;
	}
	
	Set<String> getWordsWithHighestFrequency(Map<String, Integer> map) {
		Set<String> set= map.keySet();
		Iterator<String> itr= set.iterator();
		int highestNumber=0;
		while(itr.hasNext()) {
			String s= itr.next();
			int i=map.get(s);
			if(highestNumber<i) {
				highestNumber=i;
			}
		}
		System.out.println("Highest number is : "+highestNumber);
		
		Iterator<String> itr1= set.iterator();
		while(itr1.hasNext()) {
			String s= itr1.next();
//			System.out.println("1"+s);
			int i=map.get(s);
			if(i!=highestNumber) {
//				System.out.println(s);
				itr1.remove();
			}
		}
		return set;
	}
	
	public static void main(String[] args) {
		String str = "Hi Hello Hi Hi Pune India Pune India India City";
		System.out.println("Input String: "+ str);
		FAssignment96 fassignment96=new FAssignment96();
		System.out.println("Output: "+fassignment96.getWordsWithHighestFrequency(fassignment96.getFrequency(str)));
	}
}
