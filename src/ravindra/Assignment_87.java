package ravindra;

import java.util.HashSet;
import java.util.Set;

public class Assignment_87 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("techno");
		hs.add("credits");
		hs.add("rushikesh");
		hs.add("krishna");
		
		System.out.println(getnames(hs));
	}

	static HashSet<String> getnames(Set<String> hs) {
		HashSet<String> list = new HashSet<String>();
		for (String name : hs) {
			char ch = name.charAt(name.length() - 1);
			if ("aeiou".contains(Character.toString(ch))) {
				list.add(name);
			}
		}
		return list;
	}
}
