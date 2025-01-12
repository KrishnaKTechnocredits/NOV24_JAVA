package vrushali.arrayProgram;
//Assignment - 51 : 16th Dec'2024 [15 mins]

//
//print maximum and minimum number from given array. 
//
//void findMaxMin(int[] arr){
//	int maxNum=arr[0], minNum=arr[0];
//} 

public class PrintMaxAndMinNoFromArray {
	void printMaxMinNumberFromArray(int[] numArray) {
		int minNo = numArray[0], maxNo = numArray[0];
		for (int i = 0; i < numArray.length; i++) {
			if (minNo > numArray[i]) {
				minNo = numArray[i];
			}
		}
		System.out.println("Minimum Number From Array:--> " + minNo);

		for (int i = 0; i < numArray.length; i++) {
			if (maxNo < numArray[i]) {
				maxNo = numArray[i];
			}
		}
		System.out.println("Maximum Number From Array:--> " + maxNo);
	}

	public static void main(String[] args) {
		PrintMaxAndMinNoFromArray printMaxAndMinNoFromArray = new PrintMaxAndMinNoFromArray();

		int[] numArray1 = { 44, 45, 22, 25, 47, 29, 46 };
		printMaxAndMinNoFromArray.printMaxMinNumberFromArray(numArray1);
	}
}
