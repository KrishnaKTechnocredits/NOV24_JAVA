//Assignment - 50 : 16th Dec'2024 [10 mins] [imp]
//
//return the maximum number from given array. 
//
//input : {44,45,22,25,47,29,46}
//output : 22
//
//
//input : {-44,-45,-22,-25,-47,29,46}
//output : -47

package komal.Array;

public class Assignment50 {

	int getMinimumNumber(int[] input) {
		int minNum = input[0];
		for (int i = 0; i < input.length; i++) {

			if (minNum > input[i]) {
				minNum = input[i];
			}
		}
		return minNum;
	}

	public static void main(String args[]) {
		int[] inputForMin = { -44, -45, -22, -25, -47, -29, -46 };
		Assignment50 a50 = new Assignment50();
		int MinNum = a50.getMinimumNumber(inputForMin);
		System.out.println("Minimum number is: " + MinNum);
	}

}
