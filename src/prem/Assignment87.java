package prem;

import java.util.*;

public class Assignment87 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("techno");
		hs.add("credits");
		hs.add("rushikesh");
		hs.add("krishna");

		for (String name : hs) {
			String ch = Character.toString(name.charAt(name.length() - 1));
			if ("aeiou".contains(ch)) {
				System.out.println(name);
			}
		}
	}

}
