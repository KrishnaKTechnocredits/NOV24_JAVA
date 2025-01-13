package siddharth;

import java.util.Arrays;

/*          
Assignment - 76 : 11th Jan
return the list of names having atleast one uppercase, one lowercase, one digit and one special character (_, !, #, $) in the name.

String[] arr = {"TechnOCrediTs", "TEch1n_o##", "Credits", "Tit!iksHa", "PUNE1#"};
output : {"TEch1n_o##", "Tit!iksHa"} (changed to T1t!iksHa)
 */
public class Assignment76 {
	
	Boolean checkWord(String str) {
		boolean flag=false;
		int ucount=0;
		int lcount=0;
		int dcount=0;
		int scount=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch) && ucount==0)  {
				ucount++;
			}else if(Character.isLowerCase(ch) && lcount==0 ) {
				lcount++;
			}else if(Character.isDigit(ch) && dcount==0) {
				dcount++;
			}else if((ch=='_' || ch=='!' || ch=='#' || ch=='$') && scount==0) {
				scount++;
			}
		}
		if (ucount+lcount+dcount+scount==4) {
			flag = true;
		}
		return flag;
	}
	
	String[] getNames(String[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			boolean flag = checkWord(arr[i]);
			if(flag) {
				count++;
			}
		}
		String[] output = new String[count];
		for(int i=0,j=0;i<arr.length;i++) {
			if(checkWord(arr[i])) {
				output[j++]=arr[i];
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		Assignment76 assignment76 = new Assignment76();
		String[] input = {"TechnOCrediTs", "TEch1n_o##", "Credits", "T1t!iksHa", "PUNE1#"};
		String[] ans=assignment76.getNames(input);
		System.out.println("Output : "+Arrays.toString(ans));
	}
}
