/* return the array having elements in reverse order of original array. 
*/

package nikita.arraysdemo;

public class Assignment54 {
	
	int[] getReverseArray(int[] input) {
		int[] output = new int[input.length];
		for(int i = input.length-1, j=0; i>=0; i--,j++)
		{
			output[j] = input[i];
		}
		return output;
	}

	public static void main(String[] args) {
		int[] input = {10,34,22,16,19,99};
		Assignment54 a54 = new Assignment54();
		int[] ans = a54.getReverseArray(input);
		for(int i = 0; i<ans.length; i++) {
		System.out.println(ans[i]);
		}
	}
}
