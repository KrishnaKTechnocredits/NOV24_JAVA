package pooja.array;

/*Assignment - 60 : 21st Dec'2024 [20 min]
return second maximum number from given array.

input = {33,33,19,55,53,11};
output : 53 
*/
public class Assignment_60 {
	int getSecondMaxxNoFromArray(int[] input) {
		int maxNumber = input[0];
		int secondMaxNumber = input[1];

		if (maxNumber < secondMaxNumber) {
			maxNumber = input[1];
			secondMaxNumber = input[0];
		}
		for (int i = 2; i < input.length; i++) {
			if (input[i] > maxNumber) {
				secondMaxNumber = maxNumber;
				maxNumber = input[i];
			} else if (input[i] >= secondMaxNumber) {
				secondMaxNumber = input[i];
			}
		}
		return secondMaxNumber;
	}

	public static void main(String[] args) {
		int[] input = { 33, 33, 19, 55, 53, 54, 11 };
		Assignment_60 assignment_60 = new Assignment_60();
		int ans = assignment_60.getSecondMaxxNoFromArray(input);
		System.out.println("The second maximum number from given array is : " + ans);
	}
}