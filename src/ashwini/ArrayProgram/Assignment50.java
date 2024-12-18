package ashwini.ArrayProgram;

/*Assignment - 50 : 16th Dec'2024 [10 mins] [imp]

return the minimum number from given array. 

input : {44,45,22,25,47,29,46}
output : 22


input : {-44,-45,-22,-25,-47,29,46}
output : -47*/

public class Assignment50 {

	void getMinNumber(int[] arr) {
		int minNum = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if (minNum > arr[index]) {
				minNum = arr[index];
			}
		}
		System.out.println("Minimum number from given array is " + minNum);
	}

	public static void main(String[] args) {
		Assignment50 assn50 = new Assignment50();
		int[] arr1 = { 44, 45, 22, 25, 47, 29, 46 };
		int[] arr2 = { -44, -45, -22, -25, -47, 29, 46 };
		assn50.getMinNumber(arr1);
		assn50.getMinNumber(arr2);
	}
}
