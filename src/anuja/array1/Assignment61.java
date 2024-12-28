package anuja.array1;

import java.util.Arrays;

/*
reverse each string in array at the same place.

input : {"tech", "aashvi", "credits"}
output : [hcet, ivhsaa, stiderc]
 * */
public class Assignment61 {
	
	public String getReverseWord (String names){
		String word = "";	
		for(int j = names.length()-1 ; j>=0; j--) {
			word = word + names.charAt(j);
		}
		return word;
	}

	public String[] getReverseArrayOfString (String[] names) {
		String[] reverseArray = new String[names.length];
		for(int i= 0 ; i<names.length ; i++) {
			reverseArray [i] = getReverseWord(names[i]);
		}
		
		return reverseArray;
	}	
		

	public static void main(String[] args) {
		Assignment61 assignment61 = new Assignment61();
		String[] names = {"tech", "aashvi", "credits"};
		System.out.println("Input array is:");
		System.out.println(Arrays.toString(names));
		System.out.println("-------------------------");
		System.out.println("Output array is: ");
		String[] output = assignment61.getReverseArrayOfString(names);
		System.out.println(Arrays.toString(output));
		
	}
}	