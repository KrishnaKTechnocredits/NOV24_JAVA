 //Assignment - 84: 12th Jan
//Return the list of unique names from given Array. [IMP]
//
//String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
//output : ["Harish", "Pramod", "Krishna", "Jeet"]


package pratiksha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment84 {
	
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
		Assignment84 assignment84 = new Assignment84();
		System.out.println(assignment84.getUniqueString(arr));
	}
}
