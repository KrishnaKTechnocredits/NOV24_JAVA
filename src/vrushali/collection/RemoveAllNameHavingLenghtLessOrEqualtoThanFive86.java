package vrushali.collection;
//Assignment - 86: 14th Jan
//
//Remove all the names from list having length less than or equal to 5 characters. 
//
//input : ["Aaruhi","Ansh", "Akanksha", "Eva", "Kishor"]
//output : ["Aaruhi", "Akanksha", "Kishor"]

import java.util.ArrayList;
import java.util.List;

public class RemoveAllNameHavingLenghtLessOrEqualtoThanFive86 {
	List<String> removeNamesHavingLengthLessOrEqual5(List<String> nameList) {
		// We can do this 2 ways 1.Simple for loop 2.foreach loop
		// but for foreach loop we can not add or remove elements from same
		// list.We have take another list for it; But in simple for loop we required
		// only 1 list

//    2.Using Enhance for loop		
//		List<String> nameList1 = new ArrayList<String>(nameList);
//		for (String name : nameList) {
//			if (name.length() <= 5) {
//				nameList1.remove(name);
//			}
//		}
		// 1.Using simplr for loop
		//after each remove, index of for loop increased but value adjust upward,
		//Adjust index after removal to avoid skipping elements.
		//make sure use index-- whenever remove opetaion applis on for loop
		String name;
		for (int i = 0; i < nameList.size(); i++) {
			name = nameList.get(i);
			if (name.length() <= 5) {
				nameList.remove(name);
				i--; 
			}
		}
		return nameList;
	}

	public static void main(String[] args) {
		RemoveAllNameHavingLenghtLessOrEqualtoThanFive86 rs = new RemoveAllNameHavingLenghtLessOrEqualtoThanFive86();
		List<String> nameList = new ArrayList<String>();
		nameList.add("Aaruhi");
		nameList.add("Ansh");
		nameList.add("Ansh");
		nameList.add("Ansh");
		nameList.add("Ansh");
		nameList.add("Ansh");
		nameList.add("Ansh");
		nameList.add("Akanksha");
		nameList.add("Eva");
		nameList.add("Kishor");
		nameList.add("errrrrr");
		nameList.add("tttttt");
		nameList.add("Kyyyyyishor");
		List<String> nameList1 = rs.removeNamesHavingLengthLessOrEqual5(nameList);
		System.out.println(nameList1);
	}

}
