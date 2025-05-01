package kishor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Remove all the names from list having length less than or equal to 5 characters. 
//input : ["Aaruhi","Ansh", "Akanksha","jeet", "Eva", "Kishor"]
//output : ["Aaruhi", "Akanksha", "Kishor"]

public class Assignment86_RemoveName {

	List<String> getUpdatedList(String[] arr) {
		List<String> list = new ArrayList<String>(Arrays.asList(arr));
		for (int i = 0; i < list.size(); i++) {
			String name = list.get(i);
			if (name.length() <= 5) {
				list.remove(name);
				i--; // treatment to last index again, as that was shifted
			}
		}
		return list;
	}

	public static void main(String[] args) {
		String[] arr = { "Aaruhi", "Ansh", "Akanksha", "jeet", "Eva", "Kishor" };
		Assignment86_RemoveName assignment87 = new Assignment86_RemoveName();
		List<String> ans = assignment87.getUpdatedList(arr);
		System.out.println(ans);
	}
}
