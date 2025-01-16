package kishor;
//Return the list of duplicate names from given Array. [IMP]
//
//String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
//output : ["Harish", "Krishna"]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment83_ArrayListDuplicateString {
	
	List<String> getDuplicateStringList(String[] arr){
		List<String> originalList = Arrays.asList(arr);
		List<String> duplicateList = new ArrayList<String>();
		for(int i=0;i<originalList.size();i++) {
			String name = originalList.get(i);
			if(originalList.indexOf(name)!=originalList.lastIndexOf(name)) {
				if(!duplicateList.contains(name)) {
					duplicateList.add(name);
				}
			}
		}
		return duplicateList;
		
	}
	
	public static void main(String[] args) {
		String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
		Assignment83_ArrayListDuplicateString assignment83 = new Assignment83_ArrayListDuplicateString();
		List<String> name=assignment83.getDuplicateStringList(arr);
		System.out.println(name);
	}
}
