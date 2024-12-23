package ravindra;

import java.util.Arrays;

public class ReturnUnionOfTwoArray {
	int[] returnUnionOfTwoArray(int []input1,int []input2) {
		int count=0;
		int [] union=new int [input1.length+input2.length];
		for(int i=0;i<input1.length;i++) {
			union[count]=input1[i];
			count++;
		}
		for(int i=0;i<input2.length;i++) {
			union[count]=input2[i];
			count++;
		}
		return union;
	}
	public static void main(String[] args) {
		int[] input1={10,19,18};
		int[]input2={99,8};
		ReturnUnionOfTwoArray returnUnionOfTwoArray=new ReturnUnionOfTwoArray();
		int[] union=returnUnionOfTwoArray.returnUnionOfTwoArray(input1, input2);
		System.out.println(Arrays.toString(union));
	}
}
