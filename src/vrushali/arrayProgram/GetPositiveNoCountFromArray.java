package vrushali.arrayProgram;

//Assignment - 48 : 15th Dec'2024 [15 mins]
//
//From given int array, return count of positive numbers.
//
//input : {10,30,-45,66,-10};
//output : 3  
public class GetPositiveNoCountFromArray {
	int getPositiveNoCountFromGivenArray(int[] numArray) {
		int count = 0;
		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] > 0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		GetPositiveNoCountFromArray getPositiveNoCountFromArray = new GetPositiveNoCountFromArray();
		int[] numArray = { 10, 30, -45, 66, -10 };
		int count = getPositiveNoCountFromArray.getPositiveNoCountFromGivenArray(numArray);
		System.out.println("Count Of Positive Number In Given Array is :--> " + count);
	}
}
