package siddharth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/*
Assignment - 90 : 16th jan
I am having students name in the array, I want to get the unique set of names and wants to print first and last name of the list.

String[] arr = {"Maulik", "Kanani", "Maulik", "Pune", "India", "Pune"};
output : [Maulik, Kanani, Pune, India]
          First name of the list is -> Maulik
          Last name of the list is -> India
 */
public class Assignment90 {
	
	List<String> getUniqueElements(String[] input){
		LinkedHashSet<String> elements = new LinkedHashSet<String>(Arrays.asList(input));
		List<String> elements2 = new ArrayList<String>(elements);
			System.out.println("First name of the list is -> "+elements2.get(0));
			System.out.println("Last name of the list is -> "+elements2.get(elements2.size()-1));
			return elements2;
	}
	
	public static void main(String[] args) {
		String[] arr = {"Maulik", "Kanani", "Maulik", "Pune", "India", "Pune"};
		Assignment90 assignment90 = new Assignment90();
		System.out.println("Output : "+assignment90.getUniqueElements(arr));
	}
}