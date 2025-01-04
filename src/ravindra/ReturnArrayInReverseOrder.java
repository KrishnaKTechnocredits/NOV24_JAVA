package ravindra;

import java.util.Arrays;

public class ReturnArrayInReverseOrder {
	int[] returnArrayInreverseOrder(int[] numbers) {
		int [] reverse=new int[numbers.length];
		for(int i=numbers.length-1,j=0;i>=0;i--,j++) {
			reverse[j]=numbers[i];
		}
		return reverse;
	}
	
	public static void main(String[] args) {
		int []input={10,34,22,16,19,99};
		ReturnArrayInReverseOrder returnArrayInReverseOrder=new ReturnArrayInReverseOrder();
		int[] retrunArray=returnArrayInReverseOrder.returnArrayInreverseOrder(input);
		for(int i=0;i<retrunArray.length;i++) {
			System.out.println(retrunArray[i]);
		}
		System.out.println();
		//or
		System.out.println(Arrays.toString(retrunArray));
	}
}
