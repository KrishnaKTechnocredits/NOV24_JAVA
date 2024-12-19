package roshan.array;

public class ReturnCountOfPositiveNo {

	int getPositiveNoCount(int[] number) {
		int count = 0; // if initilize in side loop it will make count 0 again and again
		for (int i = 0; i < number.length; i++) {
			if (number[i] > 0) {
				count++;

			}
		}

		return count;
		// System.out.println("posittive no count is" + return ); code become unrechable here
	}

	public static void main(String[] args) {
		int[] number = { 10, 30, -45, 66, -10 };
		ReturnCountOfPositiveNo returncountofpositiveno = new ReturnCountOfPositiveNo();
		int positivecount = returncountofpositiveno.getPositiveNoCount(number);

		System.out.println("posittive no count is : " + positivecount);
	}

}

/*
 * Assignment - 48 : 15th Dec'2024 [15 mins]
 * 
 * From given int array, return count of positive numbers.
 * 
 * input : {10,30,-45,66,-10}; output : 3
 */