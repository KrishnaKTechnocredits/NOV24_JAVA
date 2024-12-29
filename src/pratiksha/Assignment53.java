package pratiksha;

public class Assignment53 {
/*
 Assignment - 53 : 16th Dec'2024 [5-7 mins]

print the array in reverse order. 

input : {10,34,22,16,19,99}
output : 99
         19
		 16
		 22
		 34
		 10
 
 */
	void printReverseNum(int[] input) {
		int[] output = new int[input.length];
		for (int i = input.length - 1, j = 0; i >= 0; i--, j++) {
			output[j] = input[i];
			System.out.println(output[j]);
		}
	}

	public static void main(String[] args) {
		Assignment53 assign53 = new Assignment53();
		int[] digit = { 10, 34, 22, 16, 19, 99 };
		assign53.printReverseNum(digit);
}
}
