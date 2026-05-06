/*Print count of digit in each word.
String str = "H2i22 H1ello Techno C2red3i3t4s5";

output : 
H2i22 -> 3
H1ello -> 1
Techno -> 0
C2red3i3t4s5 -> 5*/

package sindhu.Array;

import java.util.Arrays;

public class Assignment70 {
	
	public void getCountOfDigit(String str) {
		String[] strArr = str.split(" ");
		System.out.println("The Input String into Array: "+Arrays.toString(strArr));
		
		for(int i=0; i<strArr.length; i++) {
			String word = strArr[i];
			int count = 0;
			for(int j=0;j<word.length(); j++) {
				char ch = word.charAt(j);
				if(Character.isDigit(ch)) {
					count++;
				}
			}
			System.out.println(word+" -> "+count);
		}
		
		
	}
	
	public static void main(String[] args) {
		String str = "H2i22 H1ello Techno C2red3i3t4s5";
		Assignment70 assign70 = new Assignment70();
		assign70.getCountOfDigit(str);
	}
}
