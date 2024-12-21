/*Assignment - 58 : 21th Dec'2024 [15 mins]
Return the second maximum length string from given array.
If you find multiple string as second maximum, return the last second maximum.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : PuGlobantne*/

package SheetalG;

import java.util.Arrays;

public class SecondMaxString {
	
	void printSecondMaxString(String[] input) {
		String maxString = input[0];//maxString ="Tech"
		String secondMaxString = input[1];//secondMaxString = "Tech"
		for(int index=2;index<input.length;index++) {
			if(maxString.length()<input.length) {//4<13
				maxString =input[index];
			}else {
				secondMaxString = input[index];
			}
		}
		System.out.println("Output : " + secondMaxString);
	}
	
	public static void main(String[] args) {
		SecondMaxString secondMaxString =new SecondMaxString();
		String[] input = {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		System.out.println("Input : "+Arrays.toString(input));
		secondMaxString.printSecondMaxString(input);
	}

}
