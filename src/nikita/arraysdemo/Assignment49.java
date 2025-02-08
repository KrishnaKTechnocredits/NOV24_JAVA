/* Assignment - 49 : 16th Dec'2024 [15 mins] [imp]

return the maximum number from given array. 

input : {44,45,22,25,47,29,46}
output : 47

input : {-44,-45,-22,-25,-47,-29,-46}
output : -22*/

package nikita.arraysdemo;

public class Assignment49 {
	
	int getMaxNum(int[] arr) {
		int maxNum = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(maxNum < arr[i]) {
				maxNum = arr[i];
			}
		}
		return maxNum;
	}

	public static void main(String[] args) {
		int[] arr = {44,45,22,25,47,29,46};
		int[] arr1 = {-44,-45,-22,-25,-47,-29,-46};
		Assignment49 a49 = new Assignment49();
		int ans = a49.getMaxNum(arr);
		System.out.println("Maximum number from given arrays is: " + ans);
		int ans1 = a49.getMaxNum(arr1);
		System.out.println("Maximum number from given arrays is: " + ans1);
	}
}
