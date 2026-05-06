
 //Assignment - 72 : 6th Jan'2024
//
//Shift all the zeros at the end of an array.
//
//int[] arr = {5,0,22,44,0,0,55,0,12,19};
//output : {5,22,44,55,12,19,0,0,0,0}
 


package pratiksha;

import java.util.Arrays;
/*
 Assignment - 72 : 6th Jan'2024

Shift all the zeros at the end of an array.

int[] arr = {5,0,22,44,0,0,55,0,12,19};
output : {5,22,44,55,12,19,0,0,0,0}

Assignment - 73 : 6th Jan'2024

Shift all the zeros at the begining of an array.

int[] arr = {5,0,22,44,0,0,55,0,12,19};
output : {0,0,0,0,5,22,44,55,12,19}
 */
public class Assignment72 {
	

	
		int[] getZeroAtEnd(int[] array) {
			int[] array1= new int[array.length];
			for (int i=0,j=0;i<array.length;i++) {
				if(array[i]!=0) {
					array1[j]=array[i];
					j++;
				}
			}
			return array1;
		}
		
		public static void main(String[] args) {
			int[] arr = {5,0,22,44,0,0,55,0,12,19};
			System.out.println("Input: "+Arrays.toString(arr));
			Assignment72 assignment72=new Assignment72();
			System.out.println("Output array: "+Arrays.toString(assignment72.getZeroAtEnd(arr)));
		}
	}


