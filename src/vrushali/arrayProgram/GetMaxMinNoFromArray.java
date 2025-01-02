package vrushali.arrayProgram;
//Assignment Number :-52
//return maximum and minimum number from given array.
//
//int getMaxMinNum(int[] arr){
//	
//} 

public class GetMaxMinNoFromArray {

	int[] getMaxMinNum(int[] numArray) {
		int[] maxMinArray = new int[2];
		int maxNum = 0, minNum = 0;
		maxNum = numArray[0];
		minNum = numArray[0];

		for (int i = 0; i < numArray.length; i++) {
			if (maxNum < numArray[i]) {
				maxNum = numArray[i];
			}

			if (minNum > numArray[i]) {
				minNum = numArray[i];
			}
		}
		maxMinArray[0] = maxNum;
		maxMinArray[1] = minNum;
		return maxMinArray;
	}

	public static void main(String[] args) {

		int[] numArray = { 44, 45, 22, 25, 47, 29, 46 };
		GetMaxMinNoFromArray getMaxMinNoFromArray = new GetMaxMinNoFromArray();
		int[] maxMinArray = getMaxMinNoFromArray.getMaxMinNum(numArray);
		System.out.println("Maximum Number From Array:--> " + maxMinArray[0]);
		System.out.println("Minimum Number From Array:--> " + maxMinArray[1]);
	}
}
