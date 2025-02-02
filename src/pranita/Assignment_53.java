package pranita;

class Assignment_53 {

	void printArrayInReverse(int[] input) {
		System.out.println("Array in reverse is as below: ");
		int[] output = new int[input.length];
		for (int i=input.length-1 , j=0; i>=0; i--,j++) {
			output[j] = input[i];
			System.out.println(output[j]);
		}
		
	}

	public static void main(String[] args) {
		Assignment_53 assignment_53 = new Assignment_53();
		int[] input = {10,34,22,16,19,99};
		assignment_53.printArrayInReverse(input);
	}
}