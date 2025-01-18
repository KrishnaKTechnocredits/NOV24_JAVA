package ravindra;

import java.util.ArrayList;
import java.util.List;

public class Assignment_84 {
	public static void main(String[] args) {
		String[] arr = { "Harish", "Pramod", "Harish", "Krishna", "Jeet", "Krishna" };
		Assignment_84 list = new Assignment_84();
		List<String> uniqlist = list.getUniqName(arr);
		System.out.println(uniqlist);
	}

	List<String> getUniqName(String[] input) {
		List<String> list = new ArrayList<>();
		List<String> uniqlist = new ArrayList<>();
		for (String name : input) {
			list.add(name);
		}

		for (int i = 0; i < list.size(); i++) {
			if (!uniqlist.contains(list.get(i))) {
				uniqlist.add(list.get(i));
			}
		}
		return uniqlist;
	}
}
