package nitish;

import java.util.Arrays;

public class Challenge1 {
	
	void output(int[] input1) {
		int sum = 0;
		int[] output1 = new int[input1.length];
		
		for(int i =0;i<input1.length;i++) {
			sum = sum+input1[i];
		}
		
		for(int i=0;i<input1.length;i++) {
			output1[i]=sum-input1[i];
		}
		
		System.out.println("Output = "+Arrays.toString(output1));
		
	}

	public static void main(String[] args) {
		int[] input = {1,2,3,4,5};
		Challenge1 obj = new Challenge1();
		obj.output(input);

	}

}
