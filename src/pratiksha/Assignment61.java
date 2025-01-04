package pratiksha;

import java.util.Arrays;

public class Assignment61 {
/*	Assignment - 61 : 22nd Dec'2024 [20 min] [IMP]
	reverse each string in array at the same place.

	input : {"tech", "aashvi", "credits"}
	output : [hcet, ivhsaa, stiderc]*/
	
	String getRevWord(String word) {
		String output= "";
		for(int index=word.length()-1; index>=0;index--) {
			output= output+word.charAt(index);
		}
		return output;
	}
	String[] getRevWordArray(String[]input) {
		String[] output= new String[input.length];
		for (int index=0; index<input.length;index++) {
			output[index]= getRevWord(input[index]);
		}
		return output;
	}
	public static void main(String[] args) {
		Assignment61 assign60=new Assignment61();
		String[] arr = {"tech", "aashvi", "credits"};
		String[] revArr=assign60.getRevWordArray(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(revArr));
	}
	

}
