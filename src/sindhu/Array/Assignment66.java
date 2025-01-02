/*reverse word in array at the same place provided word should not have any digit, if word is having any digit do not reverse the word.

input : {"tech", "aa1shvi", "credits", "H4i", "Hello"}
output : [hcet, aashvi, stiderc, Hi, olleH]*/

package sindhu.Array;

import java.util.Arrays;

public class Assignment66 {
	
	boolean getStringIfItHasDigit(String ip) {
		boolean flag = false;
		for(int j=0; j<ip.length(); j++) {
			char ch2= ip.charAt(j);
			if(Character.isDigit(ch2)) {
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	String getWordWithoutDigit(String word) {
		String str = "";
		for(int k=0;k<word.length();k++) {
			char ch1 = word.charAt(k);
			if(Character.isLetter(ch1)) {
				str += ch1;
			}
		}
		return str;
	}
	
	String getReverseString(String strWord){
		String word = "";
		for(int j=strWord.length()-1; j>=0; j--) {
			char ch = strWord.charAt(j);
			if(Character.isLetter(ch)) {
				word += strWord.charAt(j);
				//System.out.println(word);
			}
		}		
		return word;
	}
	
	String[] callReverseArray(String[] ip) {
		String[] output = new String[ip.length];
		for(int i=0; i<ip.length;i++) {
			if(getStringIfItHasDigit(ip[i])) {
				output[i]=getWordWithoutDigit(ip[i]);
			}else{
				output[i]= getReverseString(ip[i]);
			}	
		}
		return output;
	}
	
	public static void main(String[] args) {
		String[] input = {"tech", "aa1shvi", "credits", "H4i", "Hello"};
		Assignment66 assign66 = new Assignment66();
		String[] output = assign66.callReverseArray(input);
		System.out.println("The output array is:" +Arrays.toString(output));
	}
}
