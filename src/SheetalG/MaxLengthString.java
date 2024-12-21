/*Assignment - 57 : 21th Dec'2024 [15 mins]
Return the maximum length string from given array.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : Technocredits*/

package SheetalG;

import java.util.Arrays;

public class MaxLengthString {
	
	void printMaxString(String[] input) {
		String str = input[0];
		for(int index=0;index<input.length;index++) {
			if(str.length()<input[index].length()) {
				str=input[index];
			}
		}
		System.out.println("Output : "+str);
		
		
	}
	public static void main(String[] args) {
		String[] input = {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		System.out.println("Input : " +Arrays.toString(input));
		MaxLengthString maxLengthString = new MaxLengthString();
		maxLengthString.printMaxString(input);
	}
}
