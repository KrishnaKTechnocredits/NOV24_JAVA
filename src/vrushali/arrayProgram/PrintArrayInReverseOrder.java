package vrushali.arrayProgram;
//Assignment Number -53

public class PrintArrayInReverseOrder {
	void printNumberArrayInReverseOrder(int[] numArray) {
		System.out.println("Reverse Array :-");

		for (int i = numArray.length - 1; i >= 0; i--) {
			System.out.println(numArray[i]);
		}
	}

	public static void main(String[] args) {
		int[] numArray = { 44, 45, 22, 25, 47, 29, 46 };
		PrintArrayInReverseOrder printArrayInReverseOrder = new PrintArrayInReverseOrder();
		printArrayInReverseOrder.printNumberArrayInReverseOrder(numArray);
	}

}
