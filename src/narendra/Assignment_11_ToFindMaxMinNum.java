package narendra;
/*
Assignment - 11 : 20th Nov'2024 [20 mins]

Write 2 methods, one method to find maximum number from 2 numbers,
other to find minimum number from given 2 numbers.
sample input :
num1 : 10
num2 : 17
output : 10 is smaller between 10 and 17.

sample input :
num1 : 10
num2 : 17
output : 17 is bigger between 10 and 17.
*/

public class Assignment_11_ToFindMaxMinNum {
	int maxNum;
	int minNum;
	
	void getMaxNum(int input1, int input2) {
		if(input1 > input2) {
			maxNum = input1;
			minNum = input2;
			System.out.println(maxNum + " is bigger between " + minNum + " and " + maxNum);
		}
		else {
			maxNum = input2;
			minNum = input1;
			System.out.println(maxNum + " is bigger between " + minNum + " and " + maxNum);
		}
				
	}	
	
	void getMinNum(int input1, int input2) {
		if(input1 < input2) {
			minNum = input1;
			maxNum = input2;
			System.out.println(minNum + " is smaller between " + minNum + " and " + maxNum);
		}
		else {
			minNum = input2;
			maxNum = input1;
			System.out.println(maxNum + " is smaller between " + minNum + " and " + maxNum);
		}
				
	}

	public static void main(String[] args) {
		Assignment_11_ToFindMaxMinNum findMinMaxNum = new Assignment_11_ToFindMaxMinNum();
		findMinMaxNum.getMaxNum(10, 17);
		findMinMaxNum.getMinNum(10, 17);

	}

}