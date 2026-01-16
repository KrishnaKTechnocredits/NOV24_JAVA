package nilam.CollectionFrameWork.Set;
//From given Set, return all the names which ends with Vowel. 

import java.util.HashSet;
import java.util.Set;

public class Assignment_87 {

	static Set<String> getNamesEndWithVowels(Set<String> namesList) {
		Set<String> output = new HashSet<String>();
		for (String name : namesList) {
			String ch = Character.toString(name.charAt(name.length() - 1));
			if ("aieou".contains(ch)) {
				output.add(name);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Set<String> namesList = new HashSet<String>();
		namesList.add("techno");
		namesList.add("credits");
		namesList.add("rushikesh");
		namesList.add("krishna");
		System.out.println(namesList);

		Set<String> output = getNamesEndWithVowels(namesList);
		System.out.println(output);
	}

}
