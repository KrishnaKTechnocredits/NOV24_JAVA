package siddharth;

/*
Assignment - 51 : 16th Dec'2024 [15 mins]
print maximum and minimum number from given array. 

void findMaxMin(int[] arr){
	int maxNum=arr[0], minNum=arr[0];
} 
 */

public class Assignment51 {

	void printMaxMin(int[] arr) {
		int maxNum=arr[0];
		int minNum=arr[0];
		for(int index=1;index<arr.length;index++) {
			if(maxNum<arr[index]) {
				maxNum=arr[index];
			}else if(minNum>arr[index]) {
				minNum=arr[index];
			}
		}
		System.out.println("Maximum number is : "+maxNum);
		System.out.println("Minimum number is : "+minNum);
	}
	
	public static void main(String[] args) {
		Assignment51 assignment51 = new Assignment51();
		int[] input={44,45,22,25,47,29,46};
		assignment51.printMaxMin(input);
	}
}
