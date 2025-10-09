package roshan.Set;

import java.util.*;

public class FindUniqueSetOfNameandPrintFirstandLastNameOFList {
	void getFirstandLastNameOFList(String[] arr) {
		Set<String> list = new LinkedHashSet<>(Arrays.asList(arr));
		List<String> arrList = new ArrayList<>(list);
		System.out.println(list + " First name of the list is -> " + arrList.get(0) + " Last name of the list is "
				+ arrList.get(arrList.size() - 1)); // add first and last index method carefully as directly added in sop
	}

	public static void main(String[] args) {
		String[] arr = { "Maulik", "Kanani", "Maulik", "Pune", "India", "Pune" };
		FindUniqueSetOfNameandPrintFirstandLastNameOFList finduniquesetOfnameandprintfirstandlastnameoflist = new FindUniqueSetOfNameandPrintFirstandLastNameOFList();
		finduniquesetOfnameandprintfirstandlastnameoflist.getFirstandLastNameOFList(arr);

	}
}

/*
 * Assignment - 90 : 16th jan I am having students name in the array, I want to
 * get the unique set of names and wants to print first and last name of the
 * list.
 * 
 * String[] arr = {"Maulik", "Kanani", "Maulik", "Pune", "India", "Pune"};
 * output : [Maulik, Kanani, Pune, India] First name of the list is -> Maulik
 * Last name of the list is -> India
 */
