package ajay_ArrayAssignments;

import java.util.Arrays;

public class Assignment52 {

		int[] getMinMax(int[] input) {

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
			
			return new int[]{max,min};
		}

		public static void main(String[] args) {
			Assignment52 assignment52=new Assignment52();
			int[] input={44,45,22,25,47,29,46};
			System.out.println("Array of Max Min Numbers from given Array is: "+Arrays.toString(assignment52.getMinMax(input)));

		}

}
