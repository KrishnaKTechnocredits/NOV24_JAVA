//
//Assignment - 76 : 11th Jan
//return the list of names having atleast one uppercase, one lowercase, one digit and one special character (_, !, #, $) 
//in the name.
//
//String[] arr = {"TechnOCrediTs", "TEch1n_o##", "Credits", "Tit!iksHa", "PUNE1#"};
//output : {"TEch1n_o##", "Tit!iksHa"}

package komal.Collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment76 {
	boolean checkNamewithValidation(String name) {
		boolean hasUppercase = false, hasLowercase = false, hasDigit = false, specialch = false;
		String specialChar = "(_, !, #, $)";

		for (int i = 0; i < name.length(); i++) {
			char currentCh = name.charAt(i);

			if (Character.isUpperCase(currentCh)) {
				hasUppercase = true;
			} else if (Character.isLowerCase(currentCh)) {
				hasLowercase = true;
			} else if (Character.isDigit(currentCh)) {
				hasDigit = true;
			} else if (specialChar.contains(String.valueOf(currentCh))) {
				specialch = true;
			}
		}

		if (hasUppercase && hasLowercase && hasDigit) {
			return true;
		}
		return false;
	}

	void listOfNames(String[] arrInput) {
		List<String> list = new ArrayList<String>(Arrays.asList(arrInput));
		List<String> newList = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
			boolean validName = checkNamewithValidation(list.get(i));
			if (validName) {
				newList.add(list.get(i));
			}
		}
		System.out.println(newList);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment76 a76 = new Assignment76();
		String[] arr = { "TechnOCrediTs", "TEch1n_o##", "Credits", "Tit!iksHa", "PUNE1#" };
		a76.listOfNames(arr);
	}

}
