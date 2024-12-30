package pooja.array;

import java.util.Arrays;

/*Assignment - 62 : 22nd Dec'2024 [20 min] [IMP]
reverse each string in array and place at in reverse order.

input : {"tech", "aashvi", "Credits", "Ansh"}
output : [hsnA,stiderC, ivhsaa, hcet]
*/
public class Assignment_62 {

	String getReversedWord(String str) {
		String word ="";
		for(int i=str.length()-1;i>=0;i--) {
			word+=str.charAt(i);
		}
		return word;
	}
	
	String[] reverseStringInReverseOrder(String[] input) {
		String[] arr = new String[input.length];
		String[] arr2 = new String[input.length];
		int cnt=0;
		for(int j =arr.length-1;j>=0;j--) {
			arr2[cnt]=getReversedWord(input[j]);
			cnt++;			
		}
		return arr2;
	}
	public static void main(String[] args) {
		String[] input = {"tech", "aashvi", "Credits", "Ansh"};
		Assignment_62 assignment_62 = new Assignment_62();
		System.out.println("Given String array is : " + Arrays.toString(input));
		String[] ans = assignment_62.reverseStringInReverseOrder(input);
		System.out.println("Reversed string array is : " + Arrays.toString(ans));
	}
}