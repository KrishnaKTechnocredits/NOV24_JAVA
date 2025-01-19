package anuja.collection;

import java.util.ArrayList;
import java.util.Arrays;

/*return the list of names having atleast one uppercase, one lowercase, one digit and one special character (_, !, #, $) in the name.

String[] arr = {"TechnOCrediTs", "TEch1n_o##", "Credits", "T1St!iksHa", "PUNE1#"};
output : {"TEch1n_o##", "T1t!iksHa"}*/
public class Assignment76 {

	public static void main(String[] args) {
		Assignment76 assignment76 = new Assignment76();
		String[] names = {"TechnOCrediTs", "TEch1n_o##", "Credits", "T1t!iksHa", "PUNE1#"};
		System.out.println("Input Arrya is: " +Arrays.toString(names) +"\n");
		System.out.println("return the list of names having atleast one uppercase, one lowercase, one digit and one \n special character (_, !, #, $) in the name \n");
		ArrayList<String> ls = assignment76.processData(names);
		System.out.println("Output is : \n " +ls);
	}

	public ArrayList<String> processData(String[] names) {
		ArrayList<String> list = new ArrayList<String>();
		Boolean flag = true;
		for(int i = 0; i<names.length ; i++) {
			if(isUpperCase(names[i]) && isLowerCase(names[i]) && isDigit(names[i]) && isSpeicalCharPresent(names[i])) {
				list.add(names[i]);
			}
		}
		return list;
	}
	
	
	public boolean isUpperCase(String name) {
		int upperCount = 0 ;
		for(int i = 0 ; i<name.length() ; i++) {
			if(Character.isUpperCase(name.charAt(i))){
				upperCount++;
			}
		}
		if(upperCount >= 1) {
			return true;
		}
		
		return false;
	}
	
	public boolean isLowerCase(String name) {
		int lowerCount = 0 ;
		for(int i = 0 ; i<name.length() ; i++) {
			if(Character.isLowerCase(name.charAt(i))){
				lowerCount++;
			}
		}
		if(lowerCount >= 1) {
			return true;
		}
		
		return false;
	}
	
	public boolean isDigit(String name) {
		int digitCount = 0 ;
		for(int i = 0 ; i<name.length() ; i++) {
			if(Character.isDigit(name.charAt(i))){
				digitCount++;
			}
		}
		if(digitCount >= 1) {
			return true;
		}
		
		return false;
	}
	
	//_, !, #, $
	
	public boolean isSpeicalCharPresent(String name) {
		int speicalCharCount = 0 ;
		for(int i = 0 ; i<name.length() ; i++) {
			if(name.charAt(i)=='_' || name.charAt(i)=='!' ||  name.charAt(i)=='#' ||  name.charAt(i)=='$' ){
				speicalCharCount++;
			}
		}
		if(speicalCharCount >= 1) {
			return true;
		}
		
		return false;
	}
}
