package nilam.CollectionFrameWork.List;

import java.util.ArrayList;
import java.util.List;
//return the list of names having atleast 1 uppercase, 1 lowercase,1 digit and 1 special character (_, !, #, $) in the name.

public class Assignment_76 {

	static List<String> getProcessedNamesList(String[] arr) {
		List<String> processedNamesList = new ArrayList<String>();
		for (int index = 0; index < arr.length; index++) {
			int ucount = 0, lcount = 0, dcount = 0, scount = 0;
			for (int j = 0; j < arr[index].length(); j++) {
				char ch = arr[index].charAt(j);
				if (Character.isUpperCase(ch)) {
					ucount++;
				} else if (Character.isLowerCase(ch)) {
					lcount++;
				} else if (ch == '_' || ch == '!' || ch == '#' || ch == '$') {
					scount++;
				} else if (Character.isDigit(ch)) {
					dcount++;
				}
			}
			if (ucount > 0 && lcount > 0 && dcount > 0 && scount > 0) {
				processedNamesList.add(arr[index]);
		}
	}
		return processedNamesList;
}

	public static void main(String[] args) {

		String[] arr = { "TechnOCrediTs", "TEch1n_o##", "Credits", "Tit!iksHa0", "PUNE1#" };
		List<String> listOfProrcessedElements = Assignment_76.getProcessedNamesList(arr);
		System.out.println(listOfProrcessedElements);
	}
}
