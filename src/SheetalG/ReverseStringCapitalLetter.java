/*Assignment - 64 : 22nd Dec'2024 [20 min]
reverse each string in array and place at in reverse order, each word first letter capital and rest in lowercase.

input : {"Tech", "Aashvi", "Credits", "Ansh"}
output : [Hsna,Stiderc, Ivhsaa, Hcet]*/

package SheetalG;

import java.util.Arrays;

public class ReverseStringCapitalLetter {
	String getRevString(String input) {
		String output = " ";
		for(int index=input.length()-1;index>=0;index--) {
			char ch = input.charAt(index);
			
			if(index==input.length()-1) {
				ch=Character.toUpperCase(ch);
			}else if(index==0) {
				ch=Character.toLowerCase(ch);
			}
			output=output+ch;
		}
		return output;
	}
	
	void printRevString(String[] input) {
		String[] newoutput = new String[input.length];
		int j=0;
		for(int index=input.length-1;index>=0;index--) {
			newoutput[j]=getRevString(input[index]);
			j++;
		}
		System.out.println("Output : "+Arrays.toString(newoutput));
		}
	public static void main(String[] args) {
		ReverseStringCapitalLetter reverseStringCapitalLetter = new ReverseStringCapitalLetter();
		String[] input = {"Tech", "Aashvi", "Credits", "Ansh"};
		System.out.println("Input : "+ Arrays.toString(input));
		reverseStringCapitalLetter.printRevString(input);
	}
}
