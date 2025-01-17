package swapnil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Assignment90 {
	
	void uniqueNames(String[] str){
		
		Set<String> setOfNames = new LinkedHashSet<String>(Arrays.asList(str)); 
		
		List<String> list = new ArrayList<String>(setOfNames);
		
		System.out.println(list);
		System.out.println("Firstname->"+list.get(0)+" lastname->"+list.get(list.size()-1));
		
		
	}
	public static void main(String[] args) {
		String[] str = {"Maulik", "Kanani", "Maulik", "Pune", "India", "Pune"};
		Assignment90 a = new Assignment90();
		a.uniqueNames(str);
	}
}
