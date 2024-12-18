//
//return the maximum number from given array. 
//
//input : {44,45,22,25,47,29,46}
//output : 47
//
//input : {-44,-45,-22,-25,-47,-29,-46}
//output : -22

package komal.Array;

public class Assignment49 {
	int getMaximumNumber(int[] input) {

		int maxNum = input[0];
		for (int i = 1; i < input.length; i++) {

			if (maxNum < input[i]) {
				maxNum = input[i];
			}
		}
		return maxNum;
	}

	public static void main(String args[]) {
		int[] inputforMax = { 44, 45, 22, 25, 47, 29, 46 };
		Assignment49 a49 = new Assignment49();
		int MaxNum = a49.getMaximumNumber(inputforMax);
		System.out.println("Maximum number is: " + MaxNum);
	}
}
