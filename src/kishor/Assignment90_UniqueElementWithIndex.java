package kishor;
//I am having students name in the array, I want to get the unique set of names and wants to print first and last name of the list.

//String[] arr = {"Maulik", "Kanani", "Maulik", "Pune", "India", "Pune"};
//output : [Maulik, Kanani, Pune, India]
//          First name of the list is -> Maulik
//          Last name of the list is -> India

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Assignment90_UniqueElementWithIndex {

	public static void main(String[] args) {
		String[] arr = { "Maulik", "Kanani", "Maulik", "Pune", "India", "Pune" };
		List<String> list = new ArrayList<String>(Arrays.asList(arr));

		Set<String> set = new LinkedHashSet<String>(list);
		System.out.println(set);
		List<String> list1 = new ArrayList<String>(set);
		System.out.println("First name of the list is" + "->" + list1.get(0));
		System.out.println("Last name of the list is ->" + list1.get(list1.size() - 1));
	}
}
