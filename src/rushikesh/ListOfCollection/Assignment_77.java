package rushikesh.ListOfCollection;

import java.util.ArrayList;
import java.util.List;

public class Assignment_77 {

	List<String> getListOfUniqueString(List<String> input) {
		List<String> output = new ArrayList<String>();
		for (int index = 0; index < input.size(); index++) {
			String name = input.get(index);
			int currentIndex = input.indexOf(name);
			int lastIndex = input.lastIndexOf(name);
			if (currentIndex != lastIndex || index>currentIndex) {
				input.remove(lastIndex);
				input.remove(index);
			}
		}
		return input;
	}

	public static void main(String[] args) {
		Assignment_77 assignment_77 = new Assignment_77();
		List<String> input = new ArrayList<String>();
		input.add("Anuja");
		input.add("Fazrana");
		input.add("Nitesh");
		input.add("Fazrana");
		input.add("Krishna");
		input.add("Nitesh");
		input.add("Fazrana");
		input.add("PremLata");
		input.add("Nitesh");
		input.add("Nitesh");
		input.add("Nitesh");
		input.add("Aashvi");
		List<String> output = assignment_77.getListOfUniqueString(input);
		System.out.println(output);
	}
}
