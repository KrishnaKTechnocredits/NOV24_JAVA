/*Find out frequency of each word on user defined input. 
Hint : Use scanner class and Map.*/

package sindhu.scanner;

import java.util.*;

public class Assignment100 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name=null;
		List<String> al = new ArrayList<String>();
		// we can provide input from console
		System.out.println("provide string input strings: ");
		for(int i=0; i<=6; i++) {
			name = sc.next();
			al.add(name);
		}
		System.out.println("The input string list is: "+al);	
		Assignment100 a100 = new Assignment100();
		a100.getFreqOfWords(al);
		sc.close();
	}
	
	public void getFreqOfWords(List<String> al) {
		Map<String, Integer> map = new HashMap<>();
		
		for(int j=0; j<al.size(); j++) {
			String word = al.get(j);
			System.out.println("the key is: "+word);
			if(map.containsKey(word)) {
				map.put(word,  map.get(word) + 1);
			}else {
				map.put(word, 1);
			}
		}
		System.out.println("The frequency of words in list is: "+map);
	}
}
