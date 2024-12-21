/*Assignment - 59 : 21th Dec'2024 [25 mins]
print all the second maximum length string from given array.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : GlobantPune
        PuneGlobant
		PuGlobantne*/

package SheetalG;

import java.util.Arrays;

public class PrintAllString {
	
	public void printString(String[] input,int newStringLength) {
		for(int index=0;index<input.length;index++) {
			if(input[index].length()==newStringLength) {
				System.out.println(input[index]);
			}
		}
	}
	
	public void getString(String[] input) {
		
		String maxStr = input[0];
		String secondMaxStr = input[1];
		
		for(int index=2;index<input.length;index++) {
			if(maxStr.length()<input[index].length()) {
				secondMaxStr=maxStr;
				maxStr =input[index];
			}else {
				secondMaxStr =input[index];
				
			}
		}
		printString(input,secondMaxStr.length());
	}
	
	public static void main(String[] args) {
		String [] input = {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		PrintAllString printAllString = new PrintAllString();
		System.out.println("Input : "+Arrays.toString(input));
		System.out.println("Output : ");
		printAllString.getString(input);
		
	}

}
