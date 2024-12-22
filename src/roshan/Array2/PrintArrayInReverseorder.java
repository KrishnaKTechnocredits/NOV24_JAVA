package roshan.Array2;

public class PrintArrayInReverseorder {
	static void printArrayReverse(int[] number) {
		System.out.println("reverse order is ");
		for (int i = number.length - 1; i >= 0; i--) {

			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		PrintArrayInReverseorder.printArrayReverse(number);
	}

}

/*Assignment - 53 : 16th Dec'2024 [5-7 mins]

 * print the array in reverse order.
 * 
 * input : {10,34,22,16,19,99} output : 99 19 16 22 34 10
 */