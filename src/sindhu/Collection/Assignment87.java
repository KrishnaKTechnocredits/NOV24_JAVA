/*from given set, return all the names which ends with vowel.
 * 
 * HashSet<String> hs = new HashSet<String>();
 * hs.add("techno");
 * hs.add("credits");
 * hs.add("rushikesh");
 * hs.add("krishna");
 * 
 * outpput: [techno, krishna]*/

package sindhu.Collection;

import java.util.*;

public class Assignment87 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		  hs.add("techno");
		  hs.add("credits");
		  hs.add("rushikesh");
		  hs.add("krishna");
		System.out.println("Input Hashset is: "+hs);
		ArrayList<String> al = new ArrayList<String>(hs);
		System.out.println("Input ArrayList is: "+al);
		
		Assignment87 a87 = new Assignment87();
		ArrayList<String> outLs = a87.getLastElementVowelString(al);
		System.out.println("Output List: "+outLs);
	}
	 
	public ArrayList<String> getLastElementVowelString(ArrayList<String> inpLs){
		ArrayList<String> outLs= new ArrayList<String>();
		
		for(int i=0; i<inpLs.size(); i++) {
			String str = inpLs.get(i);
			String str1 = Character.toString(str.charAt(str.length()-1));
			String str2 = "aeiou";
				
			if(str2.contains(str1)) {
				outLs.add(str);
			}
		}
		return outLs;
	}
}
