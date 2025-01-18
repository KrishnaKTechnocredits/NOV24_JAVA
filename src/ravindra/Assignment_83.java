package ravindra;

import java.util.ArrayList;
import java.util.List;

public class Assignment_83 {
	public static void main(String[] args) {
		String[] arr = { "Harish", "Pramod", "Harish", "Krishna", "Jeet", "Krishna" };
		Assignment_83 list=new Assignment_83();
		List<String> duplicatename = list.getDuplicatename(arr);
		System.out.println(duplicatename);
	}

	List<String> getDuplicatename(String[] input) {
		List<String> list = new ArrayList<>();
		List<String> duplicatelist = new ArrayList<>();
		for (String name : input) {
			list.add(name);
		}

		for (int i = 0; i < list.size(); i++) {
			if (list.indexOf(list.get(i)) != list.lastIndexOf(list.get(i))) {
				if (!duplicatelist.contains(list.get(i))) {
					duplicatelist.add(list.get(i));
				}
			}
		}
		return duplicatelist;
	}
}
