package reshma;
/* Return the list of unique names from given Array. [IMP]
  Input : String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
  Output : ["Harish", "Pramod", "Krishna", "Jeet"] */

import java.util.ArrayList;
import java.util.List;

public class Assignment84_ReturnUniqueNames {
	List<String> getUniqueList(String[] arr) {
		List<String> uniqueList = new ArrayList<String>();
		for (int i = 0; i < arr.length; i++) {
			String name = arr[i];
			if (!uniqueList.contains(name)) {
				uniqueList.add(name);
			}
		}
		return uniqueList;
	}

	public static void main(String[] args) {
		String[] arr = { "Harish", "Pramod", "Harish", "Krishna", "Jeet", "Krishna" };
		Assignment84_ReturnUniqueNames a84 = new Assignment84_ReturnUniqueNames();
		List<String> ans = a84.getUniqueList(arr);
		System.out.println("Output: " + ans);
		}
}
