package swapnilArrayList;

import java.util.ArrayList;
import java.util.List;

public class Assignment83 {
	
	List<String> getListFromArray(String[] str){
		List<String> originalList = new ArrayList<String>();
		for(int i=0;i<str.length;i++) {
			originalList.add(str[i]);
		}
		return originalList;
	}
	 List<String> getListOfDuplicateNumbers(String[] str){
		 List<String> originalList = getListFromArray(str);
		 
		 List<String> duplicateNumber = new ArrayList<String>();
		 for(int i=0;i<str.length;i++) {
			 String word =str[i];
			 if(originalList.indexOf(word)!=originalList.lastIndexOf(word)) {
				 if(!duplicateNumber.contains(word)) {
					 duplicateNumber.add(word);
				 }
			 }
		 }
		 return duplicateNumber;
	 }

	
	public static void main(String[] str) {
		String[] str1 = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
		Assignment83 a = new Assignment83();
		List<String> output = a.getListOfDuplicateNumbers(str1);
		System.out.println(output);
	}
	

}