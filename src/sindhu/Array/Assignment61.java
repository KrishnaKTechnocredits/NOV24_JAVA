/*reverse each string in array at the same place.

input : {"tech", "aashvi", "credits"}
output : [hcet, ivhsaa, stiderc]*/

package sindhu.Array;

import java.util.Arrays;

public class Assignment61 {
	
	String getRevArrayOfStringMethod(String word) {
		String output = "";
		for(int i=word.length()-1; i>=0; i--) {
			output = output + word.charAt(i);
		}
		return output;
	}
	
	String[] callRevArrayOfStringMethod(String[] ip) {
		String[] output1 = new String[ip.length];
		for(int j=0; j<ip.length; j++) {
			String str = ip[j];
			String strng = getRevArrayOfStringMethod(str);
			output1[j]= strng;
		}
		return output1;
	}
	
	public static void main(String[] args) {
		String[] input = {"tech", "aashvi", "credits"};
		Assignment61 assignment61 = new Assignment61();
		String[] output = assignment61.callRevArrayOfStringMethod(input);
		System.out.println(Arrays.toString(output));
	}
}


