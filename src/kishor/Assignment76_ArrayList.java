package kishor;

import java.util.ArrayList;
import java.util.List;
//return the list of names having atleast one uppercase, one lowercase, 
//one digit and one special character (_, !, #, $) in the name.
//String[] arr = {"TechnOCrediTs", "TEch1n_o##", "Credits", "Tit!iksHa", "PUNE1#"};
//output : {"TEch1n_o##"}

public class Assignment76_ArrayList {

	boolean isCompleteString(String str) {
		boolean Ucase = false;
		boolean Lcase = false;
		boolean Digit = false;
		boolean Schar = false;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				Ucase = true;
			} 
			else if (Character.isLowerCase(ch)) {
				Lcase = true;
			} 
			else if (Character.isDigit(ch)) {
				Digit = true;
			} 
			else if (ch == '_' || ch == '!' || ch == '#' || ch == '$') {
				Schar = true;
			}
		}
		return Ucase&&Lcase&&Digit&&Schar; //&&operator for boolean addition
	}

	List<String> getCompleteString(String[] arr) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < arr.length; i++) {
			if (isCompleteString(arr[i])) {
				list.add(arr[i]);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		String[] arr = { "TechnOCrediTs", "TEch1n_o##", "Credits", "Tit!iksHa", "PUNE1#" };
		Assignment76_ArrayList assignment76 = new Assignment76_ArrayList();
		List<String> ans = assignment76.getCompleteString(arr);
		System.out.println(ans);
	}
}
