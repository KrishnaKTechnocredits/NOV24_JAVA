/*reverse each string in array and place at in reverse order, each word first letter capital and rest in lowercase.

input : {"Tech", "Aashvi", "Credits", "Ansh"}
output : [Hsna,Stiderc, Ivhsaa, Hcet]*/

package sindhu.Array;

import java.util.Arrays;

public class Assignment64 {
	String getRevArrayOfStringMethod(String word) {
		String output = "";
		String output2 = null;
		for(int i=word.length()-1; i>=0; i--) {
			output = output + word.charAt(i);
			output2 = output.toLowerCase();
			
		}
		return output2.substring(0, 1).toUpperCase()+output2.substring(1);
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
		String[] input = {"Tech", "Aashvi", "Credits", "Ansh"};
		Assignment64 assignment64 = new Assignment64();
		String[] output = assignment64.callRevArrayOfStringMethod(input);
		System.out.println(Arrays.toString(output));
	}
}