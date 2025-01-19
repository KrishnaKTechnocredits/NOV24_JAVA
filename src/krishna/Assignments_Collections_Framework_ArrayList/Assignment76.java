package Assignments_Collections_Framework_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment76 {
	
	boolean getDigitStatus(String str) {
		boolean flag = false;
		for(int i = 0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				return true;
			}
		}
		return flag;
	}
	
	boolean getUpperCaseStatus(String str) {
		boolean flag = false;
		for(int i = 0;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				flag = getDigitStatus(str);
			}
		}
		return flag;
	}
	
	boolean getLowerCaseStatus(String str) {
		boolean flag = false;
		for(int i = 0;i<str.length();i++) {
			if(Character.isLowerCase(str.charAt(i))) {
				flag = getUpperCaseStatus(str);
			}
		}
		return flag;
	}
	
	boolean getSpecialCharStatus(String str) {
		boolean flag = false;
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i) == '!' || str.charAt(i) == '#' || str.charAt(i) == '$' || str.charAt(i) == '_') {
				flag = getLowerCaseStatus(str);
			}
		}
		return flag;
	}

	List<String> getList(String[] arr){
		List<String> list = new ArrayList<String>();
		for(int i  = 0;i<arr.length;i++) {
			if(getSpecialCharStatus(arr[i])== true) {
				list.add(arr[i]);
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		String[] arr = {"TechnOCrediTs", "TEch1n_o##", "Credits", "Tit!iks5Ha", "PUNE1#"};
		System.out.println(new Assignment76().getList(arr));
	}
}
