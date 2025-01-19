package reshma;
/* print maximum and minimum number from given array. 
input : {44,45,22,25,47,29,46}
output : 22
input : {-44,-45,-22,-25,-47,29,46}
output : -47 */

public class Assignment51_PrintMaxMinNum {
	void printMaxMinNum(int [] input) {
		int MaxNum = input[0];
		int MinNum = input[0];
		for(int index=0;index<input.length;index++) {
			if (input[index] > MaxNum) 
				MaxNum = input[index];
			
			if(input[index]<MinNum) 
				MinNum=input[index];
			}	
			System.out.println("The maximum number from given array is: " +MaxNum+ " && minimum number is: " +MinNum);
	}

	public static void main(String[] args) {
		Assignment51_PrintMaxMinNum a51 = new Assignment51_PrintMaxMinNum();
		int[] input = { 44, 45, 22, 25, 47, 29, 46 };
		int[] input2 = { -44, -45, -22, -25, -47, 29, 46 };
		a51.printMaxMinNum(input);
		a51.printMaxMinNum(input2);
		}
}
