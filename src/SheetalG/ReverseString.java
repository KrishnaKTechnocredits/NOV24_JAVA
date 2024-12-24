/*Assignment - 61 : 22nd Dec'2024 [20 min] [IMP]
reverse each string in array at the same place.

input : {"tech", "aashvi", "credits"}
output : [hcet, ivhsaa, stiderc]*/

package SheetalG;

import java.util.Arrays;

public class ReverseString {
	
	public String getReverseString(String str) {//tech
		String outputReverse = " ";
		for(int index=str.length()-1;index>=0;index--) {
			char ch =str.charAt(index);
			outputReverse = outputReverse+ ch;
		}
		return outputReverse;
	}
	
	public void printReverseString(String[] input) {
		String[] newInput = new String[input.length];
		for(int index=0;index<input.length;index++) {
			newInput[index]=getReverseString(input[index]);
		}
		System.out.println(Arrays.toString(newInput));
	}
	
	public static void main(String[] args) {
		ReverseString reverseString =new ReverseString();
		String[] input = {"tech", "aashvi", "credits"};
		System.out.println(Arrays.toString(input));
		reverseString.printReverseString(input);
	}

}
