/*Return the list of duplicate names from given Array. [IMP]

String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
output : ["Harish", "Krishna"]*/

package sindhu.ArrayList;

import java.util.*;
//import java.util.List;

public class Assignment83 {
	
	public List<String> getDupList(List<String> sl) {
		List<String> dupStr = new ArrayList<>();
		for(int i=0; i<sl.size(); i++) {
			String str = sl.get(i);
			if(sl.indexOf(str)!= sl.lastIndexOf(str) && i == sl.indexOf(str)) {
				dupStr.add(str);
			}
		}
		return dupStr;
	}
	
	public static void main(String[] args) {
		String[] strArr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
		List<String> sl = Arrays.asList(strArr);
		Assignment83 assign83 = new Assignment83();
		List<String> dupStr = assign83.getDupList(sl);
		System.out.println("The duplicate Strings in given array are: "+dupStr);
	}
}
