/*Assignment - 62 : 22nd Dec'2024 [20 min] [IMP]
reverse each string in array and place at in reverse order.

input : {"tech", "aashvi", "Credits", "Ansh"}
output : [hsnA,stiderC, ivhsaa, hcet] 

*/

package SheetalG;

import java.util.Arrays;

public class ReverseStringReverse {
	
	String getReverseString(String input) {
		String revoutput = " ";
		for(int index=input.length()-1;index>=0;index--) {
			revoutput =revoutput + input.charAt(index);
		}
		return revoutput;
	}
	
	void printReverseString(String[] input) {
		String [] newoutput = new String[input.length];
		int j=0;
		for(int index=input.length-1;index>=0;index--) {
			newoutput[j] = getReverseString(input[index]);
			j++;
		}
		System.out.println("Output : " +Arrays.toString(newoutput));
	}
		
	public static void main(String[] args) {
		ReverseStringReverse reverseStringReverse = new ReverseStringReverse();
		String[] input = {"tech","aashvi","Credits","Ansh"};
		System.out.println("Input : "+Arrays.toString(input));
		reverseStringReverse.printReverseString(input);
		
	}

}
