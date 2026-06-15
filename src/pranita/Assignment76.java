package pranita;

import java.util.ArrayList;
import java.util.*;

public class Assignment76 {
	
	public void getString(String[] arr) {
		List<String> alStr =new ArrayList<String>();
		for(int i=0; i<arr.length; i++) {
			String str = arr[i];
			if(isUpperCase(str) && isLowerCase(str) && isDigit(str) && isSpecialChar(str)) {
				alStr.add(str);
			}
		}
		System.out.println("The output String ArrayList is: "+ alStr);
	}
	
	public boolean isUpperCase(String str) {
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isLowerCase(String str) {
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isLowerCase(ch)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isDigit(String str) {
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isSpecialChar(String str) {
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch=='-' || ch=='!' || ch=='$' || ch=='#') {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Assignment76 assign76 = new Assignment76();
		String[] arr = {"TechnOCrediTs", "TEch1n_o##", "Credits", "T1t!iksHa", "PUNE1#"};
		System.out.println("The Input String ArrayList is: "+Arrays.toString(arr));
		assign76.getString(arr);		
	}
}
