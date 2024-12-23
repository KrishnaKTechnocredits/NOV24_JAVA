package pooja.array;

/*
 Assignment - 50 : 16th Dec'2024 [10 mins] [imp]

return the minimum number from given array. 

input : {44,45,22,25,47,29,46}
output : 22


input : {-44,-45,-22,-25,-47,29,46}
output : -47

--------------------------------
*/
public class Assignment_50 {

	int getMinNpFromArray(int[] input) {
		int minNumber = input[0];
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if (minNumber > input[j]) {
					minNumber = input[j];
				}
			}
		}
		return minNumber;
	}

	public static void main(String[] args) {
		int[] input = { 44, 45, 22, 25, 47, 29, 46 };
		int[] input2 = { -44, -45, -22, -25, -47, 29, 46 };
		Assignment_50 assignment_50 = new Assignment_50();
		System.out.println("The Minimun number from given array is : " + assignment_50.getMinNpFromArray(input));
		System.out.println("The Minimun number from given array is : " + assignment_50.getMinNpFromArray(input2));
	}
}