/*Assignment - 101 : 1st Feb'2025
On user defined numbers, find out the second largest number. 
Hint : Use scanner.
*/

package pramod.collection;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment101 {
	
	void findSecondMaxNumber(int[] arr) {
		int maxNum = arr[0];
		int secondMax=0;
		for(int i=1;i<arr.length;i++) {
			if(maxNum<arr[i]) {
				secondMax=maxNum;
				maxNum=arr[i];
			}if(secondMax<arr[i]&&maxNum>arr[i]) {
				secondMax=arr[i];
			}
		}
		System.out.println("Second higesht number is: "+secondMax);
	}

	public static void main(String[] args) {
		System.out.println("Please enter the size of array: ");
		Scanner sc= new Scanner(System.in);
		int arrLength=sc.nextInt();
		int[] arr=new int[arrLength];
		System.out.println("Enter the numbers from which you want max: ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Given array is: "+Arrays.toString(arr));
		
		new Assignment101().findSecondMaxNumber(arr);
		sc.close();
		
	}
		
}
