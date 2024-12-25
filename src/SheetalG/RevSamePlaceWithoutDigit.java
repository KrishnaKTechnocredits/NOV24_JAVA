/*Assignment - 66 : 22nd Dec'2024 [20 min]
reverse word in array at the same place provided word should not have any digit, if word is having any digit do not reverse the word.

input : {"tech", "aa1shvi", "credits", "H4i", "Hello"}
output : [hcet, aashvi, stiderc, Hi, olleH]*/

package SheetalG;

import java.util.Arrays;

public class RevSamePlaceWithoutDigit {
	
	String getRevString(String input) {
		String output = "";
		for(int index=input.length()-1;index>=0;index--) {
			char ch = input.charAt(index);
			if(!Character.isDigit(ch))
				output+=ch;
		}
		return output;
	}
		
	public void printRevString(String[] input) {
		String[] newoutput = new String[input.length];
		for(int index=input.length-1;index>=0;index--) {
			newoutput[index]=getRevString(input[index]);
		}
		System.out.println("Output : "+Arrays.toString(newoutput));
	}
	
	public static void main(String[] args) {
		RevSamePlaceWithoutDigit revSamePlaceWithoutDigit = new RevSamePlaceWithoutDigit();
		String[] input = {"tech", "aa1shvi", "credits", "H4i", "Hello"};
		System.out.println("Input : "+ Arrays.toString(input));
		revSamePlaceWithoutDigit.printRevString(input);
		
		
	}

}
