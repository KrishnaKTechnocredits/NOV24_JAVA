//find sun and average of numbers divible by 5 or 7 from given array
// Array:{44,45,22,25,21,29}

package titiksha.Array;

public class Sumofdigitsfromarray {
	int getSumOfNumber(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 5 == 0 || array[i] % 7 == 0) {
				sum = sum + array[i];
				System.out.println("From array numbers divible by 5 or 7 are: " + array[i] + " ");
			}

		}

		return sum;
	}

	public static void main(String[] args) {
		Sumofdigitsfromarray sumofdigitsfromarray = new Sumofdigitsfromarray();
		int[] arr = { 44, 45, 22, 25, 21, 29 };
		int total = sumofdigitsfromarray.getSumOfNumber(arr);
		System.out.println();
		System.out.println(total);
	}
}
