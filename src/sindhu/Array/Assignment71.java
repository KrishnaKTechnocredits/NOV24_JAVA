/*return the word having highest digits in the given String .
String str = "H2i22 H1ello Techno C2red3i3t4s5";

output : C2red3i3t4s5*/

package sindhu.Array;

import java.util.Arrays;

public class Assignment71 {
	
	public String getMaxDigitString(String str) {
		String[] strArr = str.split(" ");
		System.out.println("The Input String into Array: "+Arrays.toString(strArr));
		
		String maxDigitString = null;
		int maxCount=0;
		
		for(int i=0;i<strArr.length;i++) {
			String word = strArr[i];
			int count = 0;
			for(int j=0; j<word.length(); j++) {
				char ch = word.charAt(j);
				if(Character.isDigit(ch)) {
					count++;
					word = strArr[i];
				}
			}
			
			if(count>maxCount) {
				maxDigitString = word;
			}
		}
		return maxDigitString;
	}
	
	public static void main(String[] args) {
		String str = "H2i22 H1ello Techno C2red3i3t4s5";
		Assignment71 assign71 = new Assignment71();
		String maxStr = assign71.getMaxDigitString(str);
		System.out.println("The Max Digit String is: "+maxStr);
	}
}
