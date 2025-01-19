package pooja.array;

import java.util.Arrays;

/*Assignment - 55 : 18th Dec'2024 [15-20 mins]

return union of given two array.

input : 
{10,19,18}
{99,8}

output :  {10,19,18,99,8}*/
public class Assignment_55 {

	int[] getUnionArray(int[] arr1, int[] arr2) {
		int[] ans = new int[arr1.length + arr2.length];
		int cnt = 0;
//		System.out.println(ans.length);
		for (int i = 0; i < arr1.length; i++) {
			ans[cnt] = arr1[i];
			cnt++;
		}
		for (int i = 0; i < arr2.length; i++) {
			ans[cnt] = arr2[i];
			cnt++;
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr1 = { 10, 19, 18 };
		int[] arr2 = { 99, 8 };
		Assignment_55 assignment_55 = new Assignment_55();
		int[] union = assignment_55.getUnionArray(arr1, arr2);
		System.out.println("The given arrays are : " + Arrays.toString(arr1) + " & " + Arrays.toString(arr2));
		System.out.println("The union of two array is : " + Arrays.toString(union));
	}
}