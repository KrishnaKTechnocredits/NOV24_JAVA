package rushikesh.Programming_Test;

import java.util.Arrays;

public class Test1 {
	
	int getSumOfOtherElement(int[] input,int num) {
		int sum=0;
		for (int index=0;index<input.length;index++) {
			if (input[index]!=num) {
				sum=sum+input[index];
			}
		}
		return sum;
	}
	
	int[] getArrayInsameOrder(int[] input) {
		int[] output=new int[input.length];
		for (int index=0;index<input.length;index++) {
			int sum=getSumOfOtherElement(input,input[index]);
			output[index]=sum;
		}
		return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 test1=new Test1();
		int[] arr= {3, 5, 7, 1, 9};
		int[] output=test1.getArrayInsameOrder(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(output));
	}

}
