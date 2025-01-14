/*
 *Assignment - 84: 12th Jan
Return the list of unique names from given Array. [IMP]

String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
output : ["Harish", "Pramod", "Krishna", "Jeet"]
 */
package imran.CollectionFramework.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment84_ReturnListOfUniqueNames {

	List<String> getUniqueName(String[] data)
	{
		List<String> arr = Arrays.asList(data);
		List<String> uniqueNames = new ArrayList<String>();
		for(int i =0; i<arr.size();i++)
		{
			String name = arr.get(i);
			if(!uniqueNames.contains(name))
			{
				uniqueNames.add(name);
			}
		}
		return uniqueNames;
	}
	
	public static void main(String[] args) {
		Assignment84_ReturnListOfUniqueNames assignment84_ReturnListOfUniqueNames_1 = new Assignment84_ReturnListOfUniqueNames();
		String[] str = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
		System.out.println("The Given Array is :" + Arrays.toString(str));
		List<String> uniqueNames = assignment84_ReturnListOfUniqueNames_1.getUniqueName(str);
		System.out.println("The Unique list of name is "+ uniqueNames);
	}
}
