package Assignment_Array;

public class Assignment54 {
	
	int[] getReverseOrderArray(int[] input) {
		int[] reversedOrderArray = new int[input.length];
		for(int i = input.length-1;i>=0;i--) {
			reversedOrderArray[i] = input[input.length - 1 - i];
		}
		return reversedOrderArray;
	}

	public static void main(String[] args) {
		int[] num = {10,34,22,16,19,99};
		int[] output = new Assignment54().getReverseOrderArray(num);
		for(int i = 0;i<output.length;i++) {
			System.out.println(output[i]);
		}
	}
}
