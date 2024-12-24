package pooja.array;
/*
 * Assignment - 51 : 16th Dec'2024 [15 mins]

print maximum and minimum number from given array. 

input : {44,45,22,25,47,29,46}
output : 47

input : {-44,-45,-22,-25,-47,-29,-46}
output : -22

*/
public class Assignment_51 {

	void printMaxAndMinNumber(int[] arr) {
		int max = arr[0], min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Maximum no is : " + max);
		System.out.println("Minimum no is : " + min);
	}

	public static void main(String[] args) {
		int[] input = { 44, 45, 22, 25, 47, 29, 46 };
		int[] input2 = { -44, -45, -22, -25, -47, -29, -46 };
		Assignment_51 assignment_51 = new Assignment_51();
		assignment_51.printMaxAndMinNumber(input);
		System.out.println("--------------------");
		assignment_51.printMaxAndMinNumber(input2);
	}
}