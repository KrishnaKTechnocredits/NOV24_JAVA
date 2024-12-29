package roshan.Array2;

public class ReturnSecondMaxNumFromArray {
	static int get2ndMaxNum(int[] number) {
		int maxNum = number[0];
		int SecondMaxNum = number[1];
		if (maxNum < SecondMaxNum) {
			SecondMaxNum = number[0];
			maxNum = number[1];
		}
			for (int i = 2; i < number.length; i++) {
				if (maxNum < number[i]) {
					SecondMaxNum = maxNum;
					maxNum = number[i];
				} else if (SecondMaxNum < number[i]) {
					SecondMaxNum = number[i];
				}

		}
		return SecondMaxNum;
	}

	public static void main(String[] args) {
		int[] number = { 33, 33, 19, 55, 53, 11 };
		ReturnSecondMaxNumFromArray returnsecondmaxnumfromarray = new ReturnSecondMaxNumFromArray();
		int result = returnsecondmaxnumfromarray.get2ndMaxNum (number);
		System.out.println("Secondmax number from array is : " + result);
		//System.out.println(ReturnSecondMaxNumFromArray.get2ndMaxNum(number));
	}

}

/*
 * Assignment - 60 : 21st Dec'2024 [20 min] return second maximum number from
 * given array.[IMP]
 * 
 * input = {33,33,19,55,53,11}; output : 53
 */