//Program 1: 
//
//Find the word frequency of below string
//String s = "hi hello good morning good evening hi bye hello"; 
//Output: {hi=2, hello=2, evening=1, good=2, morning=1, bye=1}

package fazrana.map;

import java.util.*;

public class FAssignment92 {
	Map<String,Integer> getFrequency(String str) {
		String[] array=str.split(" ");
		List<String> list= new ArrayList<String>(Arrays.asList(array));
		Map<String,Integer> map= new HashMap<String,Integer>();
		for(int i=0;i<list.size();i++) {
			String value= list.get(i);
			if(i==list.indexOf(value)) {
				map.put(value, 1);
			}else {
				Integer m=map.get(value);
				map.put(value, (m+1));
			}
			
		}
		return map;
	}
	
	public static void main(String[] args) {
		String s = "hi hello bye good morning good evening hi hi bye hello"; 
		System.out.println("Input String: '" + s+"'");
		FAssignment92 fassignment92=new FAssignment92();
		System.out.println("Frequency of each element: "+fassignment92.getFrequency(s));
	}
}
