package vrushali.arrayProgram;

//Assignment - 49 : 16th Dec'2024 [15 mins] [imp]
//
//return the maximum number from given array. 
//
//input : {44,45,22,25,47,29,46}
//output : 47
//
//input : {-44,-45,-22,-25,-47,-29,-46}
//output : -22

public class ReturnMaxNoFromArray {

	int returnMaxNumberFromArray(int[] numArray) {
		int maxNo = numArray[0];
		for (int i = 0; i < numArray.length; i++) {
			if (maxNo < numArray[i]) {
				maxNo = numArray[i];
			}
		}
		return maxNo;
	}

	public static void main(String[] args) {
		int[] numArray1 = { 44, 45, 22, 25, 47, 29, 46 };
		int[] numArray2 = { -44, -45, -22, -25, -47, -29, -46 };
		int maxNo = 0;
		ReturnMaxNoFromArray returnMaxNoFromArray = new ReturnMaxNoFromArray();
		maxNo = returnMaxNoFromArray.returnMaxNumberFromArray(numArray1);
		System.out.println("Maximum Number From Array1 iS :--> " + maxNo);
		maxNo = returnMaxNoFromArray.returnMaxNumberFromArray(numArray2);
		System.out.println("Maximum Number From Array2 iS :--> " + maxNo);
	}
}
