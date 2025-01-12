//Assignment - 84: 12th Jan
//Return the list of unique names from given Array. [IMP]
//
//String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
//output : ["Harish", "Pramod", "Krishna", "Jeet"]

package fazrana.arrayList;

import java.util.*;

public class FAssignment84 {
	List<String> getUniqueString(String[] array) {
		List<String> input = Arrays.asList(array);
		List<String> output = new ArrayList<String>();

		for (int i = 0; i < input.size(); i++) {
			String name = input.get(i);
			if (!output.contains(name) && i == input.indexOf(name)) {
				output.add(name);
			}
//			if(input.lastIndexOf(name)==input.indexOf(name)) {
//				if(!output.contains(name)) {
//					output.add(name);
//				}
//			}
		}
		return output;
	}

	public static void main(String[] args) {
		String[] arr = { "Harish", "Pramod", "Harish", "Krishna", "Jeet", "Krishna" };
		System.out.println(Arrays.toString(arr));
		FAssignment84 fassignment84 = new FAssignment84();
		System.out.println(fassignment84.getUniqueString(arr));
	}
}
