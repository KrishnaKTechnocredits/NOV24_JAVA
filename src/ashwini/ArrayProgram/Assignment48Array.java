package ashwini.ArrayProgram;
/*Assignment - 48 : 15th Dec'2024 [15 mins]

From given int array, return count of positive numbers.

input : {10,30,-45,66,-10};
output : 3 
*/

public class Assignment48Array {


	int arrPositiveNum(int[] arr) {
		int count=0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > 0)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Assignment48Array arr48 = new Assignment48Array();
		int[] arr = { 10, 30, -45, 66, -10 };
		int ans = arr48.arrPositiveNum(arr);
		System.out.println("Positve numbers in given array is " + ans);
	}

}
