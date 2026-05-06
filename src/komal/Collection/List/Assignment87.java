//from given set return all the names whicich ends with vowels

package komal.Collection.List;

import java.util.HashSet;
import java.util.Set;

public class Assignment87 {

	Set<String> getList() {
		Set<String> list = new HashSet<String>();
		Set<String> list2 = new HashSet<String>();
		list.add("techno");
		list.add("credit");
		list.add("rushikesh");
		list.add("krishna");
		list.add("demo");
		String voewl = "aeiou";
		for (String name : list) {
			String ch = Character.toString(name.charAt(name.length() - 1));
			if (voewl.contains(ch)) {
				list2.add(name);
			}
		}
		return list2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> list = new Assignment87().getList();
		System.out.print("list of the names which ends with vowels => " + list);
	}

}
