package kavita;

import java.util.Arrays;

public class Challenge2 {
	boolean vowel(String str) {
		boolean b=false;
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
					b=true;
				}
			}
		}
		return b;
	}
	 String getRevString(String str) {
		 String revStr= "";
		 for(int i=str.length()-1;i>=0;i--) {
			 revStr=revStr+str.charAt(i);
		 }
		 return revStr; 
	 }
	 
	 String[] getRevArray(String[] input) {
		 for(int i=0;i<=input.length-1;i++) {
			 if(vowel(input[i])) {
				 input[i]=getRevString(input[i]);
			 }
		 }
		 return input;
	 }
	 
	 public static void main(String[] args) {
		 Challenge2 challenge2=new Challenge2();
		 String[] input={"apple", "sky", "orange", "try", "eagle"};
		 String[] ans=challenge2.getRevArray(input);
		 System.out.println(Arrays.toString(ans));
	}
}
