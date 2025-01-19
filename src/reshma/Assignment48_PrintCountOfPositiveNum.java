package reshma;
/* From given int array, return count of positive numbers.

input : {10,30,-45,66,-10};
output : 3 */

public class Assignment48_PrintCountOfPositiveNum {
	int getPositiveNum(int input[]) {
		int count = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] > 0) {
				count++;
				// System.out.println("Positive Number is " +input[index]);
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Assignment48_PrintCountOfPositiveNum a48 = new Assignment48_PrintCountOfPositiveNum();
		int input[] = { 10, 30, -45, 66, -10 };
		int countOfPositiveNum = a48.getPositiveNum(input);
		System.out.println("The count of positive Num from given input is " + countOfPositiveNum);
	}
}
