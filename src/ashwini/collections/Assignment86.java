package ashwini.collections;

import java.util.ArrayList;
import java.util.Arrays;

/*
 Assignment - 86: 14th Jan

Remove all the names from list having length less than or equal to 5 characters. 

input : ["Aaruhi","Ansh", "Akanksha", "Eva", "Kishor"]
output : ["Aaruhi", "Akanksha", "Kishor"]
 */
public class Assignment86 {
	void getListHavingLessthan5Char(ArrayList<String> al){
		System.out.println("Input: "+al);
		for(int i=0;i<al.size();i++) {
			String name=al.get(i);
			if(name.length() <= 5) {
				al.remove(name);
			}
		}
		System.out.println(al);
	}

	public static void main(String[] args) {
		String[] arr={"Aaruhi","Ansh", "Akanksha", "Eva", "Kishor"};
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(arr));
		Assignment86 a86=new Assignment86();
		a86.getListHavingLessthan5Char(al);
	}

}
