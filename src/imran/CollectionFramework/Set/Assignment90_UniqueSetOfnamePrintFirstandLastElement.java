/*
Assignment - 90 : 16th jan
I am having students name in the array, I want to get the unique set of names and wants to print first and last name of the list.

String[] arr = {"Maulik", "Kanani", "Maulik", "Pune", "India", "Pune"};
output : [Maulik, Kanani, Pune, India]
          First name of the list is -> Maulik
          Last name of the list is -> India	
*/

package imran.CollectionFramework.Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Assignment90_UniqueSetOfnamePrintFirstandLastElement {

	void getUniqueElementList(String[] data)
	{
		Set<String> hs = new LinkedHashSet<String>(Arrays.asList(data));
		List<String> list = new ArrayList<String>(hs);
		System.out.println("The Set of Unique Element are :" + hs);
		System.out.println("The First Element of List : "+ list.get(0));
		System.out.println("The Last Element of List : "+ list.get(list.size()-1));
	}
	
	public static void main(String[] args) {
		String[] arr = {"Maulik", "Kanani", "Maulik", "Pune", "India", "Pune"};
		System.out.println("The GivenList is : " + Arrays.toString(arr));
		Assignment90_UniqueSetOfnamePrintFirstandLastElement assignment90_1 = new Assignment90_UniqueSetOfnamePrintFirstandLastElement();
		assignment90_1.getUniqueElementList(arr);
	}
}
