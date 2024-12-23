/*
 * Assignment - 61 : 22nd Dec'2024 [20 min] [IMP]
reverse each string in array at the same place.

input : {"tech", "aashvi", "credits"}
output : [hcet, ivhsaa, stiderc]

 */

package mayur;
import java.util.Arrays;

public class Assignment61 {
	
	String[] getReversedStringElements(String[] input) {
		String[] str = new String[input.length];
		for (int i =0 ; i<input.length;i++) {
			String revTemp = "";
			String temp = input[i];
			for (int index = temp.length()-1; index >= 0; index--) {
				revTemp = revTemp + temp.charAt(index);
			}
			str[i]=revTemp;
		}
		return str;
	}
	
	public static void main(String[] args) {
		String[] input = {"tech", "aashvi", "credits"};
		Assignment61 obj = new Assignment61();
		String[] revInput = obj.getReversedStringElements(input);
		System.out.println(Arrays.toString(revInput));
	}
}
