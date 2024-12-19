/*
 * Assignment - 53 : 16th Dec'2024 [5-7 mins]

return the array in reverse order. 

input : {10,34,22,16,19,99}
output : 99
         19
		 16
		 22
		 34
		 10
 */
package rohan;

public class Assignment_54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_54 assignment = new Assignment_54();
		int [] input = {10,34,22,16,19,99};
		int[] result =assignment.main(input);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
	}
	int[] main(int[] input) {
		
		int [] output = new int[input.length];
		for(int i=0;i<input.length;i++) {
			output[i]= input[input.length-1-i];
		}
	return output;
	}

}
