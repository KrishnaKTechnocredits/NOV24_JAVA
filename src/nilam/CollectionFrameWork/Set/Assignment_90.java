package nilam.CollectionFrameWork.Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

//I am having students name in the array, I want to get the unique set of names and wants to print first and last name of the list.

public class Assignment_90 {
	
	public static void main(String[] args) {
		String[] arr = {"Maulik", "Kanani", "Maulik", "Pune", "India", "Pune"};
		HashSet<String> namesList=new LinkedHashSet<String>(Arrays.asList(arr));
		List<String> listOfNames=new ArrayList<String>(namesList);
		System.out.println(namesList);
		System.out.println(listOfNames.get(0));
		System.out.println(listOfNames.get(listOfNames.size()-1));
	}

}
