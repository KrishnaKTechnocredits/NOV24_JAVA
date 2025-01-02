package reshma;

import java.util.Arrays;

/* return union of given two array.

input : 
{10,19,18}
{99,8}*/

public class Assignment55_UnionOfArray {
	int[] getUnionArray(int num1[],int num2[]) {
		int[] output = new int[num1.length+num2.length];
		int count=0;
		
		for(int i=0;i<num1.length;i++) {
			output[count]=num1[i];
			count++;
		}
		for(int k=0;k<num2.length;k++) {
			output[count]=num2[k];
			count++;
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment55_UnionOfArray assignment55 = new Assignment55_UnionOfArray();
		int[] num1 ={10,19,18};
		int[] num2 ={99,8};	
		int[] UnionOfArray=assignment55.getUnionArray(num1, num2);
		System.out.println(Arrays.toString(UnionOfArray));
		}
}
