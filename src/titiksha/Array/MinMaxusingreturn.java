package titiksha.Array;

public class MinMaxusingreturn {
	int[] getminMax(int[] arr) {
		int[] output=new int[2];// assigning 2 blocks to output array
		int maxNum = arr[0];
		int minNum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (minNum >arr[i]) {
				minNum = arr[i];
			}
		
			if (maxNum < arr[i]) {
				maxNum = arr[i];
			}
		}
		output[0]=minNum;//assigning min value to output array block 1
		output[1]=maxNum;//assigning min value to output array block 2
		return output;
	}
	

	public static void main(String[] args) {
		MinMaxusingreturn minMaxNum = new MinMaxusingreturn();
		int[] number = { 44, 45, 22, 25, 47, 29, 46 };
		int[] output1=minMaxNum.getminMax(number); //we took arary because we are return 2 values
		System.out.println("The minimum number is: "+output1[0]);//print value stored in block 1
		System.out.println("The maximum number is: "+output1[1]);}//print value stored in block 2

}


