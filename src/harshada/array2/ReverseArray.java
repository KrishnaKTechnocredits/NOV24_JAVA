//Assignment - 53 : 16th Dec'2024 [5-7 mins]
//
//print the array in reverse order. 
//
//input : {10,34,22,16,19,99}
//output : 99
//         19
//		 16
//		 22
//		 34
//		 10

package harshada.array2;

public class ReverseArray {

	void printReverseArray(int[] input) {
		for (int i = input.length - 1; i >= 0; i--) {
			System.out.println(input[i]);
		}
	}

	public static void main(String[] args) {
		ReverseArray reverseArray = new ReverseArray();
		int[] input = { 10, 34, 22, 16, 19, 99 };
		reverseArray.printReverseArray(input);
	}
}
