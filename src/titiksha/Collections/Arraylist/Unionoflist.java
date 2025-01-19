//Remove duplicate from 2 list, and return all the unique elements from both list. 
//input : [10, 20, 30, 40]
//        [20,30,60,70,80,90,100,101,44,55,66,77]
//output : [10,20,30,40,60,70,80,90,100,101,44,55,66,77]		

package titiksha.Collections.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Unionoflist {
	void getunioofarray(Integer[] arr1, Integer[] arr2) {
		System.out.println("List1: "+Arrays.toString(arr1));
		System.out.println("List2: "+Arrays.toString(arr2));
		List<Integer> ar1 = new ArrayList<Integer>(Arrays.asList(arr1));
		List<Integer> ar2 = new ArrayList<Integer>((Arrays.asList(arr2)));
		ar2.removeAll(ar1);// remove common elements from list2
		ar1.addAll(ar2);// union of ar1and arr2
		System.out.println("Output is : "+ar1);
		System.out.println("---------------------");
	}
	
//Assignment - 86: 14th Jan
	//Remove all the names from list having length less than or equal to 5 characters. 
//	input : ["Aaruhi","Ansh", "Akanksha", "Eva", "Kishor"]
//	output : ["Aaruhi", "Akanksha", "Kishor"]

	void removeLengthMore5(String[] arr1) {
		List<String> ar1 = new ArrayList<String>(Arrays.asList(arr1));
		System.out.println("Input is: "+Arrays.toString(arr1));
		for (int i = 0; i < ar1.size(); i++) {
			String num = ar1.get(i);
			if (num.length() <= 5) {
				ar1.remove(num);//removing element having length lower than 5
			}
		}
		System.out.println("Output is: "+ar1);
	}

	public static void main(String[] args) {
		Unionoflist unionoflist = new Unionoflist();
		Integer[] arr1 = { 10, 20, 30, 40 };
		Integer[] arr2 = { 20, 30, 60, 70, 80, 90, 100, 101, 44, 55, 66, 77 };
		unionoflist.getunioofarray(arr1, arr2);
		
		String[] output={"Aaruhi","Ansh", "Akanksha", "Eva", "Kishor"};
		unionoflist.removeLengthMore5(output);
	}
}
