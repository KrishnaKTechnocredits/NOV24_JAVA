/*Assignment - 60 : 21st Dec'2024 [20 min]
return second maximum number from given array.*/

package harshada.Array3;

public class SecondMaxNumFromArray {
	public static void main(String[] args) {
		SecondMaxNumFromArray s = new SecondMaxNumFromArray();
		int[] input = { 13, 22, 55, 23, 99, 60 };
		int secMaxNum = s.getSecMaxNumFromArray(input);
		System.out.println("Second maximum number from given array is " + secMaxNum);
	}

	int getSecMaxNumFromArray(int[] input) {
		int maxNum = input[0];
		int secMaxNum = input[1];

		if (maxNum < secMaxNum) {
			maxNum = input[1];
			secMaxNum = input[0];
		}

		//System.out.println(maxNum + " " + secMaxNum);

		for (int i = 2; i < input.length; i++) {
			if (maxNum < input[i]) {
				maxNum = input[i];
			} else if (secMaxNum < input[i]) {
				secMaxNum = input[i];
			}
		}
		return secMaxNum;
	}
}
