/*reverse each string in array and place at in reverse order.

input : {"Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH"}
output : [HSNa,StidErc, IvHsaa, HCet]

Hint : First letter in Uppercase + last Letter in lowercase + all other characters in same case + exclude digits*/

package sindhu.Array;

import java.util.Arrays;

public class Assignment65 {
	
	String getReverseArray(String str) {
		String output = "";
		
		for(int j=str.length()-1; j>=0; j--) {
			char ch = str.charAt(j);
			if(Character.isLetter(ch)) {
				output = output+ str.charAt(j);
				//output = output.toLowerCase();
			}
		}		
		return output.substring(0,1).toUpperCase()+output.substring(1,output.length()-1)+output.substring(output.length()-1).toLowerCase();
	}
	
	String[] getArrayOfString(String[] ip) {
		String[] finalOutput = new String[ip.length];
		for(int i=0; i<ip.length; i++) {
			//String str = ip[i];
			//String output2Rev = getReverseArray(str);
			finalOutput[i]=getReverseArray(ip[ip.length-1-i]);
		}
		return finalOutput;
	}
	
	public static void main(String[] args) {
		String[] input = {"Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH"};
		Assignment65 Assignment65 = new Assignment65();
		String[] RevStringArr = Assignment65.getArrayOfString(input);
		System.out.println(Arrays.toString(RevStringArr));
	}
}
