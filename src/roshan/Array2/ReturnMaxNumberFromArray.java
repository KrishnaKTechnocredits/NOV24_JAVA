package roshan.Array2;

public class ReturnMaxNumberFromArray {
	static int getMAxNumber(int[] number) {
		int maxNum = number[0];
		for (int i = 1; i < number.length; i++) {
			if (maxNum < number[i]) {
				maxNum = number[i];
			}

		}
		return maxNum;
	}

	public static void main(String[] args) {
		// int[] number= {44,45,22,25,47,29,46};
		int[] number = { -44, -45, -22, -25, -47, -29, -46 };
		System.out.println(ReturnMaxNumberFromArray.getMAxNumber(number));
	}
}

/*
 * return the maximum number from given array. IMP
 * 
 * input : {44,45,22,25,47,29,46} output : 47
 * 
 * input : {-44,-45,-22,-25,-47,-29,-46} output : -22
 */
