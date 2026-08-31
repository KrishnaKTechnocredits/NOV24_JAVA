/* Assignment - 50 : 16th Dec'2024 [10 mins] [imp]

return the minimum number from given array. 

input : {44,45,22,25,47,29,46}
output : 22


input : {-44,-45,-22,-25,-47,29,46}
output : -47*/

package nikita.arraysdemo;

public class Assignment50 {

	int getMinimumNumber(int[] arr) {
		int minNumber = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(minNumber>arr[i]) {
				minNumber = arr[i];
			}
		}
		return minNumber;
	}
	public static void main(String[] args) {
		int[] arr = {44,45,22,25,47,29,46};
		int[] arr1 = {-44,-45,-22,-25,-47,29,46};
		Assignment50 a50 = new Assignment50();
		int ans = a50.getMinimumNumber(arr);
		System.out.println("Minimum number from given arrays is: " + ans);
		int ans1 = a50.getMinimumNumber(arr1);
		System.out.println("Minimum number from given arrays is: " + ans1);
	}
}
