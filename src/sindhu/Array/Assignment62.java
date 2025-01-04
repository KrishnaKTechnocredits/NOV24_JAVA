/*reverse each string in array and place at in reverse order.

input : {"tech", "aashvi", "Credits", "Ansh"}
output : [hsnA, stiderC, ivhsaa, hcet]
*/

package sindhu.Array;

import java.util.Arrays;

public class Assignment62 {
	String getRevArrayOfStringMethod(String word) {
		String output = "";
		for(int i=word.length()-1; i>=0; i--) {
			output = output + word.charAt(i);
		}
		return output;
	}
	
	String[] callRevArrayOfStringMethod(String[] ip) {
		String[] output1 = new String[ip.length];
		for(int j=ip.length-1,k=0;j>=0; j--,k++ ) {
			String str = ip[j];
			String strng = getRevArrayOfStringMethod(str);
			output1[k]= strng;
		}
		return output1;
	}
	
	public static void main(String[] args) {
		String[] input = {"tech", "aashvi", "Credits", "Ansh"};
		Assignment62 assignment62 = new Assignment62();
		String[] output = assignment62.callRevArrayOfStringMethod(input);
		System.out.println(Arrays.toString(output));
	}
}
