package kavita;

/*print maximum and minimum number from given array.
 *input : {44,45,22,25,47,29,46}
max output : 47
min output : 22
Time:15m*/
public class Assignment51 {

	void printNum(int[] arr) {
		int maxNumber = arr[0];
		int minNumber = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if (maxNumber < arr[index]) {
				maxNumber = arr[index];
			}

			if (minNumber > arr[index]) {
				minNumber = arr[index];
			}
		
		}
		System.out.println("Maximum number in the given array is " + maxNumber);
		System.out.println("Minimum number in the given array is " + minNumber);
	}

	public static void main(String[] args) {
		Assignment51 assignment51 = new Assignment51();
		int[] input = { 44, 45, 22, 25, 47, 29, 46 };
		assignment51.printNum(input);
	}
}
