//print the array in reverse order. 
//input : {10,34,22,16,19,99}
//output : 99
    //     19
	//	 16
	//	 22
	//	 34
	//	 10

package titiksha.Array;

public class Reverseorder {
	int reverse;

	void reverseorder(int[] arr) {
		System.out.println("The reverse array is: ");
		for (int i = arr.length - 1; i >= 0; i--) {
			reverse = arr[i];

			System.out.println(reverse);
		}

	}

	public static void main(String[] args) {
		Reverseorder reverseorder = new Reverseorder();
		int[] array = { 10, 34, 22, 16, 19, 99 };
		reverseorder.reverseorder(array);

	}
}
