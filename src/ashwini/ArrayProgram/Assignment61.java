package ashwini.ArrayProgram;

import java.util.Arrays;

/*
 Assignment - 61 : 22nd Dec'2024 [20 min] [IMP]
reverse each string in array at the same place.

input : {"tech", "aashvi", "credits"}
output : [hcet, ivhsaa, stiderc]
 */
public class Assignment61 {
	String getRevWOrd(String word) {
		String output="";
		for (int index=word.length()-1;index>=0;index--) {
			output=output + word.charAt(index);
		}
		return output;
	}
	String[] getRevWordArray(String[] arr) {
		String[] output=new String[arr.length];
		for(int index=0;index<arr.length;index++) {
			 output[index]=getRevWOrd(arr[index]);
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment61 a61= new Assignment61();
		String[] input={"tech", "aashvi", "credits"};
		String[] revArray =a61.getRevWordArray(input);
		System.out.println(Arrays.toString(input));
		System.out.println(Arrays.toString(revArray));
	}

}
