package reshma;
/* Return the list of duplicate names from given Array. [IMP]
  Input : String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
  Output : ["Harish", "Krishna"] */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment83_ReturnDuplicateNames {
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
		Assignment83_ReturnDuplicateNames a83 = new Assignment83_ReturnDuplicateNames();
		String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};		
		List<String> ans=a83.getDuplicateStringList(arr);
		System.out.println("Output: " +ans);
		}
}
