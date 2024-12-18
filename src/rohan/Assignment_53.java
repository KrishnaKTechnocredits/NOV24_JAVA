/*
 * Assignment - 53 : 16th Dec'2024 [5-7 mins]

print the array in reverse order. 

input : {10,34,22,16,19,99}
output : 99
         19
		 16
		 22
		 34
		 10
 */
package rohan;

public class Assignment_53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_53 assignment = new Assignment_53();
		assignment.main();
		
	}
	void main() {
		int [] input = {10,34,22,16,19,99};
		int [] output = new int[input.length];
		for(int i=0;i<input.length;i++) {
			output[i]= input[input.length-1-i];
			System.out.println(output[i]);
		}
	
	}

}
