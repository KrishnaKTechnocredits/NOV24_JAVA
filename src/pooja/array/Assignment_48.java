package pooja.array;

/*
 Assignment - 48 : 15th Dec'2024 [15 mins]

From given int array, return count of positive numbers.

input : {10,30,-45,66,-10};
output : 3 

*/
public class Assignment_48 {

	int getCountOfPossitiveNo(int[] arr) {
		int count = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 30, -45, 66, -10 };
		Assignment_48 assignment_48 = new Assignment_48();
		System.out.println("Count of positive numbers from given array is : " + assignment_48.getCountOfPossitiveNo(arr));
	}
}