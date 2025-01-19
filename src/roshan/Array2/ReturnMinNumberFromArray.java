package roshan.Array2;

public class ReturnMinNumberFromArray {
	int getMinNumber(int[] number) {
		int minNum = number[0];
		for (int i = 1; i < number.length; i++) {
			if (minNum > number[i]) {
				minNum = number[i];

			}

		}
		return minNum;

	}

	public static void main(String[] args) {
		// int [] number = {44,45,22,25,47,29,46};
		int[] number = { -44, -45, -22, -25, -47, 29, 46 };
		ReturnMinNumberFromArray returnminnumberfromarray = new ReturnMinNumberFromArray();
		int returnMinNum = returnminnumberfromarray.getMinNumber(number); // as it is method call no need to right
																			// number[i]
		System.out.println("min num in array is >> " + returnMinNum);
	}

}

/*
 * Assignment - 50 : 16th Dec'2024 [10 mins] [imp]
 * 
 * return the min number from given array.
 * 
 * input : {44,45,22,25,47,29,46} output : 22
 * 
 * 
 * input : {-44,-45,-22,-25,-47,29,46} output : -47
 */