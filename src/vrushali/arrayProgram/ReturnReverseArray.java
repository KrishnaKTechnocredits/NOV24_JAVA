package vrushali.arrayProgram;
//Assignment Number 54
//Return Reverse Array

public class ReturnReverseArray {
	int[] returnArrayInReverseOrder(int[] numArray) {
		int[] reverseArray = new int[numArray.length];
		for (int i = numArray.length - 1, j = 0; i >= 0; i--, j++) {
			reverseArray[j] = numArray[i];
		}
		return reverseArray;
	}

	public static void main(String[] args) {
		int[] numArray = { 44, 45, 22, 25, 47, 29, 46 };
		ReturnReverseArray returnReverseArray = new ReturnReverseArray();
		int[] reverseArray = new int[numArray.length];
		reverseArray = returnReverseArray.returnArrayInReverseOrder(numArray);

		System.out.println("Original Array:- ");
		System.out.print("{");
		for (int i = 0; i < reverseArray.length; i++) {
			System.out.print(numArray[i]);
			if (i >= 0 && i < numArray.length - 1) {
				System.out.print(",");
			}
		}
		System.out.print("}");
		System.out.println();
		System.out.println("Reverse Array:- ");
		System.out.print("{");
		for (int i = 0; i < reverseArray.length; i++) {
			System.out.print(reverseArray[i]);
			if (i >= 0 && i < reverseArray.length - 1) {
				System.out.print(",");
			}

		}
		System.out.print("}");

	}
}
