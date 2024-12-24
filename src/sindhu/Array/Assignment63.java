/*reverse each string in array and place at in reverse order.

input : {"TeCh", "Aashvi", "Credits", "AnsH"}
output : [hsna,stiderc, ivhsaa, hcet]*/

package sindhu.Array;

import java.util.Arrays;

public class Assignment63 {
	
	String getRevArrayOfStringMethod(String word) {
		String output = "";
		String output2 = null;
		for(int i=word.length()-1; i>=0; i--) {
			output = output + word.charAt(i);
			output2 = output.toLowerCase();
		}
		return output2;
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
		String[] input = {"TeCh", "Aashvi", "Credits", "AnsH"};
		Assignment63 assignment63 = new Assignment63();
		String[] output = assignment63.callRevArrayOfStringMethod(input);
		System.out.println(Arrays.toString(output));
	}
}
