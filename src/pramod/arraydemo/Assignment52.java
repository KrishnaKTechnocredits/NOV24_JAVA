/*
Assignment - 52 : 16th Dec'2024 [15 mins] [14 mins]

return maximum and minimum number from given array.

int getMaxMinNum(int[] arr){
	
} 
*/
package pramod.arraydemo;

class Assignment52 {
	
	int[] getMaxMinNum(int[] input1) {
		int[] output = new int[2];
		int maxNum = input1[0], minNum = input1[0];
		for (int i = 1 ; i<input1.length; i++) {
			if(maxNum<input1[i]) {
				maxNum = input1[i];
			}
			if(minNum>input1[i]) {
				minNum = input1[i];
			}
		}
		output[0] = maxNum;
		output[1] = minNum;
		return output;	
	}
	
	public static void main(String[] args) {
		Assignment52 A52= new Assignment52();
		int[] input1 = {44,45,22,25,47,29,46};		
		int[] output = A52.getMaxMinNum(input1);
		System.out.println("Maximum number from given array is: " + output[0] + " and Minimum number is: " + output[1]);
	}	
}