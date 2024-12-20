/*
Assignment - 51 : 16th Dec'2024 [15 mins] [8 Mins]

print maximum and minimum number from given array. 

void findMaxMin(int[] arr){
	int maxNum=arr[0], minNum=arr[0];
} 
*/
package pramod.arraydemo;

class Assignment51 {
	
	void printMinMax(int[] input1) {
		int maxNum=input1[0] , minNum=input1[0];
		for (int i=1; i<input1.length; i++) {
			if (maxNum<input1[i]) {
				maxNum = input1[i];
			}
			if (minNum>input1[i]) {
				minNum = input1[i];
			}
		}
		System.out.println("Maximum number from given array is : " + maxNum + " and Minimum number is : " + minNum);
	}

	public static void main(String[] args) {
		Assignment51 A51 = new Assignment51();
		int[] input1 = {44,45,22,25,47,29,46};
		int[] input2 = {-44,-45,-22,-25,-47,29,46};
		A51.printMinMax(input1);
		A51.printMinMax(input2);
	}
}