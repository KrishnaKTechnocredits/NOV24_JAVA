package vrushali.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Assignemt no 87: Return list of string ends with vowles

public class ReturnStringEndsWithAnyVowel87 {

	List<String> returnListStringEndsWithAnyVowel87(Set<String> nameSet) {
		List<String> list = new ArrayList<String>();
		char ch;
		for (String name : nameSet) {
			ch = name.charAt(name.length() - 1);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				list.add(name);
			}
		}
		return list;

	}

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("techno");
		hs.add("credits");
		hs.add("rushikesh");
		hs.add("krishna");
		System.out.println(" The Given HashSet is : " + hs);
		ReturnStringEndsWithAnyVowel87 returnStringEndsWithAnyVowel87 = new ReturnStringEndsWithAnyVowel87();
		List<String> list = returnStringEndsWithAnyVowel87.returnListStringEndsWithAnyVowel87(hs);
		System.out.println(" The Resulting names end with vowel are " + list);
	}

}
