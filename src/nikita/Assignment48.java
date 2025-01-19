/* Assignment - 48 : 15th Dec'2024 [15 mins]

From given int array, return count of positive numbers.

input : {10,30,-45,66,-10};
output : 3 
*/

package nikita;

public class Assignment48 {
	
	int getCount(int[] input) {
		int count = 0;
		for (int i = 0; i<input.length; i++) {
			if(input[i] > 0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] input = {10,30,-45,66,-10};
		Assignment48 a48 = new Assignment48();
		int ans = a48.getCount(input);
		System.out.println("Count of positivec numbers from given array: " + ans);
	}
}
