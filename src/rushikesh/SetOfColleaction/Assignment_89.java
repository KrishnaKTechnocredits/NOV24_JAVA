package rushikesh.SetOfColleaction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Assignment_89 {

	List<String> getSetOfUniqueNames(String[] arr) {
		Set<String> hashSet = new LinkedHashSet<String>(Arrays.asList(arr));
		List<String> list = new ArrayList<String>(hashSet);
		return list;
	}

	public static void main(String[] args) {
		Assignment_89 assignment_89 = new Assignment_89();
		String[] arr = { "Maulik", "Kanani", "Maulik", "Pune", "India", "Pune" };
		List<String> output = assignment_89.getSetOfUniqueNames(arr);
		System.out.println(output);
		System.out.println("First name of the list is ->" + output.get(0));
		System.out.println("Last name of the list is ->" + output.get(output.size() - 1));
	}
}
