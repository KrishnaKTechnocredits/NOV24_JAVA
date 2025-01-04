package ashwini.ArrayProgram;

import java.util.Arrays;

/*
 Assignment - 63 : 22nd Dec'2024 [20 min] [IMP]
reverse each string in array and place at in reverse order.

input : {"TeCh", "Aashvi", "Credits", "AnsH"}
output : [hsna,stiderc, ivhsaa, hcet]
Note -->All letter should be  in lowercase
 */
public class Assignment63 {
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
			 String word= getRevWord(arr[i]);
			 output[j]=word.toLowerCase();
		}
		 return output;
	}

	public static void main(String[] args) {
		Assignment63 a63 =new Assignment63();
		String[] arr={"TeCh", "Aashvi", "Credits", "AnsH"};
		String[] revArray=a63.getRevWordRevOrderArray(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(revArray));

	}
	

}
