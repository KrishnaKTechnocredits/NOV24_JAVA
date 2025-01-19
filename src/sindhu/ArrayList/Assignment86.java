/*Remove all the names from list having length less than or equal to 5 characters. 

input : ["Aaruhi","Ansh", "Akanksha", "Eva", "Kishor"]
output : ["Aaruhi", "Akanksha", "Kishor"]
*/

package sindhu.ArrayList;

import java.util.*;

public class Assignment86 {
	public static void main(String[] args) {
		String[] input = {"Aaruhi","Ansh", "Akanksha", "Eva", "Kishor", "Rohan"};
		List<String> strLs = new ArrayList<String>(Arrays.asList(input));
		System.out.println("The input array list is: "+strLs);
		List<String> outLs = getStrLessThan5Length(strLs); 
		System.out.println("The output array list is: "+outLs);
	}
	
	public static List<String> getStrLessThan5Length(List<String> strLs){
		for(int i=0; i<strLs.size(); i++) {
			String str = strLs.get(i);
			if(str.length()<=5) {
				strLs.remove(i);
			}
		}
		return strLs;
	}
}
