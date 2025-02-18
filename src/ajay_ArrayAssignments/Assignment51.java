package ajay_ArrayAssignments;

import java.util.Arrays;

public class Assignment51 {
	void getMinMax(int[] input) {

		int max = input[0];
		int min = input[0];
		for (int i = 1; i < input.length; i++){
			
			if (input[i]>max) {
				max=input[i];
				
			}
			if(input[i]<min) {
				min=input[i];
			}
			
		}
		
		int[] Output= {max,min};
		 System.out.println("Output Array for Max and Min Number is : "+Arrays.toString(Output));
	}

	public static void main(String[] args) {
		Assignment51 assignment51=new Assignment51();
		int[] input={44,45,22,25,47,29,46};
		assignment51.getMinMax(input);

	}

}
