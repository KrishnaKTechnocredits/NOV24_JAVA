package reshma;
/* return maximum and minimum number from given array.
input : {44,45,22,25,47,29,46}
output :47, 22 */

public class Assignment52_returnMaxMinNum {
	int getMaxNum(int[] input) {
		int MaxNum = input[0];
		for (int index = 0; index < input.length; index++) {
			if (input[index] > MaxNum) {
				MaxNum = input[index];
			}
		}
		return MaxNum;
	}
	
	int getMinNum(int [] input) {
		int MinNum=input[0];
		for(int index=0;index<input.length;index++) {
			if(input[index]<MinNum) {
				MinNum=input[index];
			}
		}
		return MinNum;
	}
	
	public static void main(String[] args) {
		Assignment52_returnMaxMinNum a52=new Assignment52_returnMaxMinNum();
		int [] input={44,45,22,25,47,29,46};		
		int num1 =a52.getMaxNum(input);
		int num2 =a52.getMinNum(input);		
		System.out.println("The maximum number from given array is: " +num1+ " && minimum number is: " +num2);
		}
}
