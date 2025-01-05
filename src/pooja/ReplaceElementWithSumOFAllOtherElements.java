package pooja;

import java.util.Arrays;

/* input = {3,5,7,1,9};
 * output :{22,20,18,24,16};
 * 
 */
public class ReplaceElementWithSumOFAllOtherElements {

	void replaceElementWithSumOFAllOtherElements(int[] input) {
		int[] temp = new int[input.length];
//		int sum=0;
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if (i != j) {
					temp[i] = input[j] + temp[i];
//				temp[i]=sum;
				}
			}

		}
		System.out.println(Arrays.toString(temp));
	}

	public static void main(String[] args) {
		int[] input = { 3, 5, 7, 1, 9 };
		ReplaceElementWithSumOFAllOtherElements replace = new ReplaceElementWithSumOFAllOtherElements();
		replace.replaceElementWithSumOFAllOtherElements(input);
	}
}