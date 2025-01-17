package ashwini.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 Assignment - 76 : 11th Jan
return the list of names having atleast one uppercase, one lowercase, one digit and one special character (_, !, #, $) in the name.

String[] arr = {"TechnOCrediTs", "TEch1n_o##", "Credits", "Ti1t!iksHa", "PUNE1#"};
output : {"TEch1n_o##", "Tit!iksHa"}

 */
public class Assignment76 {
	boolean isUppercase(String name) {
		for(int i=0;i<name.length();i++) {
			char c= name.charAt(i);
			if(Character.isUpperCase(c)) {
				return true;
			}
		}
		return false;
	}
	boolean isLowercase(String name) {
			for(int i=0;i<name.length();i++) {
				char c= name.charAt(i);
				if(Character.isLowerCase(c)) {
					return true;
				}
			}
			return false;
	}
	boolean isDigit(String name) {
		for(int i=0;i<name.length();i++) {
			char c= name.charAt(i);
			if(Character.isDigit(c)) {
				return true;
			}
		}
		return false;
	}
	boolean isSpecialCharacter(String name) {
		String specialChar="_!#$";
		for(int i=0;i<name.length();i++) {
			char c= name.charAt(i);
			if(specialChar.indexOf(c) >= 0) {
				return true;
			}
		}
		return false;
	}
	List<String> getListOfNames(ArrayList<String> listOfNames){
		List<String> listOfNames1=new ArrayList<String>();
		for(int i=0;i<listOfNames.size();i++) {
			String name=listOfNames.get(i);
			if(isUppercase(name)&&isLowercase(name)&&isDigit(name)&&isSpecialCharacter(name)) {
				listOfNames1.add(name);
			}
		}
		return listOfNames1;
	}
	public static void main(String[] args) {
		Assignment76 a76=new Assignment76();
		String[] arr= {"TechnOCrediTs", "TEch1n_o##", "Credits", "Ti1t!iksHa", "PUNE1#"};
		ArrayList<String> listOfNames = new ArrayList<String>(Arrays.asList(arr));
		List<String> output= a76.getListOfNames(listOfNames);
		System.out.println("Output: "+ output);
	}

}
