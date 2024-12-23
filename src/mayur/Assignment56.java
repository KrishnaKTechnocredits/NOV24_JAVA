/*
 * Assignment - 56 : 20th Dec'2024 [15 mins]
Return the array having maximum number from each index of given two array.

input : 
{10,55,22,77,88}
{5,102,28,77,18}

output : [10,102,28,77,88]

NOTE : Use sop(Arrays.toString(output)) to print the array without for loop
 */


package mayur;

import java.util.Arrays;

public class Assignment56 {
	
	int[] getArrayOfMaxNum(int[]num1, int[]num2) {
		int[] temp = new int[num1.length];
		if (num1.length == num2.length) {
			for(int i = 0; i < num1.length;i++) {
				if (num1[i] > num2[i]) {
					temp[i]=num1[i];
				}else if(num1[i] < num2[i]) {
					temp[i]=num2[i];
				}else {
					temp[i]=num1[i];
				}
			}
		}
		return temp;
	}
	
	public static void main(String[] args) {
		int[] num1 = {10,55,22,77,88};
		int[] num2 = {5,102,28,77,18};
		
		Assignment56 obj = new Assignment56();		
		int [] num = obj.getArrayOfMaxNum(num1, num2);
		System.out.println(Arrays.toString(num));		
	}
}
