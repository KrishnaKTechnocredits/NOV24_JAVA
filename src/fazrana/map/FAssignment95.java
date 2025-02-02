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

package fazrana.map;

import java.util.*;
import java.util.Arrays;

public class FAssignment95 {
	
	Map<String, Integer> getWordsWithFrequecyGreaterOne(String str) {
		String[] array=str.split(" ");
		List<String> list= new ArrayList<String>(Arrays.asList(array));
		Map<String, Integer> map= new HashMap<String, Integer>();
		
		for(int i=0;i<list.size();i++) {
			String st= list.get(i);
			if (list.indexOf(st)==i){
				map.put(st, 1);
			}else {
				int j= map.get(st);
				map.put(st,j+1);
			}
		}
		System.out.println(map);
		
		Iterator<String> itr= map.keySet().iterator();
		
		while(itr.hasNext()) {
			String key= itr.next();
			int i=map.get(key);
			if(i==1) {
				itr.remove();
			}
		}
		return map;
		
	}
	
	public static void main(String[] args) {
		String str = "Hi Hello Hi Hi Pune India Pune India India City";
		FAssignment95 fassignment95=new FAssignment95();
		System.out.println("Output:"+fassignment95.getWordsWithFrequecyGreaterOne(str));
	}

}
