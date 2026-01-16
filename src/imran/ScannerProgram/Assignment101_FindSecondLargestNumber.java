/*
 Assignment - 101 : 1st Feb'2025
On user defined numbers, find out the second largetest number. 
Hint : Use scanner.
 */

package imran.ScannerProgram;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment101_FindSecondLargestNumber {

	void getSecondLargestNumber(int[] data)
	{
		int maxnum = data[0];
		int secondmaxNum = data[1];
		if(maxnum == secondmaxNum)
		{
			maxnum = data[1];
			secondmaxNum = data[2];
		}
		if(maxnum < secondmaxNum)
		{
			maxnum = secondmaxNum;
			secondmaxNum = data[0];
		}
		for(int i=2;i<data.length;i++)
		{
			int num = data[i];
			if(num > maxnum)
			{
				secondmaxNum = maxnum;
				maxnum = num;
			}
			else if(num > secondmaxNum)
			{
				secondmaxNum = num;
			}
		}
		
		System.out.println("The Second max Number is : " + secondmaxNum);
	}
	
	public static void main(String[] args) {
		Assignment101_FindSecondLargestNumber assignment101 = new Assignment101_FindSecondLargestNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of element to be inserted as indexValue");
		int index = sc.nextInt();
		int[] arr = new int[index];
		for(int i =0;i<index; i++)
		{
			System.out.println("Enter number to get Second max number");
			arr[i] = sc.nextInt();
		}
		System.out.println("The number given are as followes : " + Arrays.toString(arr));
		assignment101.getSecondLargestNumber(arr);
	}

}
