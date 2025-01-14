/*
 Assignment - 83: 12th Jan
Return the list of duplicate names from given Array. [IMP]

String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
output : ["Harish", "Krishna"]
 */

package imran.CollectionFramework.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Assignment83_ReturnListOfduplicateNames {

	List<String> getDuplicateName(String[] data)
	{
		List<String> arr = Arrays.asList(data);
		List<String> duplicateNames = new ArrayList<String>();
		for(int i =0; i<arr.size();i++)
		{
			String name = arr.get(i);
			int index = arr.indexOf(name);
			int lastIndex = arr.lastIndexOf(name);
			if(index!= lastIndex && i==index)
			{
				duplicateNames.add(name);
			}
		}
		return duplicateNames;
	}
	
	
	public static void main(String[] args) {
		Assignment83_ReturnListOfduplicateNames assignment83_ReturnListOfduplicateNames_1 = new Assignment83_ReturnListOfduplicateNames();
		String[] str = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
		System.out.println("The Given Array is :" + Arrays.toString(str));
		List<String> duplicateNames = assignment83_ReturnListOfduplicateNames_1.getDuplicateName(str);
		System.out.println(" The Duplicate data are : " + duplicateNames);
	}
}
