package ravindra;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Assignment_90 {
	public static void main(String[] args) {
		String[] arr = {"Maulik", "Kanani", "Maulik", "Pune", "India", "Pune"};
		Set<String> nameList=new LinkedHashSet<>();
		for(String name:arr) {
			nameList.add(name);
		}
		System.out.println(nameList);
		List<String> names=new ArrayList<>(nameList);
		System.out.println("First name of the list is ->"+names.get(0));
		System.out.println("Last name of the list is ->"+names.get(names.size()-1));
	}
}
