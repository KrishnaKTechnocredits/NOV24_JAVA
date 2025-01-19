//Assignment - 48 : 15th Dec'2024 [15 mins]
//
//From given int array, return count of positive numbers.
//
//input : {10,30,-45,66,-10};
//output : 3 

package komal.Array;

public class Assignment48 {
	int positiveCount;

	void getPositiveNumbers(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				positiveCount++;
			}
		}
		System.out.println("Count of Positive Numbers : " + positiveCount);
	}

	public static void main(String[] args) {
		int[] numbers = { 10, 30, -45, 66, -10 };
		Assignment48 a48 = new Assignment48();
		a48.getPositiveNumbers(numbers);
	}
}
