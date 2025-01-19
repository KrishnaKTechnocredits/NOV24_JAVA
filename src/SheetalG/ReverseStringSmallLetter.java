/*Assignment - 63 : 22nd Dec'2024 [20 min] [IMP]
reverse each string in array and place at in reverse order.

input : {"TeCh", "Aashvi", "Credits", "AnsH"}
output : [hsna,stiderC, ivhsaa, hcet]*/

package SheetalG;

import java.util.Arrays;

public class ReverseStringSmallLetter {
	
	String getRevString(String input) {
		String output = " ";
		for(int index=input.length()-1;index>=0;index--) {
			char ch = input.charAt(index);
			char lowerOutput = Character.toLowerCase(ch);
			output +=lowerOutput;
			}
		return output;	
		}
		
	void printRevSmallString(String[] input) {
		String[] output = new String[input.length];
		int j=0;
		for(int index=input.length-1;index>=0;index--) {
			output[j]=getRevString(input[index]);
			j++;
		}
		System.out.println("Output "+Arrays.toString(output));		
	}
	public static void main(String[] args) {
		ReverseStringSmallLetter reverseStringSmallLetter= new ReverseStringSmallLetter();
		String[] input = {"TeCh", "Aashvi", "Credits", "AnsH"};
		System.out.println("Input : "+Arrays.toString(input));
		reverseStringSmallLetter.printRevSmallString(input);
		
	}

}
