//Assignment - 70 : 5th Jan'2025 [IMP]
//
//Print count of digit in each word.
//String str = "H2i22 H1ello Techno C2red3i3t4s5";
//
//output : 
//H2i22 -> 3
//H1ello -> 1
//Techno -> 0
//C2red3i3t4s5 -> 5

package fazrana.string;

import java.util.Arrays;

public class FAssignment70 {
	void getDigitPrint(String str) {
		String[] array= str.split(" ");
		System.out.println("Input: "+Arrays.toString(array));
		for(int i=0;i<array.length;i++) {
			System.out.println(getDigits(array[i]));
		}
	}
	
	String getDigits(String str) {
		int count=0;
		for (int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				count++;
			}
		}
		return str+"->>"+count;
	}
	
	public static void main(String[] args) {
		String str = "H2i22 H1ello Techno C2red3i3t4s5";
		FAssignment70 fassignment70=new FAssignment70();
		fassignment70.getDigitPrint(str);
	}
}
