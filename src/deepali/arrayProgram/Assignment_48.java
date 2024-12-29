package deepali.arrayProgram;

/*From given int array, return count of positive numbers.

input : {10,30,-45,66,-10};
output : 3
*/
public class Assignment_48 {

	public static void main(String[] args) {
		int count = 0;
		int[] number = { 10, 30, -45, 66, -10 };
		for (int index = 0; index < number.length; index++) {
			if (number[index] > 0)
				count++;
		}
		System.out.println("Return count of possitive numbers : "+ count);
	}
}
