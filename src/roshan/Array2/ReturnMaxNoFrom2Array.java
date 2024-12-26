package roshan.Array2;

import java.util.Arrays;


public class ReturnMaxNoFrom2Array {
  int [] getMaxValueFromTwoArray(int [] num1, int [] num2) {
	 int [] output = new int [num1.length];
	  int count=0;
	  for(int i=0;i<num1.length;i++) {  // in condition i have used "i and j" which is not require As i is use to count length of array only
		  
		  if(num1[i]>num2[i]) {
			 
			output [count]  = num1[i];
		  }
		  else
		  {
			  output[count] =num2[i]; // here j is used which is not require
		  }
		  if (count==5) {
			  break;
		  }
		  else {
		  count++;
	  }
	  }
	  return output;
  }
  public static void main(String[] args) {
	int [] num1 =  {10,55,22,77,88};
	int [] num2 =  {5,102,28,77,18};
	ReturnMaxNoFrom2Array returnmaxnofrom2array = new ReturnMaxNoFrom2Array ();
	int [] result = returnmaxnofrom2array.getMaxValueFromTwoArray(num1,num2);
	 //for(int i=0;i<result.length;i++) {
	 //System.out.println(result[i]);
	System.out.println("Input Array 1 is : " + Arrays.toString(num1));
	System.out.println("Input Array 2 is : " + Arrays.toString(num2));
	System.out.println("Max num from two array is : " + Arrays.toString(result)); //without for loop
	}
	
}
  
	




/*
 * Assignment - 56 : 20th Dec'2024 [15 mins] Return the array having maximum
 * number from each index of given two array.
 * 
 * input : {10,55,22,77,88} {5,102,28,77,18}
 * 
 * output : [10,102,28,77,88]
 * 
 * NOTE : Use sop(Arrays.toString(output)) to print the array without for loop
 */