//Assignment - 53 : 16th Dec'2024 [5-7 mins]
//
//print the array in reverse order. 
//
//input : 
//output : 99
//         19
//		 16
//		 22
//		 34
//		 10
//Assignmen54 : return reverse array

package komal.Array;

public class Assignment53 {
	void getReverseOrder(int[] input) {
		System.out.println("Given array in reverse order : ");
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[input.length - i - 1]);
		}
	}

	int[] returnReverseArray(int[] input) {
		int[] output = new int[input.length];

		for (int i = 0; i < input.length; i++) {
//			System.out.println(input[input.length - i - 1]);
			output[i] = input[input.length - i - 1];
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 10, 34, 22, 16, 19, 99 };
		Assignment53 a53 = new Assignment53();
		a53.getReverseOrder(input);
		int[] outputArray = a53.returnReverseArray(input);
		System.out.println("Reverse Array using return => ");
		for (int i = 0; i < input.length; i++) {
			System.out.println(outputArray[i]);
		}
	}

}
