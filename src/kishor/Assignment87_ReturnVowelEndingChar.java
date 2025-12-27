package kishor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//From given Set, return all the names which ends with Vowel. 

public class Assignment87_ReturnVowelEndingChar {
	List<String> getVowelEndNameList(HashSet<String> hs) {
		List<String> list = new ArrayList<String>();
		// there is no get method on hashset-need to use enhance for loop
		for (String name : hs) {
			String letter = Character.toString(name.charAt(name.length() - 1));
			if ("aeiou".contains(letter)) {
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
		Assignment87_ReturnVowelEndingChar assignment87 = new Assignment87_ReturnVowelEndingChar();
		List<String> ans = assignment87.getVowelEndNameList(hs);
		System.out.println(ans);

	}
}
