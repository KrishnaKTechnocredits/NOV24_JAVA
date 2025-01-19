package prem;

import java.util.*;

public class Assignment76 {
	
	boolean getName(String name) {
		boolean upperCaseCount= false;
		boolean digitCount=false;
		boolean lowerCaseCount=false;
		boolean spCount=false;
	for(int j=0; j<name.length();j++) {
		char ch = name.charAt(j);
	if(Character.isUpperCase(ch)) {
		upperCaseCount =true;
	}else if(Character.isLowerCase(ch)){
		lowerCaseCount =true;
	}else if(Character.isDigit(ch)){
		digitCount =true;
	}else if (ch == '_' || ch == '!' ||ch == '#' || ch=='$'){
			spCount = true;
	}
	}
	if(upperCaseCount== true && lowerCaseCount== true && digitCount==true && spCount==true) {
		return true;
	}
	return false;
	}

	
	ArrayList<String> getListNameWithAllCases(String[] listName){
		ArrayList<String> nameWithAllCases = new ArrayList<String>();
		for(int i=0; i< listName.length;i++){
			String name= listName[i];
			boolean flag = getName(name);
			if(flag) {
				nameWithAllCases.add(name);	
			}
		}
		return nameWithAllCases;
	}
	
	
	public static void main(String[] args) {
		String[] arr = {"TechnOCrediTs", "TEch1n_o##", "Credits", "Tit!iksHa", "PUNE1#"};
		Assignment76 assign76 = new Assignment76();
		ArrayList<String> output = assign76.getListNameWithAllCases(arr);
		System.out.println(output);
	}
}
