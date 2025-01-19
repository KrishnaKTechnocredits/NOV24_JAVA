package ashwini.ArrayProgram;

import java.util.Arrays;

/*
 Assignment - 62 : 22nd Dec'2024 [20 min] [IMP]
reverse each string in array and place at in reverse order.

input : {"Tech", "aashvi", "Credits", "Ansh"}
output : [hsnA,stiderC, ivhsaa, hceT] */
public class Assignment62 {
	
	String getRevWord(String word) {
		String output="";
		for(int i=word.length()-1;i>=0;i--) {
			output += word.charAt(i);
		}
		 return output;
	}
	String[] getRevWordRevOrderArray(String[] arr) {
		String [] output = new String[arr.length];
		for(int i=0,j=arr.length-1;i<arr.length;i++,j--) {
			 output[j]= getRevWord(arr[i]);
		}
		 return output;
	}

	public static void main(String[] args) {
		Assignment62 a62 =new Assignment62();
		String[] arr={"Tech", "Aashvi", "Credits", "Ansh"};
		String[] revArray=a62.getRevWordRevOrderArray(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(revArray));

	}

}
