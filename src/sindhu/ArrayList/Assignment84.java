/*Return the list of unique names from given Array. [IMP]

String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
output : ["Harish", "Pramod", "Krishna", "Jeet"]*/

package sindhu.ArrayList;

import java.util.*;

public class Assignment84 {
	public static void main(String[] args) {
		Assignment84 a84 =new Assignment84();
		String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
		List<String> sl = Arrays.asList(arr);
		List<String> uniStrList = a84.getUniqueStrings(sl);
		System.out.println("The output unique Strings are: "+uniStrList);
	}
	
	public List<String> getUniqueStrings(List<String> inStrLst){
		List<String> outUniStr = new ArrayList<>();
		for(int i=0; i<inStrLst.size(); i++) {
			String str = inStrLst.get(i);
			if(inStrLst.indexOf(str)== inStrLst.lastIndexOf(str)) {
				outUniStr.add(str);
			}else if(i==inStrLst.indexOf(str)) {
				outUniStr.add(str);
			}
		}
		return outUniStr;
	}
}
