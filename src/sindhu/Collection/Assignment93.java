/*Find the character frequency of below string
String s = "1234534622123"
Output: {1=2, 2=4, 3=3, 4=2, 5=1, 6=1}*/

package sindhu.Collection;

import java.util.*;

public class Assignment93 {
	public static void main(String[] args) {
		String s = "1234534622123";
		String[] arr = s.split("");
		ArrayList<String> al = new ArrayList<>(Arrays.asList(arr));
		System.out.println("input arr: "+al);
		
		Map<String,Integer> map = getFreqNum(al);
		System.out.println("The output map: "+map);
	}
	public static Map<String,Integer> getFreqNum(ArrayList<String> al){
		Map<String,Integer> map = new HashMap<>();
		for(int i=0; i<al.size(); i++) {
			String num = al.get(i);
			if(map.containsKey(num)) {
				map.put(num,map.get(num)+1);
			}else {
				map.put(num, 1);
			}
		}
		return map;
	}
}
