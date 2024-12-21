package reshma;
/* return the maximum number from given array. 

input : {44,45,22,25,47,29,46}
output : 47

input : {-44,-45,-22,-25,-47,-29,-46}
output : -22 */

public class Assignment49_returnMaxNum {	
		int getMaximumNum(int[] input) {
			int MaxNum = input[0];
			for (int index = 0; index < input.length; index++) {
				if (input[index] > MaxNum) {
					MaxNum = input[index];
				}
			}
			return MaxNum;
		}

		public static void main(String[] args) {
			Assignment49_returnMaxNum a49 = new Assignment49_returnMaxNum();
			int[] input1 = { 44, 45, 22, 25, 47, 29, 46 };
			int[] input2 = {-44,-45,-22,-25,-47,-29,-46};
			int num1 = a49.getMaximumNum(input1);
			System.out.println("The maximum number from given array are: " +num1);
			int num2 = a49.getMaximumNum(input2);
			System.out.println(num2);
			}
}
