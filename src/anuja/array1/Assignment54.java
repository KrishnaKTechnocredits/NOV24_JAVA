package anuja.array1;
/*
return the array in reverse order , not single element return entire array. 

input : {10,34,22,16,19,99}
*/
public class Assignment54 {
	public int[] returnReverseArray(int[] input) {
		int[] output = new int[input.length];
		for(int i=input.length -1, j=0 ; i>= 0; i--, j++) {
			output[j] = input[i];
		}
		return output;
	}
	
	public static void main(String[] args) {
		Assignment54 assignment54 = new Assignment54();
		
		int[] input = {10,34,22,16,19,99};
		int [] output = assignment54.returnReverseArray(input);
		System.out.println("input array is: ");
		for(int i = 0 ; i<input.length ; i++) {
			System.out.print(input[i] +",");
		}
		System.out.println("\n");
		System.out.println("Output array which is a reverse of input: ");
		for(int j = 0 ; j<output.length ; j++) {
			System.out.print(output[j] +",");
		}
		
	}
}
