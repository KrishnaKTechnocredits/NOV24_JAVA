//Return the list of duplicate names from given Array. [IMP]
//String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
//output : ["Harish", "Krishna"]

package titiksha.Collections.Arraylist;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Removeduplicatestring {
	List<String> getduplicatestring(String[] arr) {
		List<String> name = Arrays.asList(arr);
		System.out.println("Input: " + name);
		List<String> outputname = new ArrayList<String>();
		for (int i = 0; i < name.size(); i++) {
			String value = name.get(i);
			
			int index = name.indexOf(value);
			int lastindex = name.lastIndexOf(value);
			if (index!=lastindex && i==index) {
				outputname.add(value);
				
			}

		}
		return outputname;

	}
//Assignment - 84: 12th Jan
//Return the list of unique names from given Array. [IMP]
//String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
//output : ["Harish", "Pramod", "Krishna", "Jeet"]

	
	List<String> getuniquename(String[] arr) {
		List<String> name = Arrays.asList(arr);
		System.out.println("Input: " + name);
		List<String> outputname = new ArrayList<String>();
		for (int i = 0; i < name.size(); i++) {
			String value = name.get(i);
			if (!outputname.contains(value)) {//checks if outname already contain same string ,if it is then do not add 
				outputname.add(value);
				
			}

		}
		return outputname;

	}

	public static void main(String[] args) {
		Removeduplicatestring removeduplicatestring = new Removeduplicatestring();
		String[] arr = { "Harish", "Pramod", "Harish", "Krishna", "Jeet", "Krishna" };
		List<String>output=removeduplicatestring.getduplicatestring(arr);
		System.out.println(output);
		List<String>output2=removeduplicatestring.getuniquename(arr);
		System.out.println(output2);
	}
}
