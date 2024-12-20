package siddharth;

/*Assignment - 52 : 16th Dec'2024 [15 mins]

return maximum and minimum number from given array.

int getMaxMinNum(int[] arr){	
} 
*/

public class Assignment52 {
	
	int[] getMaxMinNum(int[] arr) {
		int output[] = new int[2];
		int maxNum=arr[0];
		int minNum=arr[0];
		for(int index=0;index<arr.length;index++) {
			if(maxNum<arr[index]) {
				maxNum=arr[index];
			}
			if(minNum>arr[index]) {
				minNum=arr[index];
			}
		}
		output[0]=maxNum;
		output[1]=minNum;
		return output;
	}
	
	public static void main(String[] args) {
		Assignment52 assignment52 = new Assignment52();
		int[] input = {44,45,22,25,47,29,46};
		int[] number = assignment52.getMaxMinNum(input);
		System.out.println("Max number is "+number[0]);
		System.out.println("Min number is "+number[1]);
	}
}
