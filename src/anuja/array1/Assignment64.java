package anuja.array1;

import java.util.Arrays;

/*
reverse each string in array and place at in reverse order, each word first letter capital and rest in lowercase.

input : {"Tech", "Aashvi", "Credits", "Ansh"}
output : [Hsna,Stiderc, Ivhsaa, Hcet]
 * */
public class Assignment64 {

	public static void main(String[] args) {
		Assignment64 assignment64 = new Assignment64();
		String[] names = {"Tech", "Aashvi", "Credits", "Ansh"};
		System.out.println("Input array is: \n" + Arrays.toString(names));
		System.out.println("----------------------------------------------");
		String[] result = assignment64.getReverseArray(names);
		System.out.println("Output array is: \n" + Arrays.toString(result));
		
	}

	public String[] getReverseArray(String[] names) {
		String[] outputNames = new String[names.length] ;
		for( int i = 0  ; i<names.length ; i++ ) {
			outputNames [i] = getReverseString(names[names.length-1-i]);
		}
		return outputNames;
	}

	public String getReverseString(String strWord) {
		String word = "";
		for(int k = strWord.length()-1 ; k>= 0 ; k--) {
			word+= strWord.charAt(k);
		}
		word = word.toLowerCase();
		
		return word.substring(0,1).toUpperCase() + word.substring(1);
	}
}


