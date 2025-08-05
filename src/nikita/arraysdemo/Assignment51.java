/* Assignment - 51 : 16th Dec'2024 [15 mins]

print maximum and minimum number from given array. 

void findMaxMin(int[] arr){
	int maxNum=arr[0], minNum=arr[0];
} 
*/

package nikita.arraysdemo;

public class Assignment51 {
	
	void finMaxMin(int[] arr) {
		int maxNum = arr[0], minNum = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(maxNum<arr[i]) {
				maxNum = arr[i];
			}
			if(minNum>arr[i]) {
				minNum = arr[i];
			}
		}
		System.out.println("Maximum number from give array is: " + maxNum);
		System.out.println("Minimum number from give array is: " + minNum);
	}

	public static void main(String[] args) {
		int[] arr = {51, 400, 874, 6, 74, 50};
		Assignment51 a51 = new Assignment51();
		a51.finMaxMin(arr);
	}
}
