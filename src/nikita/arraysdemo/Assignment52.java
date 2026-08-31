/* Assignment - 52 : 16th Dec'2024 [15 mins]

return maximum and minimum number from given array.

int getMaxMinNum(int[] arr){
	
} */

package nikita.arraysdemo;

public class Assignment52 {
		int[] getMaxMinNumbers(int[] arr) {
			int[] output = new int[2]; //we will return 2 no max and min therefore, stored in memory 
			int maxNum = arr[0], minNum = arr[0];
			for(int i = 1; i<arr.length; i++) {
				if(maxNum<arr[i]) {
					maxNum = arr[i];
				}
				if(minNum>arr[i]) {
					minNum = arr[i];
				}
			}
			output[0] = maxNum;
			output[1] = minNum;
			return output;
		}
		
	public static void main(String[] args) {
		int[] arr = {18, 55, 400, 79, 5};
		Assignment52 a52= new Assignment52();
		int[] ans = a52.getMaxMinNumbers(arr);
		System.out.println("Maximum number is: " + ans[0]);
		System.out.println("Minimum number is: " + ans[1]);
	}
}
